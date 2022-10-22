package H6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Cloneable, Serializable {

    private static final long serialVersionUID = 4455666L;

    private String name;
    private int age;
    private Photo photo;

    public Resume(String name, int age, Photo photo) {
        super();
        this.name = name;
        this.age = age;
        this.photo = photo;
    }


    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    @Override
    public String toString() {
        return "Resume [name=" + name + ", age=" + age + ", photo=" + photo.toString() + "]";
    }

    public Resume clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO: handle exception
            System.err.println("Not supported clonerable");
            ;
        }
        return (Resume) obj;
    }

    public Resume deepclone() {
        Object obj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            obj = ois.readObject();
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return (Resume) obj;
    }
}

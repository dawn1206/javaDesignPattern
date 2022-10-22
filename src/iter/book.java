package iter;

public class book {
    String color;
    String Name;

    public book(String c, String n)
    {
        this.color = c;
        this.Name = n;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return Name;
    }
}

package home4.h2;

public abstract class Itool {
    Itool itool = null;
    String content = null;
    Itool(){}
    Itool(Itool itool1)
    {
        this.itool = itool1;
        this.content = itool1.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public abstract void genHeader();

    public abstract void genTail();
}

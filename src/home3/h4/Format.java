package home3.h4;

public abstract class Format {
    lvjing lvjing;

    public void setLvjing(lvjing lvjing) {
        this.lvjing = lvjing;
    }

    public void process()
    {
        this.lvjing.process();
    }
}

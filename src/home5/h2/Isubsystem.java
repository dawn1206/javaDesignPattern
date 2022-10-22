package home5.h2;

public abstract class Isubsystem {
    protected SystemMediator systemMediator;

    public Isubsystem(SystemMediator systemMediator) {
        this.systemMediator = systemMediator;
    }

    public abstract void getNoticed(String data);

    public void notice(String data)
    {
        this.systemMediator.notice(this,data);
    }
}

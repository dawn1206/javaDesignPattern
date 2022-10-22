package H3;

public abstract class AbstractTool {
    public final void procedure1(){}
    public final void procedure2(){}
    public final void procedure4(){}

    public abstract void procedure3();

    public final void doSomething()
    {
        this.procedure1();
        this.procedure2();
        this.procedure3();
        this.procedure4();
    }
}

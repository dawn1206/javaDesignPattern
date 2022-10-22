package home5.h2;

public class travalCompanySubsystem extends Isubsystem{
    public travalCompanySubsystem(SystemMediator systemMediator) {
        super(systemMediator);
    }

    @Override
    public void getNoticed(String data) {
        System.out.println("travalCompanySubsystem got notice");
    }
}

package home5.h2;

public class AirportSubsystem extends Isubsystem{

    @Override
    public void getNoticed(String data) {
        System.out.println("AirportSubsystem got notice");
    }

    public AirportSubsystem(SystemMediator systemMediator) {
        super(systemMediator);
    }

}

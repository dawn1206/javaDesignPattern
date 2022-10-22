package home5.h2;

public class HotelSubsystem extends Isubsystem{
    public HotelSubsystem(SystemMediator systemMediator) {
        super(systemMediator);
    }

    @Override
    public void getNoticed(String data) {
        System.out.println("HotelSubsystem got notice");
    }
}

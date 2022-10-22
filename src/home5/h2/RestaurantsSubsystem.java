package home5.h2;

public class RestaurantsSubsystem extends Isubsystem{
    public RestaurantsSubsystem(SystemMediator systemMediator) {
        super(systemMediator);
    }

    @Override
    public void getNoticed(String data) {
        System.out.println("RestaurantsSubsystem got notice");
    }
}

package home5.h2;

public class TourismAttractionsSubsystem extends Isubsystem{


    public TourismAttractionsSubsystem(SystemMediator systemMediator) {
        super(systemMediator);
    }

    @Override
    public void getNoticed(String data) {
        System.out.println("TourismAttractionsSubsystem got notice");
    }
}

package home5.h2;

public class concreteSystem extends SystemMediator{

    public void notice(Isubsystem isubsystem , String data)
    {
        this.airportSubsystem.getNoticed(data);
        this.hotelSubsystem.getNoticed(data);
        this.restaurantsSubsystem.getNoticed(data);
        this.travalCompanySubsystem.getNoticed(data);
        this.tourismAttractionsSubsystem.getNoticed(data);
    }
}

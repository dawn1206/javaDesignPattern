package home5.h2;

public abstract class SystemMediator {
    protected AirportSubsystem airportSubsystem;
    protected  HotelSubsystem hotelSubsystem;
    protected  RestaurantsSubsystem restaurantsSubsystem;
    protected TourismAttractionsSubsystem tourismAttractionsSubsystem;
    protected travalCompanySubsystem travalCompanySubsystem;

    public void setAirportSubsystem(AirportSubsystem airportSubsystem) {
        this.airportSubsystem = airportSubsystem;
    }

    public void setHotelSubsystem(HotelSubsystem hotelSubsystem) {
        this.hotelSubsystem = hotelSubsystem;
    }

    public void setRestaurantsSubsystem(RestaurantsSubsystem restaurantsSubsystem) {
        this.restaurantsSubsystem = restaurantsSubsystem;
    }

    public void setTourismAttractionsSubsystem(TourismAttractionsSubsystem tourismAttractionsSubsystem) {
        this.tourismAttractionsSubsystem = tourismAttractionsSubsystem;
    }

    public void setTravalCompanySubsystem(home5.h2.travalCompanySubsystem travalCompanySubsystem) {
        this.travalCompanySubsystem = travalCompanySubsystem;
    }
    public abstract void notice(Isubsystem isubsystem , String data);
}

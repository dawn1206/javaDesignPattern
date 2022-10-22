package home5.h2;

public class client {
    public static void main(String[] args) {
        concreteSystem system = new concreteSystem();
        AirportSubsystem airportSubsystem = new AirportSubsystem(system);
        HotelSubsystem hotelSubsystem = new HotelSubsystem(system);
        RestaurantsSubsystem restaurantsSubsystem = new RestaurantsSubsystem(system);
        TourismAttractionsSubsystem tourismAttractionsSubsystem = new TourismAttractionsSubsystem(system);
        travalCompanySubsystem travalCompanySubsystem = new travalCompanySubsystem(system);

        system.setAirportSubsystem(airportSubsystem);
        system.setHotelSubsystem(hotelSubsystem);
        system.setRestaurantsSubsystem(restaurantsSubsystem);
        system.setTourismAttractionsSubsystem(tourismAttractionsSubsystem);
        system.setTravalCompanySubsystem(travalCompanySubsystem);

        airportSubsystem.notice("aaaaa");

    }
}

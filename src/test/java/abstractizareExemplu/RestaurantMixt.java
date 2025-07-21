package abstractizareExemplu;

public class RestaurantMixt extends Restaurant implements RestaurantVeganInterface, RestaurantNonVeganInterface{

    public RestaurantMixt(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void meniu() {

    }

    @Override
    public void serviceBurger() {

    }

    @Override
    public void serviceHummus() {

    }
}

package abstractizareExemplu;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInterface {

    public RestaurantVegan(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void meniu() {
        System.out.println("Tipul meniului este vegan");
    }

    @Override
    public void serviceBurger() {
        System.out.println("La acest restaurant se serveste burger vegan");
    }

    @Override
    public void serviceHummus() {
        System.out.println("La restaurantul vegan este cel mai bun hummus");
    }


}

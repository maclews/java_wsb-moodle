package wsb.moodle.devices;

public class Electric extends Car {
    public Electric(String manufacturer, String model, Integer yearOfProduction, Integer displacement, Integer enginePower, Double price) {
        super(manufacturer, model, yearOfProduction, displacement, enginePower, price);
    }

    public void Refuel() {
        System.out.println("Chaaaaaaaaaaaaaargiiiiiiiiiiiiiiiiiiiiiing... Come back in three days or something...");
    }
}

package wsb.moodle.devices;

import wsb.moodle.Human;
import wsb.moodle.Sellable;

public abstract class Car extends Device implements Sellable {
    Integer displacement;
    Integer enginePower;
    public Double price;

    public Car(String manufacturer, String model, Integer yearOfProduction, Integer displacement, Integer enginePower, Double price) {
        super(manufacturer, model, yearOfProduction);
        this.displacement = displacement;
        this.enginePower = enginePower;
        this.price = price;
    }

    public abstract void Refuel();

    public void TurnOn() {
        System.out.println("Słychać piękne wycie trzycilindrowej osiemsetki. No bo nie ma na świecie nic lepszego niż odpalana z samego rana Ticomotywa...");
    }

    public void Sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.recieveVehicle(seller.getVehicle());
            seller.unsetVehicle();
            System.out.println("Pojazd został sprzedany nowemu właścicielowi.");
        } else {
            System.out.println("Za mało siana.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "displacement=" + displacement +
                ", enginePower=" + enginePower +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

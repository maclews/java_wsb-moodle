package wsb.moodle.devices;

import wsb.moodle.Human;

public class Phone extends Device {
    public Phone(String manufacturer, String model, Integer yearOfProduction) {
        super(manufacturer, model, yearOfProduction);
    }

    public void TurnOn() {
        System.out.println("Się włączyło. Chyba... bo zawibrowało. Ale dalej ciemno. (...) O! Teraz coś widać!");
    }

    public void Sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.tel = seller.tel;
            seller.tel = null;
            System.out.println("Telefon został sprzedany nowemu właścicielowi.");
        } else {
            System.out.println("Za mało siana.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

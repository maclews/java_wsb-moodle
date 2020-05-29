package wsb.moodle.devices;

public class Phone extends Device {
    public Phone(String manufacturer, String model, Integer yearOfProduction) {
        super(manufacturer, model, yearOfProduction);
    }

    public void TurnOn() {
        System.out.println("Się włączyło. Chyba... bo zawibrowało. Ale dalej ciemno. (...) O! Teraz coś widać!");
    }
}

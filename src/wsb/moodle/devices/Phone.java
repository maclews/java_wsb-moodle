package wsb.moodle.devices;

import wsb.moodle.Human;
import java.net.URL;

public class Phone extends Device {
    static final String defaultAppServerName = "www.example.com";
    static final String defaultAppServerProtocol = "https";
    static final String defaultAppServerVersion = "1.0";

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

    public void InstallApp(String appName) {}
    public void InstallApp(String appName, String appVersion) {}
    public void InstallApp(String appName, String appVersion, String serverAddr) {}
    public void InstallApp(String[] appNameList) {}
    public void InstallApp(URL urlToApp) {}

    @Override
    public String toString() {
        return super.toString();
    }
}

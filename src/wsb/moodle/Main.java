package wsb.moodle;

import wsb.moodle.creatures.Pet;
import wsb.moodle.devices.LPG;
import wsb.moodle.devices.Diesel;
import wsb.moodle.devices.Electric;
import wsb.moodle.devices.Phone;

import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

	    Human me = new Human();

	    me.firstName = "Maciej";
	    me.lastName = "Lewandowski";
	    me.pet = new Pet("dog");

        me.pet.Feed();
        me.pet.takeForAWalk();
        me.pet.Feed();
        me.pet.takeForAWalk();
        me.pet.Feed();
        me.pet.takeForAWalk();
        me.pet.Feed();
        me.pet.Feed();
        me.pet.Feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.Feed();
        me.pet.Feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.Feed();
        me.pet.takeForAWalk();

        LPG ticomotywa = new LPG("Daewoo", "Tico", 1999, 796, 41, 4206.9);
        me.setVehicle(ticomotywa);

        LPG ticomotywa2 = new LPG("Daewoo", "Tico", 1999, 796, 41, 4206.9);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(ticomotywa == ticomotywa2);
        System.out.println(ticomotywa);
        System.out.println(ticomotywa2);
        System.out.println(me.pet);

        Phone brick = new Phone("Szajsung", "Galaksy Be-pińć", 2012);

        ticomotywa.TurnOn();
        brick.TurnOn();

        System.out.println(ticomotywa.toString());
        System.out.println(brick.toString());

        Human notMe = new Human();

        me.cash = 10000.0;
        notMe.cash = 20000.0;

        me.pet.Sell(me, notMe, 500.0);
        System.out.println(me.cash + " -- " + notMe.cash);

        me.getVehicle().Sell(me, notMe, 2000.0);
        System.out.println(me.cash + " -- " + notMe.cash);

        me.tel = brick;
        me.tel.Sell(me, notMe, 1500.0);
        System.out.println(me.cash + " -- " + notMe.cash);

        Electric tesla = new Electric("Tesla", "Model S", 2018, 0, 613, 50000.0);
        Diesel passat = new Diesel("Wieśwagen", "Pastuch", 1998, 1900, 90, 500.0);

        notMe.getVehicle().Refuel();
        me.recieveVehicle(tesla);
        me.getVehicle().Refuel();
        me.recieveVehicle(passat);
        me.getVehicle().Refuel();

    }
}

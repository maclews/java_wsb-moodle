package wsb.moodle;

import wsb.moodle.devices.Car;
import wsb.moodle.devices.Phone;

import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

	    Human me = new Human();

	    me.firstName = "Maciej";
	    me.lastName = "Lewandowski";
	    me.pet = new Animal("dog");

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();

        Car ticomotywa = new Car("Daewoo", "Tico", 1999, 796, 41, 4206.9);
        me.setVehicle(ticomotywa);

        Car ticomotywa2 = new Car("Daewoo", "Tico", 1999, 796, 41, 4206.9);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(ticomotywa == ticomotywa2);
        System.out.println(ticomotywa);
        System.out.println(ticomotywa2);
        System.out.println(me.pet);

        Phone brick = new Phone("Szajsung", "Galaksy Be-pińć", 2012);

        ticomotywa.TurnOn();
        brick.TurnOn();
    }
}

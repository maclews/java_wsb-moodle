package wsb.moodle.creatures;

import wsb.moodle.Human;
import wsb.moodle.Sellable;

public abstract class Animal implements Sellable, Feedable {
    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = 10.0;
                break;
            case "cat":
                this.weight = 5.0;
                break;
            case "myszojeleń":
                this.weight = 2.5;
                break;
            default:
                this.weight = 1.0;
                break;
        }
    }

    private boolean isAlive() {
        return this.weight > 0;
    }

    public void Feed() {
        if (isAlive()) {
            this.weight++;
            System.out.println("Fed. Weight increased to " + this.weight + " kg");
        }
        else System.out.println("Better check Yellow Pages for a Necromancer or something...");
    }

    public void Feed(Double foodWeight) {
        if (isAlive()) {
            this.weight += foodWeight;
            System.out.println("Fed. Weight increased to " + this.weight + " kg");
        }
        else System.out.println("Better check Yellow Pages for a Necromancer or something...");
    }

    public void takeForAWalk() {
        if (isAlive()) {
            this.weight--;
            System.out.println("They see me rollin', they hatin', cuz my weight got down to " + this.weight + " kg");
        }
        else System.out.println("Erm... Dragging a not-very-alive body is not necessarily \"taking for a walk\" you know...");
    }

    public void Sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Zwierzę zostało sprzedane nowemu właścicielowi.");
        } else {
            System.out.println("Za mało siana.");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}

package wsb.moodle.devices;

public abstract class Device {
    final String manufacturer;
    final String model;
    final Integer yearOfProduction;

    protected Device(String manufacturer, String model, Integer yearOfProduction) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void TurnOn();

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

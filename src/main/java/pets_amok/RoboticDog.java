package pets_amok;

public class RoboticDog extends RoboticPet {
    protected int batteryCharge;

    public RoboticDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.batteryCharge = 50;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    public void walkDog() {
        this.batteryCharge -= 10;
        this.happinessLevel += 10;
    }

}

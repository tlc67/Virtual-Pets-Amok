public class RoboticDog extends RoboticPet {

    public RoboticDog(String petName, String petDescription, int boredomLevel, int happinessLevel, int healthLevel) {
        super(petName, petDescription, boredomLevel, happinessLevel, healthLevel);

    }

    public void walkDog() {
        this.batteryCharge -= 10;
    }

}

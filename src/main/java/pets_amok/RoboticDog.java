package pets_amok;

public class RoboticDog extends RoboticPet {

    public RoboticDog(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public void walkDog() {
        this.happinessLevel += 10;
    }

}

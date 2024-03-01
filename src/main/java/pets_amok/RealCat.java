package pets_amok;

public class RealCat extends RealPet {

    public RealCat(String petName, String petDescription) {
        super(petName, petDescription);

    }

    @Override
    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
        if (this.hungerLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.thirstLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.boredomLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.happinessLevel < 25) {
            setHealthStatus(this.healthStatus -= 2);
        }

    }
}
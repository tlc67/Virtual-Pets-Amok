package pets_amok;

public abstract class RealPet extends VirtualPet {

    protected int hungerLevel;
    protected int thirstLevel;

    public RealPet(String petName, String petDescription) {
        super(petName, petDescription);

        this.hungerLevel = 50;
        this.thirstLevel = 50;
    }

    public int getHungerLevel() {
        return this.hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getThirstLevel() {
        return this.thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public void feedPet() {
        this.hungerLevel -= 10;
    }

    public void waterPet() {
        this.thirstLevel -= 10;
    }

    public void cleanDogCage() {
        this.happinessLevel += 10;
        System.out.println("The dogs are happy with a clean cage");
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void tick(int hungerLevel, int thirstLevel, int boredomLevel, int happinessLevel) {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
        if (this.hungerLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        }
        if (this.thirstLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        }
        if (this.boredomLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        }
        if (this.happinessLevel < 25) {
            setHealthStatus(this.healthStatus -= 2);
        }
    }

}
package pets_amok;

public class RealDog extends RealPet {

    protected int continenceLevel;
    protected int cageCleanlinessLevel;
    protected int cleanDogCage;

    public RealDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.continenceLevel = 50;
        this.cageCleanlinessLevel = 50;

    }

    public int getContinenceLevel() {
        return continenceLevel;
    }

    public void setContinenceLevel(int continenceLevel) {
        this.continenceLevel = continenceLevel;
    }

    public int getCageCleanlinessLevel() {
        return cageCleanlinessLevel;
    }

    public void setCageCleanlinessLevel(int cageCleanlinessLevel) {
        this.cageCleanlinessLevel = cageCleanlinessLevel;
    }

    public int getCleanDogCage() {
        return cleanDogCage;
    }

    public void setCleanDogCage(int cleanDogCage) {
        this.cleanDogCage = cleanDogCage;
    }

    @Override
    public void walkDog() {
        this.continenceLevel += 10;
        this.happinessLevel += 10;
    }

    @Override
    public void cleanDogCage() {
        this.cageCleanlinessLevel += 10;
    }

    @Override
    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
        setContinenceLevel(this.continenceLevel -= 2);
        if (this.continenceLevel < 25) {
            setCageCleanlinessLevel(this.cageCleanlinessLevel -= 5);
        } else if (this.hungerLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.thirstLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.boredomLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.cageCleanlinessLevel < 25) {
            setHappinessLevel(this.happinessLevel - +2);
        } else if (this.happinessLevel < 25) {
            setHealthStatus(this.healthStatus -= 2);
        }

    }

}

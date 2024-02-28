public class RealDog extends RealPet {

    int continenceLevel = 50;
    protected int cageCleanlinessLevel;

    public RealDog(String petName, String petDescription, int boredomLevel, int happinessLevel, int healthLevel) {
        super(petName, petDescription, boredomLevel, happinessLevel, healthLevel);
        this.cageCleanlinessLevel = 0;

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

    public void walkDog() {
        this.continenceLevel += 10;
    }

    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
        setCageCleanlinessLevel(this.cageCleanlinessLevel = +1);

    }

}

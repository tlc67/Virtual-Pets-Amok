package pets_amok;

public class RealDog extends RealPet {

    protected int continenceLevel;
    protected int cageCleanlinessLevel;
    protected int cleanDogCage;

    public RealDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.continenceLevel = 0;
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

    public int getCleanDogCage() {
        return cleanDogCage;
    }

    public void setCleanDogCage(int cleanDogCage) {
        this.cleanDogCage = cleanDogCage;
    }

    @Override
    public void walkDog() {
        this.continenceLevel += 10;
    }

    @Override
    public void cleanDogCage() {
        this.cageCleanlinessLevel -= 10;
    }

    @Override
    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
        setCageCleanlinessLevel(this.cageCleanlinessLevel = +1);
        setContinenceLevel(this.continenceLevel += 2);

    }

}

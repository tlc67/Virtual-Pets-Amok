package pets_amok;

public class RealDog extends RealPet implements MaintenanceForRealDogs {
    private int continenceLevel;
    private int cageCleanlinessLevel;
    private int cleanDogCage;

    public RealDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.continenceLevel = 50;
        this.cageCleanlinessLevel = 50;
        this.cleanDogCage = 0;
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

    public void walkDog() {
        this.continenceLevel += 10;
        this.happinessLevel += 10;
    }

    public void cleanDogCage() {
        this.cageCleanlinessLevel += 10;
    }

    @Override
    public void tick() {
        super.tick();
        setContinenceLevel(this.continenceLevel -= 2);
        if (this.continenceLevel < 25) {
            setCageCleanlinessLevel(this.cageCleanlinessLevel -= 5);
        }
        if (this.cageCleanlinessLevel < 25) {
            setHappinessLevel(this.happinessLevel -= 2);
        }
    }

}

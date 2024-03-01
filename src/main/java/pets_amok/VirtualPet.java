package pets_amok;

public abstract class VirtualPet {
    protected String petName;
    protected String petDescription;
    protected int boredomLevel;
    protected int happinessLevel;
    protected int healthStatus;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.boredomLevel = 50;
        this.happinessLevel = 50;
        this.healthStatus = 50;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetDescription() {
        return this.petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public int getBoredomLevel() {
        return this.boredomLevel;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void playWithPet() {
        this.boredomLevel -= 10;
    }

    public void feedPet() {

    }

    public void waterPet() {

    }

    public void oilRoboticPet() {

    }

    public void maintainRoboticPet() {

    }

    public void cleanDogCage() {

    }

    public void cleanLitterBox() {

    }

    public void walkDog() {

    }

    public void happinessLevel() {

    }

    public void healthStatus() {

    }

    public abstract void tick();

}

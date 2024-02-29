package pets_amok;

public abstract class VirtualPet {
    protected String petName;
    protected String petDescription;
    protected int boredomLevel;
    protected int happinessLevel;
    protected int healthLevel;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.boredomLevel = 50;
        this.happinessLevel = 50;
        this.healthLevel = 50;
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

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void playWithPet() {
        this.boredomLevel -= 10;
    }

    public void feedPet() {

    }

    public void waterPet() {

    }

    public void oilPet() {

    }

    public void maintainPet() {

    }

    public void cleanDogCage() {

    }

    public void cleanLitterBox() {

    }

    public void walkDog() {

    }

    public abstract int calculateHappinessLevel();

    public abstract void tick();

}

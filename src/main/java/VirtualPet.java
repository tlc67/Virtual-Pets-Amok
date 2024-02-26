public abstract class VirtualPet {
    private String petName;
    private String petDescription;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    protected int happinessLevel;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerLevel = 50;
        this.thirstLevel = 50;
        this.boredomLevel = 50;
        this.happinessLevel = 50;
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

    public void feedPet() {
        this.hungerLevel -= 10;
    }

    public void waterPet() {
        this.thirstLevel -= 10;
    }

    public void playWithPet() {
        this.boredomLevel -= 10;
    }

    @Override
    public String toString() {
        String petDetails = "The happiness level for this pet is " + this.happinessLevel;
        return petDetails;
    }

    public abstract int calculateHappinessLevel();

    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
    }

}

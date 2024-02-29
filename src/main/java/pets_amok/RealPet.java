package pets_amok;

public abstract class RealPet extends VirtualPet implements MaintenanceForRealPets {
    protected int cleanLitterBox;
    protected int cleanDogCage;
    protected int hungerLevel;
    protected int thirstLevel;

    public RealPet(String petName, String petDescription) {
        super(petName, petDescription);
        this.cleanLitterBox = 0;
        this.cleanDogCage = 0;
        this.hungerLevel = 50;
        this.thirstLevel = 50;

    }

    public int getCleanLitterBox() {
        return cleanLitterBox;
    }

    public void setCleanLitterBox(int cleanLitterBox) {
        this.cleanLitterBox = cleanLitterBox;
    }

    public int getCleanDogCage() {
        return cleanDogCage;
    }

    public void setCleanDogCage(int cleanDogCage) {
        this.cleanDogCage = cleanDogCage;
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

    @Override
    public void feedPet() {
        this.hungerLevel -= 10;
    }

    @Override
    public void waterPet() {
        this.thirstLevel -= 10;
    }

    @Override
    public int calculateHappinessLevel() {
        happinessLevel = this.cleanDogCage + this.cleanLitterBox;
        return happinessLevel;
    }

    @Override
    public void cleanDogCage() {
        happinessLevel += 10;
        System.out.println("The dogs are happy with a clean cage");
    }

    @Override
    public void cleanLitterBox() {
        happinessLevel += 10;
        System.out.println("The cats are happy with a clean litter box");
    }

    @Override
    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);

    }
}

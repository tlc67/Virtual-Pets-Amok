public class RealPet extends VirtualPet implements MaintenanceForRealPets {
    int cleanLitterBox = 0;
    int cleanDogCage = 0;

    protected int hungerLevel;
    protected int thirstLevel;

    public RealPet(String petName, String petDescription, int boredomLevel, int happinessLevel, int healthLevel) {
        super(petName, petDescription, boredomLevel, happinessLevel, healthLevel);
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

    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);

    }
}

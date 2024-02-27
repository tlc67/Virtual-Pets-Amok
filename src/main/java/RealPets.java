public class RealPets extends VirtualPet implements MaintenanceForRealPets {
    int continenceLevel = 50;
    int cleanLitterBox = 0;
    int cleanDogCage = 0;

    public RealPets(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public int getContinenceLevel() {
        return continenceLevel;
    }

    public void setContinenceLevel(int continenceLevel) {
        this.continenceLevel = continenceLevel;
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

    public void walkDog() {
        this.continenceLevel += 10;
    }

    @Override
    public int calculateHappinessLevel() {
        happinessLevel = this.continenceLevel + this.happinessLevel;
        return happinessLevel;
    }

    @Override
    public void cleanLitterBox() {
        happinessLevel += 10;
        System.out.println("The cats are happy with a clean litter box");
    }

    @Override
    public void cleanCage() {
        happinessLevel += 10;
        System.out.println("The dogs are happy with a clean cage");
    }
}

public class RealPets extends VirtualPet implements MaintenanceForRealPets {
    int continenceLevel = 50;

    public RealPets(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public int getContinenceLevel() {
        return continenceLevel;
    }

    public void setContinenceLevel(int continenceLevel) {
        this.continenceLevel = continenceLevel;
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
        System.out.println("The cats are happy with a clean litter box");
    }

    @Override
    public void cleanCage() {
        System.out.println("The dogs are happy with a clean cage");
    }
}

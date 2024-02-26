public class RoboticPets extends VirtualPet implements MaintenanceForRoboticPets {
    int condition = 50;
    int lubrication = 50;

    public RoboticPets(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getLubrication() {
        return lubrication;
    }

    public void setLubrication(int lubrication) {
        this.lubrication = lubrication;
    }

    @Override
    public int calculateHappinessLevel() {
        happinessLevel = this.lubrication + happinessLevel;
        return happinessLevel;
    }

    @Override
    public void oiling() {
        lubrication += 10;
        System.out.println("The robot pets are happy when they are well oiled");
    }

    @Override
    public void maintenance() {
        condition += 10;
        System.out.println("The robot pets are happy when they are well maintained");
    }

}

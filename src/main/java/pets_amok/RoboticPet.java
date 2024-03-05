package pets_amok;

public abstract class RoboticPet extends VirtualPet implements MaintenanceForRoboticPets {
    protected int oilLevel;
    protected int maintenanceLevel;

    public RoboticPet(String petName, String petDescription) {
        super(petName, petDescription);
        this.oilLevel = 50;
        this.maintenanceLevel = 50;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void setMaintenanceLevel(int maintenanceLevel) {
        this.maintenanceLevel = maintenanceLevel;
    }

    @Override
    public void oilRoboticPet() {
        this.oilLevel += 10;
        System.out.println("The robot pets are happy when they are well oiled");
    }

    @Override
    public void maintainRoboticPet() {
        this.maintenanceLevel += 10;
        System.out.println("The robot pets are happy when they are well maintained");
    }

    @Override
    public void tick() {
        setOilLevel(this.oilLevel -= 1);
        setMaintenanceLevel(this.maintenanceLevel -= 1);
        setBoredomLevel(this.boredomLevel += 1);

        if (this.oilLevel < 25) {
            setHealthStatus(this.healthStatus -= 1);
        }
        if (this.maintenanceLevel < 25) {
            setHealthStatus(this.healthStatus -= 1);
        }
        if (this.boredomLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        }
        if (this.oilLevel < 25) {
            setHappinessLevel(this.happinessLevel -= 2);
        }
        if (this.happinessLevel < 25) {
            setHealthStatus(this.healthStatus -= 2);
        }
        if (this.healthStatus > 50) {
            setHappinessLevel(this.happinessLevel += 2);
        }
    }

}

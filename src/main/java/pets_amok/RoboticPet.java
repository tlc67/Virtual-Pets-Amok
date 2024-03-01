package pets_amok;

public abstract class RoboticPet extends VirtualPet implements MaintenanceForRoboticPets {

    protected int oilLevel;
    protected int conditionLevel;

    public RoboticPet(String petName, String petDescription) {
        super(petName, petDescription);
        this.oilLevel = 50;
        this.conditionLevel = 50;

    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getConditionLevel() {
        return conditionLevel;
    }

    public void setConditionLevel(int conditionLevel) {
        this.conditionLevel = conditionLevel;
    }

    @Override
    public void oiling() {
        oilLevel += 10;
        System.out.println("The robot pets are happy when they are well oiled");
    }

    @Override
    public void maintenance() {
        conditionLevel += 10;
        System.out.println("The robot pets are happy when they are well maintained");
    }

    @Override
    public void tick() {
        setOilLevel(this.oilLevel -= 1);
        setConditionLevel(this.conditionLevel -= 1);
        setBoredomLevel(this.boredomLevel += 1);
        if (this.oilLevel < 25) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.conditionLevel < 25) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.boredomLevel > 75) {
            setHealthStatus(this.healthStatus -= 1);
        } else if (this.oilLevel < 25) {
            setHappinessLevel(this.happinessLevel -= 2);
        } else if (this.happinessLevel < 25) {
            setHealthStatus(this.healthStatus -= 2);
        } else if (this.healthStatus > 50) {
            setHappinessLevel(this.happinessLevel += 2);
        }
    }

}

public class RoboticPet extends VirtualPet implements MaintenanceForRoboticPets {

    protected int oilLevel;
    protected int conditionLevel;
    protected int batteryCharge;

    public RoboticPet(String petName, String petDescription, int boredomLevel, int happinessLevel, int healthLevel) {
        super(petName, petDescription, boredomLevel, happinessLevel, healthLevel);
        this.oilLevel = 50;
        this.conditionLevel = 50;
        this.batteryCharge = 50;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
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

    public void oilPet() {
        this.oilLevel -= 10;
    }

    public void maintainPet() {
        this.conditionLevel -= 10;
    }

    @Override
    public int calculateHappinessLevel() {
        happinessLevel = this.oilLevel + this.conditionLevel;
        return happinessLevel;
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

        setBoredomLevel(this.boredomLevel += 1);

    }

}

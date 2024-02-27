public abstract class VirtualPet {
    private String petName;
    private String petDescription;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    protected int happinessLevel;
    private int dogCageWasteLevel;
    private int litterBoxWasteLevel;
    protected int oilLevel;
    private int conditionLevel;
    private int tirednessLevel;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerLevel = 50;
        this.thirstLevel = 50;
        this.boredomLevel = 50;
        this.happinessLevel = 50;
        this.dogCageWasteLevel = 0;
        this.litterBoxWasteLevel = 0;
        this.oilLevel = 50;
        this.conditionLevel = 50;
        this.tirednessLevel = 50;
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

    public int getDogCageWasteLevel() {
        return dogCageWasteLevel;
    }

    public void setDogCageWasteLevel(int dogCageWasteLevel) {
        this.dogCageWasteLevel = dogCageWasteLevel;
    }

    public int getLitterBoxWasteLevel() {
        return litterBoxWasteLevel;
    }

    public void setLitterBoxWasteLevel(int litterBoxWasteLevel) {
        this.litterBoxWasteLevel = litterBoxWasteLevel;
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

    public int getTirednessLevel() {
        return tirednessLevel;
    }

    public void setTirednessLevel(int tirednessLevel) {
        this.tirednessLevel = tirednessLevel;
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

    public void oilPet() {
        this.oilLevel -= 10;
    }

    public void maintainPet() {
        this.conditionLevel -= 10;
    }

    public void cleanDogCages() {
        this.happinessLevel += 5;
    }

    public void cleanLitterBoxes() {
        this.happinessLevel += 5;
    }

    public void walkPet() {
        this.tirednessLevel -= 10;
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
        setDogCageWasteLevel(this.dogCageWasteLevel = +1);
        setLitterBoxWasteLevel(this.litterBoxWasteLevel = +2);
    }

}

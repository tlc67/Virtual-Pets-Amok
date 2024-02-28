public class RealCat extends RealPet {

    protected int litterBoxCleanlinessLevel;

    public RealCat(String petName, String petDescription, int boredomLevel, int happinessLevel, int healthLevel) {
        super(petName, petDescription, boredomLevel, happinessLevel, healthLevel);
        this.litterBoxCleanlinessLevel = 0;

    }

    public int getLitterBoxCleanlinessLevel() {
        return litterBoxCleanlinessLevel;
    }

    public void setLitterBoxCleanlinessLevel(int litterBoxCleanlinessLevel) {
        this.litterBoxCleanlinessLevel = litterBoxCleanlinessLevel;
    }

    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
        setLitterBoxCleanlinessLevel(this.litterBoxCleanlinessLevel = +2);
    }

}

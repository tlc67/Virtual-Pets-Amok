package pets_amok;

public class RealCat extends RealPet {

    protected int litterBoxCleanlinessLevel;

    public RealCat(String petName, String petDescription) {
        super(petName, petDescription);
        this.litterBoxCleanlinessLevel = 0;

    }

    public int getLitterBoxCleanlinessLevel() {
        return litterBoxCleanlinessLevel;
    }

    public void setLitterBoxCleanlinessLevel(int litterBoxCleanlinessLevel) {
        this.litterBoxCleanlinessLevel = litterBoxCleanlinessLevel;
    }

    @Override
    public void cleanLitterBox() {
        this.litterBoxCleanlinessLevel += 10;
    }

    public void tick() {
        setHungerLevel(this.hungerLevel += 1);
        setThirstLevel(this.thirstLevel += 1);
        setBoredomLevel(this.boredomLevel += 1);
        setLitterBoxCleanlinessLevel(this.litterBoxCleanlinessLevel = +2);
    }

}

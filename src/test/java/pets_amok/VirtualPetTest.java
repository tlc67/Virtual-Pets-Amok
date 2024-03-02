package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @Test
    public void testFeedPetMethod() {
        RealDog virtualPet = new RealDog(null, null);
        virtualPet.feedPet();

        assertEquals(40, virtualPet.getHungerLevel());
    }

    @Test
    public void testWaterPetMethod() {
        RealCat virtualPet = new RealCat(null, null);
        virtualPet.waterPet();

        assertEquals(40, virtualPet.getThirstLevel());
    }

    @Test
    public void testBoredomMethod() {
        RoboticCat virtualPet = new RoboticCat(null, null);
        virtualPet.playWithPet();

        assertEquals(40, virtualPet.getBoredomLevel());
    }

    @Test
    public void testTickMethod() {
        RealCat virtualPet = new RealCat(null, null);
        virtualPet.tick();

        assertEquals(51, virtualPet.hungerLevel);
        assertEquals(51, virtualPet.thirstLevel);
        assertEquals(51, virtualPet.boredomLevel);
    }

    @Test
    public void testOilRoboticPet() {
        RoboticCat virtualPet = new RoboticCat(null, null);
        virtualPet.oilRoboticPet();

        assertEquals(60, virtualPet.getOilLevel());
    }

    @Test
    public void testWalkDog() {
        RealDog virtualPet = new RealDog(null, null);
        virtualPet.walkDog();

        assertEquals(60, virtualPet.getHappinessLevel());
        assertEquals(60, virtualPet.getContinenceLevel());
    }

    @Test
    public void testCleanDogCage() {
        RealDog virtualPet = new RealDog(null, null);
        virtualPet.cleanDogCage();

        assertEquals(60, virtualPet.getCageCleanlinessLevel());
    }

}

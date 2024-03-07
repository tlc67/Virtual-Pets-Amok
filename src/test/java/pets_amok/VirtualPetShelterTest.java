package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    private VirtualPetShelter virtualPets;
    private RoboticDog astro;

    @BeforeEach
    public void setup() {
        virtualPets = new VirtualPetShelter();

        RealCat oreo = new RealCat("Oreo",
                "He is a big boy, who loves his food and scratches behind the ears.");
        RealDog obi = new RealDog("Obi", "He is a big baby.");
        RoboticCat joe = new RoboticCat("Joe",
                "He loves to snuggle on your lap, but is a little timid around small children.");
        astro = new RoboticDog("Astro", "He is the space dog of the future.");

        virtualPets.addPet(oreo);
        virtualPets.addPet(obi);
        virtualPets.addPet(joe);
        virtualPets.addPet(astro);
    }

    @Test
    public void testAddPet() {
        RealCat marvel = new RealCat("Marvel", "He is a loner.");
        virtualPets.addPet(marvel);
        assertEquals(5, virtualPets.getPets().size());

        boolean wasMarvelFound = false;

        for (VirtualPet pet : virtualPets.pets) {
            if (marvel.petName.equals(pet.getPetName())) {
                wasMarvelFound = true;
                break;
            }
        }
        assertTrue(wasMarvelFound);
    }

    @Test
    public void testRemovePet() {
        virtualPets.removePet("Astro");
        assertEquals(3, virtualPets.getPets().size());

        for (VirtualPet pet : virtualPets.pets) {
            assertNotEquals(astro, pet);
        }
    }

    @Test
    public void testFeedRealPets() {
        virtualPets.feedRealPets();
        for (VirtualPet pet : virtualPets.getRealCats()) {
            assertEquals(40, ((RealCat) pet).getHungerLevel());
        }
        for (VirtualPet pet : virtualPets.getRealDogs()) {
            assertEquals(40, ((RealDog) pet).getHungerLevel());
        }
    }

    @Test
    public void testWaterRealPets() {
        virtualPets.waterRealPets();
        for (VirtualPet pet : virtualPets.getRealCats()) {
            assertEquals(40, ((RealCat) pet).getThirstLevel());
        }
        for (VirtualPet pet : virtualPets.getRealDogs()) {
            assertEquals(40, ((RealDog) pet).getThirstLevel());
        }
    }

    @Test
    public void testPlayWithChosenPet() {
        String petToPlayWith = "Obi";
        virtualPets.playWithChosenPet(petToPlayWith);
        for (VirtualPet pet : virtualPets.getPets()) {
            if (petToPlayWith.equals(pet.getPetName())) {
                assertEquals(40, pet.getBoredomLevel());
            } else {
                assertEquals(50, pet.getBoredomLevel());
            }
        }
    }

    @Test
    public void testWalkAllDogs() {
        virtualPets.walkAllDogs();
        for (VirtualPet pet : virtualPets.getRealDogs()) {
            assertEquals(60, ((RealDog) pet).getHappinessLevel());
            assertEquals(60, ((RealDog) pet).getContinenceLevel());
        }
        for (VirtualPet pet : virtualPets.getRoboticDogs()) {
            assertEquals(60, ((RoboticDog) pet).getHappinessLevel());
        }
    }

}

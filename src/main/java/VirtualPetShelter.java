
import java.util.ArrayList;

public class VirtualPetShelter {
    ArrayList<VirtualPet> pets = new ArrayList<VirtualPet>();

    public ArrayList<VirtualPet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<VirtualPet> pets) {
        this.pets = pets;
    }

    public VirtualPetShelter() {

    }

    public void addPet(VirtualPet thePet) {
        this.pets.add(thePet);
    }

    public void removePet(String petToRemove) {
        for (int petIndex = 0; petIndex < pets.size(); petIndex++) {
            VirtualPet pet = pets.get(petIndex);
            if (petToRemove.equals(pet.getPetName())) {
                this.pets.remove(pet);
                break;
            }
        }
    }

    public void feedRealPets() {
        for (VirtualPet pet : this.pets) {
            pet.feedPet();
        }
    }

    public void waterRealPets() {
        for (VirtualPet pet : this.pets) {
            pet.waterPet();
        }
    }

    public void oilRoboticPets() {
        for (VirtualPet pet : this.pets) {
            pet.oilPet();
        }
    }

    public void maintainRoboticPets() {
        for (VirtualPet pet : this.pets) {
            pet.maintainPet();
        }
    }

    public void playWithChosenPet(String petToPlayWith) {
        for (VirtualPet pet : this.pets) {
            if (petToPlayWith.equals(pet.getPetName())) {
                pet.playWithPet();
            }
        }
    }

    public void cleanDogCages() {
        this.cleanDogCages();
    }

    public void cleanLitterBoxes() {
        this.cleanLitterBoxes();
    }

    public void walkAllPets() {
        for (VirtualPet pet : this.pets) {
            pet.walkPet();
        }
    }

    public void tick() {
        for (VirtualPet pet : this.pets) {
            pet.tick();
        }
    }

}

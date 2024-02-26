
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

    public void feedAllPets() {
        for (VirtualPet pet : this.pets) {
            pet.feedPet();
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : this.pets) {
            pet.waterPet();
        }
    }

    public void playWithChosenPet(String petToPlayWith) {
        for (VirtualPet pet : this.pets) {
            if (petToPlayWith.equals(pet.getPetName())) {
                pet.playWithPet();
            }
        }
    }

    public void tick() {
        for (VirtualPet pet : this.pets) {
            pet.tick();
        }
    }

}

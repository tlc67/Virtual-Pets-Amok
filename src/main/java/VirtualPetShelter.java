
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

    public ArrayList<VirtualPet> getRealPets() {
        ArrayList<VirtualPet> realPets = new ArrayList<VirtualPet>();
        for (VirtualPet pet : this.pets) {
            if (pet instanceof RealPet) {
                realPets.add(pet);
            }
        }
        return realPets;
    }

    public ArrayList<VirtualPet> getRoboticPets() {
        ArrayList<VirtualPet> roboticPets = new ArrayList<VirtualPet>();
        for (VirtualPet pet : this.pets) {
            if (pet instanceof RoboticPet) {
                roboticPets.add(pet);
            }
        }
        return roboticPets;
    }

    public ArrayList<VirtualPet> getRealDogs() {
        ArrayList<VirtualPet> realDogs = new ArrayList<VirtualPet>();
        for (VirtualPet pet : this.pets) {
            if (pet instanceof RealDog) {
                realDogs.add(pet);
            }
        }
        return realDogs;
    }

    public ArrayList<VirtualPet> getRealCats() {
        ArrayList<VirtualPet> realCats = new ArrayList<VirtualPet>();
        for (VirtualPet pet : this.pets) {
            if (pet instanceof RealCat) {
                realCats.add(pet);
            }
        }
        return realCats;
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
        for (VirtualPet pet : getRealPets()) {
            pet.feedPet();
        }
    }

    public void waterRealPets() {
        for (VirtualPet pet : getRealPets()) {
            pet.waterPet();
        }
    }

    public void oilRoboticPets() {
        for (VirtualPet pet : getRoboticPets()) {
            pet.oilPet();
        }
    }

    public void maintainRoboticPets() {
        for (VirtualPet pet : getRoboticPets()) {
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

    public void cleanDogCage() {
        for (VirtualPet pet : getRealDogs()) {
            pet.cleanDogCage();
        }

    }

    public void cleanLitterBox() {
        for (VirtualPet pet : getRealCats()) {
            pet.cleanLitterBox();
        }

    }

    public void walkAllDogs() {
        this.walkAllDogs();
    }

    public void tick() {
        for (VirtualPet pet : this.pets) {
            pet.tick();
        }
    }

}

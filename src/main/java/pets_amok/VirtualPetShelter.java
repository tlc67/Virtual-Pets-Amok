package pets_amok;

import java.util.ArrayList;

public class VirtualPetShelter {
    protected int litterBoxCleanlinessLevel;

    ArrayList<VirtualPet> pets = new ArrayList<VirtualPet>();

    public ArrayList<VirtualPet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<VirtualPet> pets) {
        this.pets = pets;
    }

    public VirtualPetShelter() {
        this.litterBoxCleanlinessLevel = 100;
    }

    public int getLitterBoxCleanlinessLevel() {
        return litterBoxCleanlinessLevel;
    }

    public void setLitterBoxCleanlinessLevel(int litterBoxCleanlinessLevel) {
        this.litterBoxCleanlinessLevel = litterBoxCleanlinessLevel;
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

    public ArrayList<VirtualPet> getRoboticDogs() {
        ArrayList<VirtualPet> roboticDogs = new ArrayList<VirtualPet>();
        for (VirtualPet pet : this.pets) {
            if (pet instanceof RoboticDog) {
                roboticDogs.add(pet);
            }
        }
        return roboticDogs;
    }

    public ArrayList<VirtualPet> getRoboticCats() {
        ArrayList<VirtualPet> roboticCats = new ArrayList<VirtualPet>();
        for (VirtualPet pet : this.pets) {
            if (pet instanceof RoboticCat) {
                roboticCats.add(pet);
            }
        }
        return roboticCats;
    }

    public ArrayList<VirtualPet> getAllDogs() {
        ArrayList<VirtualPet> allDogs = new ArrayList<VirtualPet>();
        for (VirtualPet pet : this.pets) {
            if (pet instanceof RealDog || pet instanceof RoboticDog) {
                allDogs.add(pet);
            }
        }
        return allDogs;
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
            pet.oilRoboticPet();
        }
    }

    public void maintainRoboticPet() {
        for (VirtualPet pet : getRoboticPets()) {
            pet.maintainRoboticPet();
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
        this.litterBoxCleanlinessLevel = 100;
    }

    public void walkAllDogs() {
        for (VirtualPet pet : getAllDogs()) {
            pet.walkDog();
        }
    }

    public void tick() {
        for (VirtualPet pet : this.pets) {
            pet.tick();
        }
        for (int x = 0; x < getRealCats().size(); x++) {
            this.litterBoxCleanlinessLevel -= 2;
        }
    }

}

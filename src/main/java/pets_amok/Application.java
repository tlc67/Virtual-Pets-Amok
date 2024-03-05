package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        RealCat oreo = new RealCat("Oreo",
                "He is a big boy, who loves his food and scratches behind the ears.");
        RealCat zelda = new RealCat("Zelda", "He is a sweet boy that loves attention and chasing birds.");
        RealDog obi = new RealDog("Obi", "He is a big baby.");
        RealDog phineas = new RealDog("Phineas", "He is an old man who is young at heart.");
        RoboticCat joe = new RoboticCat("Joe",
                "He loves to snuggle on your lap, but is a little timid around small children.");
        RoboticCat thor = new RoboticCat("Thor", "He is very vocal and loves to be the center of attention.");
        RoboticDog aloy = new RoboticDog("Aloy", "She is a diva for sure, but will be a lady someday.");
        RoboticDog astro = new RoboticDog("Astro", "He is the space dog of the future.");

        VirtualPetShelter virtualPets = new VirtualPetShelter();

        virtualPets.addPet(oreo);
        virtualPets.addPet(zelda);
        virtualPets.addPet(joe);
        virtualPets.addPet(thor);
        virtualPets.addPet(obi);
        virtualPets.addPet(phineas);
        virtualPets.addPet(aloy);
        virtualPets.addPet(astro);

        boolean stillPlayingGame = true;

        while (stillPlayingGame) {
            System.out.println("Enter 1 to feed all the real pets in shelter.");
            System.out.println("Enter 2 to water all the real pets in shelter.");
            System.out.println("Enter 3 to choose a pet to play with.");
            System.out.println("Enter 4 to walk all the dogs.");
            System.out.println("Enter 5 to clean dog cages.");
            System.out.println("Enter 6 to oil all robotic pets.");
            System.out.println("Enter 7 to clean real cats litter box.");
            System.out.println("Enter 8 to admit a pet.");
            System.out.println("Enter 9 to adopt a pet.");
            System.out.println("Enter 0 to quit game.");
            System.out.println("If health status reaches 0, you lose game.");
            System.out.println("If happiness level reaches 0, you lose game.");
            System.out.println("What would you like to do next?");

            int userInput = input.nextInt();

            if (userInput == 1) {
                virtualPets.feedRealPets();
            } else if (userInput == 2) {
                virtualPets.waterRealPets();
            } else if (userInput == 3) {
                System.out.println("Ok, so you would like to play with a pet. Please choose one.");
                for (VirtualPet pet : virtualPets.pets) {
                    System.out.println(pet.getPetName());
                    System.out.println(pet.getPetDescription());
                }
                input.nextLine();
                System.out.println("Which pet would you like to play with?");
                String userInputPetName = input.nextLine();
                virtualPets.playWithChosenPet(userInputPetName);
                System.out.println("You have played with " + userInputPetName);
            } else if (userInput == 4) {
                virtualPets.walkAllDogs();
            } else if (userInput == 5) {
                virtualPets.cleanDogCage();
            } else if (userInput == 6) {
                virtualPets.oilRoboticPets();
            } else if (userInput == 7) {
                virtualPets.cleanLitterBox();
            } else if (userInput == 8) {
                System.out.println("What type of pet are we adding?");
                System.out.println("Enter 1 for a real cat");
                System.out.println("Enter 2 for a robotic cat");
                System.out.println("Enter 3 for a real dog");
                System.out.println("Enter 4 for a robotic dog");
                int userInputPetType = input.nextInt();
                System.out.println("What should we name our new pet?");
                input.nextLine();
                String userInputNewName = input.nextLine();
                System.out.println("Please describe our new pet");
                String userInputDescription = input.nextLine();

                if (userInputPetType == 1) {
                    VirtualPet RealCat = new RealCat(userInputNewName, userInputDescription);
                    virtualPets.addPet(RealCat);
                } else if (userInputPetType == 2) {
                    VirtualPet RoboticCat = new RoboticCat(userInputNewName, userInputDescription);
                    virtualPets.addPet(RoboticCat);
                } else if (userInputPetType == 3) {
                    VirtualPet RealDog = new RealDog(userInputNewName, userInputDescription);
                    virtualPets.addPet(RealDog);
                } else if (userInputPetType == 4) {
                    VirtualPet RoboticDog = new RoboticDog(userInputNewName, userInputDescription);
                    virtualPets.addPet(RoboticDog);
                }
            } else if (userInput == 9) {
                for (VirtualPet pet : virtualPets.pets) {
                    System.out.println(pet.getPetName());
                    System.out.println(pet.getPetDescription());
                }
                input.nextLine();
                System.out.println("Which pet would you like to adopt?");
                String userInputPetAdopted = input.nextLine();
                virtualPets.removePet(userInputPetAdopted);
                System.out.println("You have adopted " + userInputPetAdopted);
            } else if (userInput == 0) {
                stillPlayingGame = false;
                System.out.println("You have exited the game.");
            }
            System.out.println("(Real Cats) | litter box cleanliness " + virtualPets.getLitterBoxCleanlinessLevel());
            System.out.println("Name\t| Hunger| Thirst|Boredom| Happiness| Health");
            System.out.println("--------|-------|-------|-------|----------|---------");
            for (VirtualPet pet : virtualPets.getRealCats()) {
                System.out.println(pet.getPetName() + "\t| " + ((RealCat) pet).getHungerLevel() + "\t| "
                        + ((RealCat) pet).getThirstLevel() + "\t| " + pet.getBoredomLevel() + "\t| "
                        + ((RealCat) pet).getHappinessLevel() + "\t   | " + "\t" + ((RealCat) pet).getHealthStatus());
            }
            System.out.println("(Real Dogs)");
            System.out.println("Name\t| Hunger| Thirst| Boredom | Cleanliness | Happiness | Health");
            System.out.println("--------|-------|-------|--------|-------------|-----------|--------");
            for (VirtualPet pet : virtualPets.getRealDogs()) {
                System.out.println(pet.getPetName() + "\t| " + ((RealDog) pet).getHungerLevel() + "\t| "
                        + ((RealDog) pet).getThirstLevel()
                        + "\t| " + pet.getBoredomLevel() + "\t| " + ((RealDog) pet).getCageCleanlinessLevel()
                        + "\t| " + ((RealDog) pet).getHappinessLevel() + "\t| " + ((RealDog) pet).getHealthStatus());
            }
            System.out.println("(Robotic Cats)");
            System.out.println("Name\t| Oiling| Maintenance | Boredom | Happiness | Health");
            System.out.println("--------|-------|-------------|----------|----------|--------");
            for (VirtualPet pet : virtualPets.getRoboticCats()) {
                System.out.println(pet.getPetName() + "\t| " + ((RoboticCat) pet).getOilLevel() + "\t| "
                        + ((RoboticCat) pet).getMaintenanceLevel() + "\t| " + "\t" + pet.getBoredomLevel() + "\t| "
                        + ((RoboticCat) pet).getHappinessLevel() + "\t| " + ((RoboticCat) pet).getHealthStatus());
            }
            System.out.println("(Robotic Dogs)");
            System.out.println("Name\t| Oiling| Maintenance | Boredom | Happiness | Health");
            System.out.println("--------|-------|-------------|---------|-----------|--------");
            for (VirtualPet pet : virtualPets.getRoboticDogs()) {
                System.out.println(pet.getPetName() + "\t| " + ((RoboticDog) pet).getOilLevel() + "\t| " + "\t"
                        + ((RoboticDog) pet).getMaintenanceLevel()
                        + "\t| " + pet.getBoredomLevel() + "\t "
                        + "\t| " + ((RoboticDog) pet).getHappinessLevel() + "\t| "
                        + ((RoboticDog) pet).getHealthStatus());
            }

            for (VirtualPet pet : virtualPets.pets)
                if (pet.getHappinessLevel() <= 0 || pet.getHealthStatus() <= 0) {
                    System.out.println("You lose game.");
                    stillPlayingGame = false;
                }

            if (stillPlayingGame == false) {
                break;
            }
            virtualPets.tick();
        }
        input.close();
    }

}

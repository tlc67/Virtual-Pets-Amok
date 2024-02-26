import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet kitty1 = new VirtualPet("Oreo",
                "He is a big boy, who loves his food and scratches behind the ears.");
        VirtualPet kitty2 = new VirtualPet("Zelda", "He is a sweet boy that loves attention and chasing birds.");
        VirtualPet kitty3 = new VirtualPet("Joe",
                "He loves to snuggle on your lap, but is a little timid around small children.");
        VirtualPet kitty4 = new VirtualPet("Stitch", "She is a little lady, who loves napping in the sun.");
        VirtualPet kitty5 = new VirtualPet("Thor", "He is very vocal and loves to be the center of attention.");

        VirtualPetShelter virtualPets = new VirtualPetShelter();

        virtualPets.addPet(kitty1);
        virtualPets.addPet(kitty2);
        virtualPets.addPet(kitty3);
        virtualPets.addPet(kitty4);
        virtualPets.addPet(kitty5);

        boolean stillPlayingGame = true;

        while (stillPlayingGame) {
            System.out.println("Enter 1 to feed all pets in shelter");
            System.out.println("Enter 2 to water all pets in shelter");
            System.out.println("Enter 3 to choose a pet to play with");
            System.out.println("Enter 4 to admit a pet");
            System.out.println("Enter 5 to adopt a pet");
            System.out.println("Enter 6 to quit game");
            System.out.println("If level reaches 100, you lose game.");
            System.out.println("If level reaches 0, you lose game.");
            System.out.println("What would you like to do next?");

            int userInput = input.nextInt();

            if (userInput == 1) {
                virtualPets.feedAllPets();
            } else if (userInput == 2) {
                virtualPets.waterAllPets();
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
                System.out.println("What should we name our new pet?");
                input.nextLine();
                String userInputNewName = input.nextLine();
                System.out.println("Please describe our new pet");
                String userInputDescription = input.nextLine();
                VirtualPet newPet = new VirtualPet(userInputNewName, userInputDescription);
                virtualPets.addPet(newPet);
            } else if (userInput == 5) {
                for (VirtualPet pet : virtualPets.pets) {
                    System.out.println(pet.getPetName());
                    System.out.println(pet.getPetDescription());
                }
                input.nextLine();
                System.out.println("Which pet would you like to adopt?");
                String userInputPetAdopted = input.nextLine();
                virtualPets.removePet(userInputPetAdopted);
                System.out.println("You have adopted " + userInputPetAdopted);
            } else if (userInput == 6) {
                stillPlayingGame = false;
                System.out.println("You have exited the game.");
            }

            System.out.println("Name\t| Hunger| Thirst| Boredom");
            System.out.println("--------|-------|-------|--------");
            for (VirtualPet pet : virtualPets.pets) {
                System.out.println(pet.getPetName() + "\t| " + pet.getHungerLevel() + "\t| " + pet.getThirstLevel()
                        + "\t| " + pet.getBoredomLevel());
            }
            for (VirtualPet pet : virtualPets.pets) {
                if (pet.getHungerLevel() >= 100 || pet.getThirstLevel() >= 100
                        || pet.getBoredomLevel() >= 100) {
                    System.out.println("You lose game.");
                    stillPlayingGame = false;
                } else if (pet.getHungerLevel() <= 0 || pet.getThirstLevel() <= 0
                        || pet.getBoredomLevel() <= 0) {
                    System.out.println("You lose game.");
                    stillPlayingGame = false;
                }
                if (stillPlayingGame == false) {
                    break;
                }
            }
            virtualPets.tick();
        }
        input.close();
    }
}

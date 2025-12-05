//Abby Dycus Section 003
import java.util.Scanner;
public class FantasyGame {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        //Prompts user to input their first choice
        System.out.println("Welcome to the fantasy adventure game! Choose your path:\nWizard\nKnight\nBandit");
        //Stores user input in a string
        String pathChoice = key.next();

        //WIZARD PATH

        if (pathChoice.equals("Wizard") || (pathChoice.equals("wizard") || pathChoice.equals("1"))) {
            //Displays the next choices for the wizard path
            System.out.println("You are a wizard exploring a cavern in search of a mythical scroll. You've approached two diverging paths. Which way will you go? (Enter the number only!)\n1. Left \n2. Right");
            //Stores user choice in integer "wizardChoiceOne"
            int wizardChoiceOne = key.nextInt();
            //Depending on what the user chose, a new set of choices is displayed.
            if (wizardChoiceOne == 1) {
                System.out.println("You decide to take the left path, which leads to an opening where you encounter a bear. What will you do? (Enter the number only!)\n1. Fight the bear \n2. Cast sleep spell");
                //Stores next user choice in integer "wizardChoiceTwo"
                int wizardChoiceTwo = key.nextInt();
                //Displays ending ONE
                if (wizardChoiceTwo == 1) {
                    System.out.println("You decide to attack the bear! Your spells are no match for the mighty predator and you unfortunately get mauled to death. \nGAME OVER");
                    return;
                }
                //Displays ending TWO
                if (wizardChoiceTwo == 2) {
                    System.out.println("You cast a sleep spell on the bear. The beast quickly falls unconscious and you realize he was guarding the scroll all along. You sneakily grab it and exit the cave. \nYOU WIN");
                    return;
                }
            }
            if (wizardChoiceOne == 2) {
                System.out.println("You decide to take the right path, where you encounter a fellow wizard in search of the scroll. What will you do? (Enter the number only!) \n1. Befriend him \n2. Challenge to a duel");
                //Stores next user choice in integer "wizardChoiceTwo"
                int wizardChoiceTwo = key.nextInt();
                //Displays ending THREE
                if (wizardChoiceTwo == 1) {
                    System.out.println("You attempt to befriend the fellow wizard. He responds angrily, 'The scroll is mine!' and kills you. \nGAME OVER");
                    return;
                }
                //Displays ending FOUR
                if (wizardChoiceTwo == 2) {
                    System.out.println("You challenge the wizard to a duel, and he accepts. You win the duel and he offers you the scroll. You take it from him and exit the cave. \nYOU WIN");
                    return;
                }
            }
        }

            //KNIGHT PATH

            //Declares knightChoiceOne integer because it'll be used later, outside of the if statement
            int knightChoiceOne;
            if (pathChoice.equals("Knight") || pathChoice.equals("knight") || pathChoice.equals("2")) {
                //Prompts user to input their next choice
                System.out.println("You are a knight defending your village from a dragon attack. The dragon charges up as it prepares to breathe fire. What do you do? (Enter the number only!) \n1. Block with shield \n2. Save your comrade");
                //Stores choice in integer "knightChoiceOne"
                knightChoiceOne = key.nextInt();
                if (knightChoiceOne == 1) {
                    System.out.println("You block the dragon's fire breath with your shield. While you remain uninjured, the fire melts your shield away.");
                }
                if (knightChoiceOne == 2) {
                    System.out.println("You quickly push your comrade out of the way. You both manage to successfully avoid the dragon's fire breath.");
                }

                //Continuation of story based on user input for knightChoiceOne
                System.out.println("The dragon reels its claws back, preparing to attack again!");
                //Displays ENDING FIVE
                if (knightChoiceOne == 2) {
                    System.out.println("Your comrade quickly jumps in, blocking the attack and saving your life! Together, you finish off the dragon, saving the village! \nWIN");
                    return;
                } else {
                    //Displays ENDING SIX
                    System.out.println("With no shield, you are left defenseless, and you are killed by the dragon. \nGAME OVER");
                    return;
                }
            }
                //BANDIT PATH

            if (pathChoice.equals("Bandit") || (pathChoice.equals("bandit") || (pathChoice.equals("3")))) {
                //Prompts user to input their first choice for the bandit path
                System.out.println("You are a bandit searching for your next target. You happen across a lonely old travelling merchant. What will you do? (Enter the number only!) \n1. Threaten \n2. Pickpocket");
                //Stores user choice in integer banditChoiceOne
                int banditChoiceOne = key.nextInt();
                    if (banditChoiceOne == 1) {
                        //Prompts user to input their second choice for the bandit path
                        System.out.println("You threaten him. He won't budge. What do you do? \n1. Back off \n2. Attack");
                        //Stores user choice in integer banditChoiceTwo
                        int banditChoiceTwo = key.nextInt();
                        if (banditChoiceTwo == 1) {
                            //Displays ending SEVEN
                            System.out.println("You decide to back off, leaving with your life, but no loot. \nGAME OVER");
                            return;
                        }
                        if (banditChoiceTwo == 2) {
                            //Displays ending EIGHT
                            System.out.println("You attack the merchant, but he fights back, killing you! \nGAME OVER");
                            return;
                        }
                    }
                //Prompts user to input their second choice for the bandit path
                if (banditChoiceOne == 2) {
                        System.out.println("You pickpocket the merchant, successfully stealing 3 dabloons! What will you do? (Enter the number only!) \n1. Back off \n2. Steal more");
                        //Stores next choice in integer "banditChoiceTwo"
                        int banditChoiceTwo = key.nextInt();
                        if (banditChoiceTwo == 1) {
                            //Displays ending NINE
                            System.out.println("You successfully escape with the loot. \nYOU WIN");
                            return;
                        }
                        if (banditChoiceTwo == 2) {
                            //Displays ending TEN
                            System.out.println("The merchant notices you stealing and kills you. \nGAME OVER!");
                            return;
                        }
                    }
                }
            }
        }
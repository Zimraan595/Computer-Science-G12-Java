package POTD;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class WhileLoops {
    private static Scanner scan = new Scanner(System.in);
    private static int money = 500;
    private static boolean metShadyMan = false;
    private static int lastWinningHorse = 0;
    private static int roundsPlayed = 0;



    // Colours
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Random rand = new Random();

        lastWinningHorse = rand.nextInt(11) + 1;

        System.out.println("==================================================");
        System.out.println("  ♠️  WELCOME TO THE GRAND CASINO OF RAHMANIA  ♥️");
        System.out.println("==================================================");

        System.out.print("\nEnter 'y' to enter, and 'n' to exit: ");
        String decision = scan.nextLine();

        if (decision.equals("y")) {
            System.out.println("Interac Payment Processed. (Your house is now collateral)");
        } else {
            System.out.println("Leave the casino NOW!\nYour house is also gone");
            Runtime.getRuntime().exit(0);
        }

        // Game loop
        boolean loop = true;
        while (loop) {
            // Zimraan Game Story -- Start (Supicious man interaction)
            if (!metShadyMan && roundsPlayed >= 3 && Math.random() <= 0.5) {
                System.out.println("\nA man in a grey coat sits down beside you. He doesn't look at you.");
                sleep(3);
                say("Nice streak. Shame. People who win like that in here...");
                sleep(3);
                say("...they don't usually make it to the parking lot.");
                sleep(2);
                if (lastWinningHorse > 0) {
                    say("Horse " + lastWinningHorse + ". Remember that number.");
                } else {
                    say("You haven't watched a single race. Pity. You'll have to guess.");
                }
                sleep(3);
                say("Service elevator. When you're ready to see what this place really is.");

                System.out.println("\nBy the time you turn, he's gone.");
                sleep(3);
                metShadyMan = true;
            }
            // Zimraan Game Story -- End

            System.out.println("\nMoney: " + money + " Sinas.\n");
            System.out.println("Games: (Enter the number corresponding to the game) (enter any other number to exit)\n1. Blackjack \n2. Horse Racing");
            if (metShadyMan) {
                System.out.println(RED + "3. F̷o̷l̷l̷o̷w̷ ̷t̷h̷e̷ ̷m̷a̷n̷ ̷i̷n̷ ̷g̷r̷e̷y̷" + RESET); //This line is buggy do not touch
            }
            System.out.print("> ");
            int selected_game = scan.nextInt();
            scan.nextLine();

            switch (selected_game) {
                case 1:
                    blackjack();
                    roundsPlayed++;
                    break;
                case 2:
                    horseRacing(rand);
                    roundsPlayed++;
                    break;
                case 3:
                    if (metShadyMan) {
                        crypo_cracker();
                        break;
                    }
                default:
                    System.out.println("Play a game or get out!");
            }

            if (money <= 0) {
                loop = false;
            }
        }
        // Ending Message
        System.out.print("You're broke and you're homeless :(🤣 ");
    }

    // Zimraan (Chypher cracker + Game Story)
    public static void crypo_cracker() {
        // Describes the place
        int key = lastWinningHorse;
        System.out.println("\n==============================================");
        System.out.println("            THE SERVICE ELEVATOR");
        System.out.println("==============================================");
        sleep(2);
        System.out.println("The elevator drops below the lowest floor button.");
        sleep(3);
        System.out.println("A room of humming servers. The man in grey is already typing.");
        sleep(3);
        say("Every race here is fixed. The winning number is the key.");
        sleep(3);
        say("Their messages come through this line. Read them before they read you.");
        sleep(3);

        String[] messages = {
                "HORSE " + key + " WINS AGAIN",
                "DEALERS CLEAN MINISTRY CASH",
                "BIG WINNERS DO NOT LEAVE",
                "BASEMENT CELLS ARE FULL",
                "SEAL EXITS FIND TABLE NINE"
        };
        String[] reactions = {
                "Told you. Fixed. Every night.",
                "The blackjack tables. That's where the government's money gets washed.",
                "...Now you know why I found you first.",
                "...",
                "Table nine. That's you. Move. NOW."
        };

        say("our intelligence tells us the cryptography is type: caesar");
        sleep(3);

        int strikes = 0;

        for (int i = 0; i < messages.length; i++) {
            System.out.println("\n--- INTERCEPT " + (i + 1) + " of 5 ---");
            String encrypted = ceaser(messages[i], -key);
            System.out.println(CYAN + encrypted + RESET);
            System.out.print("Enter shift key (1-25)");
            int attemptKey = scan.nextInt();
            scan.nextLine();
            System.out.println("Apllying the shift (" + attemptKey + ") \n a -> " + ceaser("a", attemptKey));
            letterByLetter(ceaser(encrypted, attemptKey));

            // Checking if the user inputted the correct key
            if (attemptKey == key) {
                System.out.println("SUCCESS");
                sleep(1);
                System.out.println(reactions[i]);
            } else {
                System.out.println("FAILED");
                strikes += 1;
                sleep(1);

                // Automatically fails the user if they fail to crack the last message since it is critical to the plot
                if (i == 4) {
                    strikes = 3;
                }

                // Setting escalated consequences
                switch (strikes) {
                    case 1:
                        System.out.println(RED + "\n[!] The line flickers." + RESET);
                        sleep(3);
                        say("Something's wrong. They'll notice that.");
                        sleep(3);
                        break;
                    case 2:
                        int lost = money / 2;
                        money -= lost;
                        System.out.println(RED + "\n[!!] Footsteps outside the door." + RESET);
                        sleep(3);
                        System.out.println("He grabs half your chips (" + lost + " sinnas) and slips them under the door to a guard.");
                        sleep(6);
                        say("That's the last favour I can buy you.");
                        sleep(3);
                        break;
                    default:
                        System.out.println(RED + "\n[!!!] THE DOOR BURSTS OPEN" + RESET);
                        sleep(3);
                        System.out.println("Three guards. Flashlights in your eyes.");
                        sleep(3);
                        System.out.println("You turn to the man in grey. The vent cover is on the floor. He's gone.");
                        sleep(5);
                        System.out.println("\nHe was never going to take you with him.");
                        sleep(3);
                        System.out.println("\nAll " + money + " sinnas of your chips are confiscated.");
                        sleep(3);
                        System.out.println("You wake up in the basement. The cells are full. Now there's one more.");
                        sleep(5);
                        System.out.println("\n========== GAME OVER ==========");
                        Runtime.getRuntime().exit(0);
                }
            }
            sleep(2);
        }

        sleep(0.8);
        System.out.println("\nAlarms. Red light floods the stairwell.");
        sleep(3);
        System.out.println("You run. Three floors. A fire door. Cold air.");
        sleep(3);
        System.out.println("A black car idles in the alley. He's at the wheel.");
        sleep(3);
        say("Get in.");
        sleep(1.5);
        System.out.println("\nYou escape the Casino of Rahmania with $" + money + ".");
        sleep(3);
        System.out.println("\nThe laptop on the dashboard chimes. A new intercept.");
        sleep(3);
        System.out.println("This one isn't encrypted.");
        sleep(3);
        System.out.println(CYAN + "\nTARGET ESCAPED. NOTIFY ALL BORDERS." + RESET);
        sleep(3);
        System.out.println("\n========== TO BE CONTINUED ==========");
        Runtime.getRuntime().exit(0);
    }

    //Aditya: Blackjack (Arrays.toString()):
    public static void blackjack() {
        System.out.println(YELLOW + "\n=========================");
        System.out.println("        Blackjack        ");
        System.out.println("=========================\n");

        System.out.println(RESET + "==========RULES==========");
        System.out.println("1. Try to get as close to 21 as possible without going over.");
        System.out.println("2. You win if you get a higher score than the dealer.");
        System.out.println("3. The dealer must stand on 17 or higher.\n");

        //This deck only has 13 of the 52 cards, but the probabilities of getting each value are the same
        int deck[] = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
        };

        System.out.println("Available deck: " + Arrays.toString(deck) + "\n"); //Showing the player the possible values they can get for each card

        int dealerHand = 0;
        int playerHand = 0;

        while (true) {
            System.out.print("How much will you put in? You have " + money + " Sinas. ");
            int wager = scan.nextInt();
            scan.nextLine();

            if (wager > money) { //Input validation: if they are over or under the amount they can bet, it becomes a practice round with no money involved.
                System.out.println("Not enough money. This will be a practice round. You have bet 0 sinas.");
                wager = 0;
            } else if (wager < 0) {
                System.out.println("Invalid. This will be a practice round. You have bet 0 sinas.");
                wager = 0;
            }

            dealerHand = deck[(int) (Math.random() * deck.length)]; //The system for getting a random card is through getting a random index for the array
            playerHand = deck[(int) (Math.random() * deck.length)] + deck[(int) (Math.random() * deck.length)];

            System.out.print("\n\n");

            System.out.println("Dealer: " + dealerHand);
            System.out.println("Player: " + playerHand);

            while (playerHand < 21) {
                System.out.print("\nWill you (h)it or (s)tand? ");
                String choice = scan.nextLine().toLowerCase();

                if (choice.equals("h")) {
                    playerHand += deck[(int) (Math.random() * deck.length)];
                    System.out.println("\nDealer: " + dealerHand);
                    System.out.println("Player: " + playerHand);
                    sleep(0.5); //A pause for asthetics sake
                } else {
                    System.out.println("Standing...");
                    break;
                }
            }

            switch (playerHand) { //Giving a special message if you manage to get a blackjack (21 points)
                case 21:
                    System.out.println("\nYou got a blackjack! Good job!");
                    break;
                default:
                    break;
            }

            System.out.print("\n");

            if (playerHand <= 21) {
                while (dealerHand < 17) { //In blackjack, if the dealer gets over 17, it is forced to stand.
                    dealerHand += deck[(int) (Math.random() * deck.length)];
                    System.out.println("Dealer: " + dealerHand);
                    sleep(1); //pauses for dramatic effect
                }
            }


            if (playerHand > 21) {
                System.out.println("\nYou lose!");
                money -= wager;
            } else if (dealerHand > 21 || playerHand > dealerHand) {
                System.out.println("\nYou win!");
                money += wager;
            } else if (dealerHand == playerHand) {
                System.out.println("\nYou tied!");
                wager = 0;
            } else {
                System.out.println("\nYou lose!");
                money -= wager;
            }

            if (money <= 0) {
                break;
            }

            // Zimraan - game Story Start
            if (Math.random() <= 0.3) {
                System.out.println("\nThe dealer slides a thick stack to a quiet man at the end of the table. He never played a hand.\n");
                sleep(2);
            }
            // Zimraan - game Story End

            System.out.print("Want to play again? (y/n) ");
            String leave = scan.nextLine();
            if (leave.equals("n")) { //Only lets the user leave if they really want to, otherwise you're forced to keep playing :D
                System.out.println("\nReturning to front...\n\n");
                break;
            } else {
                System.out.println("\nThat's the sprit!\n");
            }
        }
    }

    // Ali (Horse Racing)
    public static void horseRacing(Random rand) {
        //user enters their choice of horse
        System.out.println("\n--- HORSE RACING ---");

        System.out.println("Choose your horse (Enter the number): ");
        System.out.println("1. Thunder");
        System.out.println("2. Shadow");
        System.out.println("3. Rocket");
        System.out.println("4. Thunderseus V");
        System.out.println("5. Fitxty Sixty");
        System.out.println("6. Nicholas");
        System.out.println("7. Genghis");
        System.out.println("8. Charlie");
        System.out.println("9. Trampeler");
        System.out.println("10. Horsey ");
        System.out.println("11. Raccoon");
        //scans their number for the choice of their horse
        int horse = scan.nextInt();
        scan.nextLine();

        String horseName;
        //associates number of horse with their name
        switch (horse) {
            case 1:
                horseName = "Thunder";
                break;
            case 2:
                horseName = "Shadow";
                break;
            case 3:
                horseName = "Rocket";
                break;
            case 4:
                horseName = "Thunderseus V";
                break;
            case 5:
                horseName = "Fitxty Sixty";
                break;
            case 6:
                horseName = "Nicholas";
                break;
            case 7:
                horseName = "Genghis";
                break;
            case 8:
                horseName = "Charlie";
                break;
            case 9:
                horseName = "Trampeler";
                break;
            case 10:
                horseName = "Horsey";
                break;
            case 11:
                horseName = "Raccoon";
                break;
            default:
                System.out.println("Invalid horse!");
                return;
        }


        //asks user how much they want to wager
        System.out.print("\nHow much will you bet? You have " + money + " Sinas: ");
        int wager = scan.nextInt();
        scan.nextLine();
        //scans their number
        while (wager > money || wager <= 0) //double checks if wager is valid like if they even have enough money for that wager
        {
            System.out.println("INVALID WAGER");
            System.out.print("Enter wager between 1 and " + money + ": ");
            wager = scan.nextInt();
            scan.nextLine();
        }

        System.out.println("\nThe race is starting!");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("GOOOOOO!!!!!");
        sleep(1);
        //winer's horse gets a speed boost thats true
        boolean boost = rand.nextBoolean();

        int winner;
        if (boost) {
            winner = horse;
            System.out.println("\n" + horseName + " got a SPEED BOOST!");
        } else {
            winner = rand.nextInt(11) + 1;
        }

        // Zimraan Game Story -- Start
        lastWinningHorse = winner;
        // Zimraan Game Story -- End

        //switch statement to associate the number with the winner horse
        String winnerName = "Unknown";

        switch (winner) {
            case 1:
                winnerName = "Thunder";
                break;
            case 2:
                winnerName = "Shadow";
                break;
            case 3:
                winnerName = "Rocket";
                break;
            case 4:
                winnerName = "Thunderseus V";
                break;
            case 5:
                winnerName = "Fitxty Sixty";
                break;
            case 6:
                winnerName = "Nicholas";
                break;
            case 7:
                winnerName = "Genghis";
                break;
            case 8:
                winnerName = "Charlie";
                break;
            case 9:
                winnerName = "Trampeler";
                break;
            case 10:
                winnerName = "Horsey";
                break;
            case 11:
                winnerName = "Raccoon";
                break;

        }

        //anounces winning horse
        System.out.println("\nThe winning horse was " + winnerName + "!");
        //if statement for the horse equating to the winner integer amount and it shows how much they won or lost
        if (winner == horse) {
            System.out.println("YOU WIN!");
            System.out.println("You won " + wager + " Sinas!");
            money += wager;
            sleep(1);
        } else {
            System.out.println("YOU LOSE!!!!");
            System.out.println("You lose " + wager + " Sinas!");
            money -= wager;
            sleep(1);

        }
        //updates their sinas
        System.out.println("You now have " + money + " Sinas");
        //offers this option if u still have money
        if (money > 0) {
            System.out.print("\nRace again? (y/n) ");
            String again = scan.nextLine();

            if (again.equals("y")) {
                horseRacing(rand);
            } else {
                System.out.println("\nReturning to front...\n");
            }
        }
    }

    // Zimraan - wait method
    public static void sleep(double time) {
        // Using Thread.sleep after converting from secconds to millisecconds
        try {
            Thread.sleep((long) (time * 1000));
        } catch (InterruptedException e) {
            System.out.println("The sleep was interrupted!");
        }

    }

    // Zimraan Cryptography - encrypts and decrypts a message using a ceaser cypher
    public static String ceaser(String message, int shift) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        message = message.toLowerCase();

        // Repeats for every letter in the message
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            int position = alfabet.indexOf(letter);

            // Shifts each letter by the selected amount using the alphabet variable
            switch (position) {
                case -1:
                    result += letter;
                    break;
                default:
                    int newPosition = (position + shift) % 26;
                    if (newPosition < 0) {
                        newPosition += 26;
                    }
                    result += alfabet.charAt(newPosition);
            }
        }
        return result;

    }

    // Zimraan - Say Letter by letter
    public static void letterByLetter(String message) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            sleep(0.3);
        }
        System.out.println("");
    }

    // Zimraan - Helper method for styled text
    public static void say(String line) {
        System.out.println(YELLOW + "\"" + line + "\"" + RESET);
    }
}
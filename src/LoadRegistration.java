import java.util.Scanner;

public class LoadRegistration {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 500;
    static String whiteSpace = "\n\n\n\n\n\n\n\n\n\n\n";

    public static void main(String[] args) {
        validateUssdCode();
        mainMenu();
    }

    public static void validateUssdCode() {
        boolean isAccessCodeCorrect = false;
        System.out.println(whiteSpace);


        while (!isAccessCodeCorrect) {
            System.out.println("Dial *143# to access Globe Services (Enter \"0\" to exit)");
            System.out.print("Enter USSD Code: ");
            String ussdCode = scanner.nextLine().trim();

            //exit when 0
            if(ussdCode.equals("0")) {
                System.out.println("Exiting. . .");
                System.exit(0); // Exit JVM
            }
            //continue to main menu
            else if (ussdCode.equals("*143#")) {
                isAccessCodeCorrect = true;
            }
            //loop on the entry
            else {
                System.out.println(whiteSpace);
                System.out.println("Invalid Code. Please try again.");
            }
        }
    }

    public static void mainMenu() {
        boolean isChoiceValid = false;

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
            System.out.println("***  SimMoto Menu  ***");
            System.out.println("    [1] Unli Text Promos");
            System.out.println("    [2] Unli Call Promos");
            System.out.println("    [3] Unli Call & Text Promos");
            System.out.println("    [4] Surf Promos");
            System.out.println("    [5] Check Balance");
            System.out.println("    [6] Borrow Load");
            System.out.println("    [0] Exit");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    unliTextPromo();
                    break;

                case "2":
                    unliCallPromo();
                    break;

                case "3":
                    unliCallTextPromo();
                    break;

                case "4":
                    surfPromo();
                    break;

                case "5":
                    checkBalance();
                    break;

                case "6":
                    borrowLoad();
                    break;

                case "0":
                    exitFunction();
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");

            }
        }
    }

    public static void unliTextPromo() {
        boolean isGoingBackToMainMenu = false;

        System.out.println(whiteSpace);

        while(!isGoingBackToMainMenu) {
            System.out.println("***  Unli Text Promos  ***");
            System.out.println("    [1] 1 Day for P10");
            System.out.println("    [2] 3 Days for P30");
            System.out.println("    [3] 5 Days for P50");
            System.out.println("    [4] 15 Days for P140");
            System.out.println("    [5] 30 Days for P250");
            System.out.println("    [6] Back");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Text", 1, 10, 1);
                    break;

                case "2":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Text", 3, 30, 2);
                    break;

                case "3":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Text", 5, 50, 3);
                    break;

                case "4":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Text", 15, 140, 5);
                    break;

                case "5":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Text", 30, 250, 10);
                    break;

                case "6":
                    isGoingBackToMainMenu = true;
                    System.out.println(whiteSpace);
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void unliCallPromo() {
        boolean isGoingBackToMainMenu = false;

        System.out.println(whiteSpace);

        while(!isGoingBackToMainMenu) {
            System.out.println("***  Unli Call Promos  ***");
            System.out.println("    [1] 1 Day for P20");
            System.out.println("    [2] 3 Days for P50");
            System.out.println("    [3] 7 Days for P100");
            System.out.println("    [4] 15 Days for P180");
            System.out.println("    [5] 30 Days for P300");
            System.out.println("    [6] Back");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call", 1, 20, 0);
                    break;

                case "2":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call", 3, 50, 0);
                    break;

                case "3":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call", 7, 100, 0);
                    break;

                case "4":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call", 15, 180, 0);
                    break;

                case "5":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call", 30, 300, 0);
                    break;

                case "6":
                    isGoingBackToMainMenu = true;
                    System.out.println(whiteSpace);
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void unliCallTextPromo() {
        boolean isGoingBackToMainMenu = false;

        System.out.println(whiteSpace);

        while(!isGoingBackToMainMenu) {
            System.out.println("***  Unli Call & Text Promos  ***");
            System.out.println("    [1] 1 Day for P30");
            System.out.println("    [2] 3 Days for P70");
            System.out.println("    [3] 7 Days for P120");
            System.out.println("    [4] 15 Days for P200");
            System.out.println("    [5] 30 Days for P350");
            System.out.println("    [6] Back");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call & Text", 1, 30, 1);
                    break;

                case "2":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call & Text", 3, 70, 2);
                    break;

                case "3":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call & Text", 7, 120, 3);
                    break;

                case "4":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call & Text", 15, 200, 5);
                    break;

                case "5":
                    isGoingBackToMainMenu = subscriptionConfirmation("Unli Call & Text", 30, 350, 10);
                    break;

                case "6":
                    isGoingBackToMainMenu = true;
                    System.out.println(whiteSpace);
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void surfPromo() {
        boolean isGoingBackToMainMenu = false;

        System.out.println(whiteSpace);

        while(!isGoingBackToMainMenu) {
            System.out.println("***  Surf Promos  ***");
            System.out.println("    [1] 1GB for P20");
            System.out.println("    [2] 2GB for P40");
            System.out.println("    [3] 5GB for P90");
            System.out.println("    [4] 10GB for P170");
            System.out.println("    [5] 20GB for P300");
            System.out.println("    [6] Back");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    isGoingBackToMainMenu = surfSubscriptionConfirmation(1, 20);
                    break;

                case "2":
                    isGoingBackToMainMenu = surfSubscriptionConfirmation(2, 40);
                    break;

                case "3":
                    isGoingBackToMainMenu = surfSubscriptionConfirmation(5, 90);
                    break;

                case "4":
                    isGoingBackToMainMenu = surfSubscriptionConfirmation(10, 170);
                    break;

                case "5":
                    isGoingBackToMainMenu = surfSubscriptionConfirmation(20, 300);
                    break;

                case "6":
                    isGoingBackToMainMenu = true;
                    System.out.println(whiteSpace);
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static boolean subscriptionConfirmation(String promoType, int days, int price, int gb) {
        String daysStr = days > 1 ? "days" : "day";
        String gbStr = gb > 0 ? " with " + gb + "GB data for free." : ".";

        System.out.println(whiteSpace);

        while(true) {
            System.out.println("->  Get " + days + " " + daysStr + " " + promoType + " Promo for only P" + price + gbStr);
            System.out.println("   [1] Subscribe");
            System.out.println("   [2] Back");
            System.out.println("   [3] Exit");
            System.out.print("Enter choice: ");
            String subChoice = scanner.nextLine();
            System.out.println(whiteSpace);

            switch (subChoice){
                case "1":
                    if (balance >= price) {
                        balance -= price;
                        System.out.println("You are now subscribed to " + promoType + " " + price + " Promo...");
                    } else {
                        System.out.printf("You only have P%.2f in your account. Try borrowing load to continue.%n", balance);
                    }
                    backToMainMenuPrompt();
                    System.out.println(whiteSpace);
                    return true;

                case "2":
                    return false;

                case "3":
                    exitFunction();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static boolean surfSubscriptionConfirmation(int gb, int price) {

        System.out.println(whiteSpace);

        while(true) {
            System.out.println("->  Get " + gb + "GB Surf Promo for only P" + price + ".");
            System.out.println("   [1] Subscribe");
            System.out.println("   [2] Back");
            System.out.println("   [3] Exit");
            System.out.print("Enter choice: ");
            String subChoice = scanner.nextLine();
            System.out.println(whiteSpace);

            switch (subChoice){
                case "1":
                    if (balance >= price) {
                        balance -= price;
                        System.out.println("You are now subscribed to " + gb + "GB Surf Promo...");
                    } else {
                        System.out.printf("You only have P%.2f in your account. Try borrowing load to continue.%n", balance);
                    }
                    backToMainMenuPrompt();
                    System.out.println(whiteSpace);
                    return true;

                case "2":
                    return false;

                case "3":
                    exitFunction();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void checkBalance() {
        System.out.println(whiteSpace);
        System.out.printf("Your current balance is P%.2f%n", balance);
        backToMainMenuPrompt();
        System.out.println(whiteSpace);
    }

    public static void borrowLoad() {
        boolean isChoiceValid = false;

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
            System.out.println("***  Borrow Load  ***");
            System.out.println("    [1] Borrow P10");
            System.out.println("    [2] Borrow P20");
            System.out.println("    [3] Borrow P50");
            System.out.println("    [4] Borrow P100");
            System.out.println("    [5] Back");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    borrowLoadSuccess(10);
                    isChoiceValid = true;
                    break;

                case "2":
                    borrowLoadSuccess(20);
                    isChoiceValid = true;
                    break;

                case "3":
                    borrowLoadSuccess(50);
                    isChoiceValid = true;
                    break;

                case "4":
                    borrowLoadSuccess(100);
                    isChoiceValid = true;
                    break;

                case "5":
                    isChoiceValid = true;
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println(whiteSpace);
    }

    public static void borrowLoadSuccess(int price) {
        System.out.println(whiteSpace);
        balance += price;
        System.out.println("You successfully borrowed P" + price + " load.");
        System.out.printf("Your new balance is P%.2f%n", balance);
        backToMainMenuPrompt();
    }

    public static void backToMainMenuPrompt() {
        System.out.println("[Press \"Enter\" to return to main menu.]");
        scanner.nextLine();
    }

    public static void exitFunction() {
        System.out.println("Thank you for using our service.");
        System.out.println("Exiting...");
        System.exit(0); // Exit JVM
    }


}


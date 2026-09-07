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
        boolean isChoiceValid = false;

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
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
                    subscriptionConfirmation("Unli Text", 1, 10, 1);
                    break;

                case "2":
                    subscriptionConfirmation("Unli Text", 3, 30, 2);
                    break;

                case "3":
                    subscriptionConfirmation("Unli Text", 5, 50, 3);
                    break;

                case "4":
                    subscriptionConfirmation("Unli Text", 15, 140, 5);
                    break;

                case "5":
                    subscriptionConfirmation("Unli Text", 30, 250, 10);
                    break;

                case "6":
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }

            if (choice.equals("1") ||
                    choice.equals("2") ||
                    choice.equals("3") ||
                    choice.equals("4") ||
                    choice.equals("5") ||
                    choice.equals("6")) {
                isChoiceValid = true;
            }
        }
    }

    public static void unliCallPromo() {
        boolean isChoiceValid = false;

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
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
                    subscriptionConfirmation("Unli Call", 1, 20, 0);
                    break;

                case "2":
                    subscriptionConfirmation("Unli Call", 3, 50, 0);
                    break;

                case "3":
                    subscriptionConfirmation("Unli Call", 7, 100, 0);
                    break;

                case "4":
                    subscriptionConfirmation("Unli Call", 15, 180, 0);
                    break;

                case "5":
                    subscriptionConfirmation("Unli Call", 30, 300, 0);
                    break;

                case "6":
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }

            if (choice.equals("1") ||
                    choice.equals("2") ||
                    choice.equals("3") ||
                    choice.equals("4") ||
                    choice.equals("5") ||
                    choice.equals("6")) {
                isChoiceValid = true;
            }
        }
    }

    public static void unliCallTextPromo() {
        boolean isChoiceValid = false;

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
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
                    subscriptionConfirmation("Unli Call & Text", 1, 30, 1);
                    break;

                case "2":
                    subscriptionConfirmation("Unli Call & Text", 3, 70, 2);
                    break;

                case "3":
                    subscriptionConfirmation("Unli Call & Text", 7, 120, 3);
                    break;

                case "4":
                    subscriptionConfirmation("Unli Call & Text", 15, 200, 5);
                    break;

                case "5":
                    subscriptionConfirmation("Unli Call & Text", 30, 350, 10);
                    break;

                case "6":
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }

            if (choice.equals("1") ||
                    choice.equals("2") ||
                    choice.equals("3") ||
                    choice.equals("4") ||
                    choice.equals("5") ||
                    choice.equals("6")) {
                isChoiceValid = true;
            }
        }
    }

    public static void surfPromo() {
        boolean isChoiceValid = false;

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
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
                    surfSubscriptionConfirmation(1, 20);
                    break;

                case "2":
                    surfSubscriptionConfirmation(2, 40);
                    break;

                case "3":
                    surfSubscriptionConfirmation(5, 90);
                    break;

                case "4":
                    surfSubscriptionConfirmation(10, 170);
                    break;

                case "5":
                    surfSubscriptionConfirmation(20, 300);
                    break;

                case "6":
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }

            if (choice.equals("1") ||
                    choice.equals("2") ||
                    choice.equals("3") ||
                    choice.equals("4") ||
                    choice.equals("5") ||
                    choice.equals("6")) {
                isChoiceValid = true;
            }
        }
    }

    public static void subscriptionConfirmation(String promoType, int days, int price, int gb) {
        boolean isChoiceValid = false;
        String daysStr = days > 1 ? "days" : "day";

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
            if (gb > 0) {
                System.out.println("->  Get " + days + " " + daysStr + " " + promoType + " Promo for only P" + price + " with " + gb + "GB data for free.");
            }
            else {
                System.out.println("->  Get " + days + " " + daysStr + " " + promoType + " Promo for only P" + price + ".");
            }

            System.out.println("   [1] Subscribe");
            System.out.println("   [2] Back");
            System.out.println("   [3] Exit");
            System.out.print("Enter choice: ");
            String subChoice = scanner.nextLine();

            switch (subChoice){
                case "1":
                    if (balance >= price) {
                        balance -= price;
                        System.out.println("You are now subscribed to " + promoType + " " + price + " Promo...");
                        isChoiceValid = true;
                    } else {
                        System.out.println("You don't have enough balance. Try borrowing load to continue.");
                    }
                    break;

                case "2":
                    isChoiceValid = true;
                    break;

                case "3":
                    exitFunction();
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void surfSubscriptionConfirmation(int gb, int price) {
        boolean isChoiceValid = false;

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
            System.out.println("->  Get " + gb + "GB Surf Promo for only P" + price + ".");
            System.out.println("   [1] Subscribe");
            System.out.println("   [2] Back");
            System.out.println("   [3] Exit");
            System.out.print("Enter choice: ");
            String subChoice = scanner.nextLine();

            switch (subChoice){
                case "1":
                    if (balance >= price) {
                        balance -= price;
                        System.out.println("You are now subscribed to " + gb + "GB Surf Promo...");
                        isChoiceValid = true;
                    } else {
                        System.out.println("You don't have enough balance. Try borrowing load to continue.");
                    }
                    break;

                case "2":
                    isChoiceValid = true;
                    break;

                case "3":
                    exitFunction();
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void checkBalance() {
        System.out.println(whiteSpace);
        System.out.println("Your current balance is P" + balance);
        System.out.println("Press Enter to go back to the main menu.");
        scanner.nextLine();
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
            System.out.println("    [4] Back");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    balance += 10;
                    System.out.println("You borrowed P10 load.");
                    System.out.println("Your new balance is P" + balance);
                    isChoiceValid = true;
                    break;

                case "2":
                    balance += 20;
                    System.out.println("You borrowed P20 load.");
                    System.out.println("Your new balance is P" + balance);
                    isChoiceValid = true;
                    break;

                case "3":
                    balance += 50;
                    System.out.println("You borrowed P50 load.");
                    System.out.println("Your new balance is P" + balance);
                    isChoiceValid = true;
                    break;

                case "4":
                    isChoiceValid = true;
                    break;

                default:
                    System.out.println(whiteSpace);
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println(whiteSpace);
    }

    public static void exitFunction() {
        System.out.println("Thank you for using our service.");
        System.out.println("Exiting. . .");
        System.exit(0); // Exit JVM
    }


}


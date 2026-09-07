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
            //continue to main menu when code is correct
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
//                    unliCallPromo();
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
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
                    subscriptionConfirmation(1, 10, 1);
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
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

    public static void subscriptionConfirmation(int days, int price, int gb) {
        boolean isChoiceValid = false;
        String daysStr = days > 1 ? "days" : "day";

        System.out.println(whiteSpace);

        while(!isChoiceValid) {
            System.out.println("->  Get " + days + " " + daysStr + " Unli Text Promo for only P" + price + " with " + gb + "gb data for free.");
            System.out.println("   [1] Subscribe");
            System.out.println("   [2] Back");
            System.out.println("   [3] Exit");
            System.out.println("Enter choice: ");
            String subChoice = scanner.nextLine();

            switch (subChoice){
                case "1":
                    if (balance >= price) {
                        balance -= price;
                        System.out.println("You are now subscribed to Unli Text " + price + " Promo...");
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

    public static void exitFunction() {
        System.out.println("Thank you for using our service.");
        System.out.println("Exiting. . .");
        System.exit(0); // Exit JVM
    }


}


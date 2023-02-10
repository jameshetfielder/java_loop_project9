import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int right = 3, selection;
        double balance = 10000d, withdraw, deposit;
        boolean exitProcess = true;


        String userName = ("leskof"), password = ("leskof123");

        System.out.print("Welcome to bank!\n");

        while (right != 0) {
            System.out.print("USERNAME:");
            userName = input.nextLine();
            System.out.print("PASSWORD:");
            password = input.nextLine();
            if (userName.equals("leskof") && password.equals("leskof123")) {
                System.out.print("Login success! \nWelcome to our ATM " + userName + "!");
                break;
            }
            else right--;
            if (right != 0) {
                System.out.println("Wrong username or password. Please try again. (" + right + " left)");
            }
            else
                System.out.print("Wrong username or password. Your account blocked!");
        }
        do {System.out.println("\nHow can I help you " + userName + "?");
            System.out.println("1- Withdraw" +
                    "\n2- Deposit" +
                    "\n3- Balance info" +
                    "\n4- Exit");
            selection = input.nextInt();
            if (selection >= 1 && selection <= 4) {
                if (selection == 1) {
                    System.out.print("Please type amount:");
                    withdraw = input.nextDouble();
                    balance -= withdraw;
                    if (balance >= withdraw) {
                        System.out.println("Withdraw process done! " +
                                withdraw + "$" + " will pay." +
                                "\nCurrent " + "balance " + "is:" + balance + "$");
                    } else
                        System.out.print("You can not withdraw much more than your current balance. " +
                                "\nPlease restart the process...");
                }
                if (selection == 2) {
                    System.out.print("Please type amount:");
                    deposit = input.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit process done! " +
                                deposit + "$" + " will added your balance." +
                                "\nCurrent " + "balance " + "is:" + balance + "$");
                    } else System.out.print("Please restart program.");
                }
                if (selection == 3) {
                    System.out.println("Your current balance is " + balance + "$");
                }
                if (selection == 4) {
                    System.out.print("Exiting... See you later " + userName + "!");
                    exitProcess = false;
                }
            }
            else System.out.print("Wrong selection detected. Selection must be in range 1-4.");
            }
        while (exitProcess);
        }
}

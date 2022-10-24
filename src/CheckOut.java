import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        boolean done = false;
        double total = 0;

        System.out.println("Welcome to the ten dollar shop.");
        do {

        double itemPrice = SafeInput.getRangedDouble(kb, "Enter the item price", .50,10);
        kb.nextLine();

        total = total + itemPrice;

        done = SafeInput.getYNConfirm(kb, "Would you like to add another item?");

        } while (done != false);

        System.out.printf("Your total is $%.2f\n",total);
    }
}

import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int favInt = SafeInput.getInt(kb, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(kb, "Enter your favorite double");

        System.out.println("The users fav int is " + favInt + " and their favorite double is " + favDouble);
    }
}

import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String username = "";
        String firstName = SafeInput.getNonZeroLenString(kb, "Enter your first name");
        String lastName = SafeInput.getNonZeroLenString(kb, "Enter your last name");

        username = firstName + " " + lastName;

        System.out.println("the user's name is: " + username);

    }
}

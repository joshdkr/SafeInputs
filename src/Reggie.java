import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(kb, "Enter your SSN as ###-##-####", "\\d{3}-\\d{2}-\\d{4}");

        String mNumber = SafeInput.getRegExString(kb, "Enter your M Number", "(M|m)\\d{5}");

        String selection = SafeInput.getRegExString(kb, "[O]pen [S]ave [V]iew [Q]uit", "[OoSsVvQq]");

        System.out.println("Your SSN is " + ssn + ", your M Number is " + mNumber + " and you selected menu option " + selection);



    }
}

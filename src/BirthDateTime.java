import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int year = SafeInput.getRangedInt(kb, "Enter your birth year", 1950, 2010);
        kb.nextLine();

        int month = SafeInput.getRangedInt(kb, "Enter your birth month", 1, 12);
        kb.nextLine();

        int x = 0;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                x = 31;
                break;
            case 2:
                x = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                x = 30;
                break;


        }


        int day = SafeInput.getRangedInt(kb, "Enter your birth day", 1, x);
        kb.nextLine();



        int hour = SafeInput.getRangedInt(kb, "Enter your birth hour", 1, 24);
        kb.nextLine();

        int minute = SafeInput.getRangedInt(kb, "Enter your birth minute", 1, 59);
        kb.nextLine();

        System.out.println("You were born on the " + day + " day of the " + month + " month of the year " + year + " at " + hour + ":" + minute);

    }
}




// if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
//        {
//            int day = SafeInput.getRangedInt(kb, "Enter your birth day", 1, 31);
//        }
//        if (month == 2)
//        {
//            int day = SafeInput.getRangedInt(kb, "Enter your birth day", 1, 29);
//        }
//        if
//        {
//            int day = SafeInput.getRangedInt(kb, "Enter your birth day", 1, 30);
//        }







//
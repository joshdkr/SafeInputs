public class CtoFTableDisplay {
    public static void main(String[] args) {


        int count = -100;
        for ( count = -100; count <= 100; count++)
        {
            double far = SafeInput.CtoF(count);
            System.out.println(count + " || " + far);
        }
    }
}

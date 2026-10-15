import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        //creat scanner
        Scanner theScanner = new Scanner(System.in);

        //ask the user for the first number
        System.out.println("enter the first number");

        //store the answer for the user
        int firstnumber = theScanner.nextInt();

        //ask the user for second number;
        System.out.println("enter the second number");

        //store the answer for the second number
        int secondnumber =theScanner.nextInt();

        theScanner.nextLine();

        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option:");
        //store the answere to what operation
        String opration=theScanner.nextLine();

        int result = firstnumber * secondnumber ;

        System.out.println(firstnumber + " * " + secondnumber + " = " + result);








    }
}

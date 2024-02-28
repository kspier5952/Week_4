import java.util.*;
/**
 * Katelyn Spier 
 * 2/28/24
 */
public class Digits_Revised {
    public static void main(String[]args){
        int number;
        int hundreds;
        int tens;
        int ones;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        number = input.nextInt();
        input.close();
        hundreds = (number-(number%100))/100;
        tens = ((number%100)-(number%10))/10;
        ones = (number%10);
        System.out.println("The hundreds place is " + hundreds);
        System.out.println("The tens place is " + tens);
        System.out.println("The ones place is " + ones);
    }
}

/**
 * Katelyn Spier 
 * 2/27/24
 */
public class Week_4 {
    public static void main(String[]args){
        int number;
        number = 526;
        int hundreds;
        hundreds = (number-(number%100))/100;
        int tens;
        tens = ((number%100)-(number%10))/10;
        int ones;
        ones = (number%10);
        System.out.println("The hundreds place is " + hundreds);
        System.out.println("The tens place is " + tens);
        System.out.println("The ones place is " + ones);
    }
}

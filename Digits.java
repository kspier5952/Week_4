public class Digits {
    public static void main(String[]args){
        int number;
        number = 258;
        System.out.println("The hundred place is " + (number-(number%100))/100);
        System.out.println("The tens place is " + (number-(number%10))/10);
        System.out.println("The ones place is " + (number-(number%1))/1);
    }
}
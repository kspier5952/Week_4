import java.util.Scanner;

public class GradeAvg {
    public static void main(String[]args){
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        int allNums;
        int average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first grade: ");
        grade1 = input.nextInt();
        System.out.print("Enter the second grade: ");
        grade2 = input.nextInt();
        System.out.print("Enter the third grade: ");
        grade3 = input.nextInt();
        System.out.print("Enter the fourth grade: ");
        grade4 = input.nextInt();
        System.out.print("Enter the fifth grade: ");
        grade5 = input.nextInt();
        input.close();
        allNums = (grade1+grade2+grade3+grade4+grade5);
        average = (allNums/5);
        System.out.print(average);
    }
}

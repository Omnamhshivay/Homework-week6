import java.util.Scanner;

public class Project13 {
    //a Java program that takes three numbers as input to calculate and  print the average of the numbers

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scan.nextInt();

        System.out.print("Input second number: ");
        int num2 = scan.nextInt();

        System.out.print("Input third number: ");
        int num3 = scan.nextInt();

        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3) / 5);
    }
}

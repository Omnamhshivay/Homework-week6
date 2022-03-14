import java.util.Scanner;

public class Project16 {


    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter first binary number");
        String x = Input.next();
        System.out.println("Enter second binary number");
        String y =Input.next();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int sum =a+b;
        System.out.println("Sum of two binary numbers: "+ Integer.toBinaryString(sum));

    }
}

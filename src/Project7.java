import java.util.Scanner;

public class Project7 {
    //a program to insert any temperature value in degree Fahrenheit and
    // convert to degree Celsius ((F − 32) × 5/9 = 0°C).
    public static void main(String[] args) {

        float celsius,fahrenheit;
        Scanner scan = new Scanner(System.in);
        // Reads temperature in fahrenheit
        System.out.println("Enter temperature in Fahrenheit :");

        fahrenheit=scan.nextInt();
        // Fahrenheit to celsius conversion formula
        celsius=(fahrenheit - 32)*5/9;
        // Print the result
        System.out.println("Celsius = "+celsius);

    }






}

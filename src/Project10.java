import java.util.Scanner;

public class Project10 {
    //a Java program that takes a number as input and prints its  multiplication table up to 10

    public static void main(String[] args) {

        int i,k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the table");
        int n= scan.nextInt();
        for (i=1;i<=10;i++){
        k=n*i;
        System.out.println(n+ "*" +i+ "=" +k);}

    }
}

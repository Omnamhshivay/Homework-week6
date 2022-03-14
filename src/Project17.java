public class Project17 {
    //a Java program to convert a decimal number to binary number.  Input Data:
    // Input a Decimal Number : 5

    public void convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String a[]) {
        Project17 obj = new Project17();
        System.out.println("Binary representation of :5 ");
        obj.convertBinary(5);

    }
}

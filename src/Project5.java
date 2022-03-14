public class Project5 {
//    a program for a calculator with addition, subtraction, multiplication  and division
//    methods all with parameters and use string concatenation  methods.(Note: Two static and Two instance methods.)

    public void addition(int a,int b){
      int sum=a+b;
      System.out.println(a+"+" +b+ "=" +sum);
    }
    public void subtraction( int a, int b) {
      int sum=a-b;
        System.out.println(a+ "-" +b+ "=" +sum);
    }
    static void multiplication( int a, int b){
        int sum=a*b;
        System.out.println(a+ "*" +b+ "=" +sum);
    }
    static void division(double a, double b){
        double sum=a/b;
        System.out.println(a+ "/" +b+ "=" +sum);

    }

    public static void main(String[] args) {
        Project5 obj =new Project5();
        obj.addition(5,10);
        obj.subtraction(5,10);
        Project5.multiplication(5,10);
        Project5.division(5,10);
    }
}

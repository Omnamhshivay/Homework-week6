public class Project4 {
    //4.1 Declare two instance and two static variables.
    //4.2 Declare one instance method.
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.

    int a = 100;
    int b = 200;
    static int c = 300;
    static int d = 400;

    public void test(){

        System.out.println(a);
        System.out.println(b);
        System.out.println(Project4.c);
        System.out.println(Project4.d);
    }

    static public void test2() {
        Project4 obj = new Project4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void main(String[] args) {
        Project4 obj1 = new Project4();
        obj1.test();
        test2();

    }
}
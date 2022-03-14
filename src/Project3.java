public class Project3 {
    // 3.1 Declare one instance and one static variable.
    // 3.2 Declare one instance method.
    // 3.3 Declare one static method.
    // 3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
    // 3.5 Declare the Main method.
    // 3.6 Call both instance and static methods into the Main method and run the programme.

    // Declare one instance method and static method
       int a =100;
    static int b =200;
    public void test(){
        System.out.println(a);
        System.out.println(b);
    }
    static public void test2(){
        Project3 obj =new Project3();
        System.out.println(obj.a);
        System.out.println(Project3.b);

    }

    public static void main(String[] args) {
        Project3 obj1 = new Project3();
        obj1.test();
        test2();
    }
}

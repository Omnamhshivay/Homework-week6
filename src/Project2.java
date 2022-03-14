public class Project2 {
    // declare static variable
    static int a =100;
    static int b =200;
    // static method
    static public void test(){
        System.out.println(a);//100
        System.out.println(b);//2009650

    }
    // main method
    public static void main(String[] args) {
        Project2.test();// calling static method in to main method
    }
}

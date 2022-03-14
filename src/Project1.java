public class Project1 {
// Declare two instance variable
    int a=100;
    int b=200;
    // Instance method
    public void main(){
        // print statement
        System.out.println(a);//100
        System.out.println(b);//200
    }
     // Declare the main method
    public static void main(String[] args) {
        Project1 obj=new Project1();// object created
        obj.main();// 100, 200
    }
}

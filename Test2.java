public class Test2{
    public static void main(String args[])
    {
        int a = 10;
        // System.out.println(a+++++a); // Error
        // System.out.println(a+++ ++a); // Running 
        // System.out.println(a++ + ++a); // Running

        // System.out.println(++a+++a); // Error
        System.out.println(++a+ ++a); // Running

    }
}
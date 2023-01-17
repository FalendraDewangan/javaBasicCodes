import java.util.*;
public class ApSeriesRecursion{

    public static void solve(int a, int d, int e)
    {
        if(d<0 && a<e)
            return;
        if(d>0 && a>e)
            return;

        System.out.print(a+" ");
        solve(a+d, d, e); 
        System.out.print(a+" ");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, d, e;

        System.out.print("Enter the value of first term : ");
        a = sc.nextInt();

        System.out.print("Enter the value of commom difference : ");
        d = sc.nextInt();

        System.out.print("Enter the value of last term : ");
        e = sc.nextInt();

        System.out.println("The output is : ");
        solve(a, d, e);
    }
}
import java.util.*;

public class TrailingZeroCountRecursion{

    static int solve(int num){
        if(num%10 != 0)
            return 0;

        return 1 + solve(num/10);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int ans = solve(num);
        System.out.println("Number of trailing 0 is : " + ans);
    }
}
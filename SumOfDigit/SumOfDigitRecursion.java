import java.util.*;

public class SumOfDigitRecursion{

    static int solve(int num){
        if(num == 0)
            return 0;

        return num % 10 + solve(num/10);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int ans = solve(num);
        System.out.println("Sum of Digit is : " + ans);
    }
}
import java.util.*;
public class Sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Enter your first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        num2 = sc.nextInt();

        // System.out.println("Maximum of "+num1+" and "+num2+" is "+Math.max(num1, num2));
        int maxi = (num1+num2)/2;
        maxi += (num2-num1)/2;
        System.out.println("Maximum of "+num1+" and "+num2+" is "+maxi);
    }
}
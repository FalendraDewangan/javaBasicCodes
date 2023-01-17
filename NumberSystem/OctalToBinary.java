import java.util.Scanner;

public class OctalToBinary {
    static int getDecimalFromOctal(int octal)
    {
        int decimal=0;
        int p = 1;
        while(octal!=0)
        {
            int digit = octal%10;
            decimal += digit*p;
            p *= 8;
            octal /= 10;
        }
        return decimal;
    }

    static int getBinaryFromDecimal(int decimal)
    {
        int binary=0;
        int p = 1;
        while(decimal!=0)
        {
            int digit = decimal%2;
            binary += digit*p;
            p *= 10;
            decimal /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the octal number: ");
        int octal = sc.nextInt();
        
        // int binary;

        int decimal = getDecimalFromOctal(octal);
        // System.out.println(decimal);

        int binary = getBinaryFromDecimal(decimal);
        System.out.println("The binary Conversion of octal number "+ octal+" is : "+binary);
    }
}
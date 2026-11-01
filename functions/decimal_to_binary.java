package functions;

import java.util.*;

public class decimal_to_binary {
    public static int dectobin(int n){ 
        int num = n;
        int binary= 0;
        int pow=0;
        while (num!=0) {
            int digit = num%2;
            binary = binary+ (digit*((int)Math.pow(10, pow)));
            pow++;
            num/=2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");;
        int dec = sc.nextInt();
        int bin = dectobin(dec);
        System.out.println("The value of decimal number " + dec + " is " + bin);
        sc.close();
    }
}

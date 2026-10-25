package functions;

import java.util.*;
public class binary_to_decimal {
    public static int bintodec(int n){ 
        int num = n;
        int dec=0;
        int pow = 0;
        while(num!=0){ 
            int digit=num%10;
            dec += digit*( (int)Math.pow((int)2,(int)pow));
            pow++;
            num/=10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");;
        int bin = sc.nextInt();
        int dec = bintodec(bin);
        System.out.println("The value of binary number " + bin + " is " + dec);
        sc.close();
    }
}

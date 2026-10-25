package loops;

import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(num);i++){ 
            if (num%i == 0){ 
                isprime = false;
                break;
            }
        }
        if (isprime == true){ 
            System.out.println("The number is prime");
        }
        else{ 
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}

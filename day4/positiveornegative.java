package day4;

import java.util.*;

public class positiveornegative {
    
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if (a>0){
            System.out.println("Your number is positive");
        }else {
            System.out.println("Your number is negative or zero");
        }
        sc.close();

    }
}

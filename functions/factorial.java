package functions;

import java.util.*;
public class factorial {
    public static int fac(int n){ 
        int num =1;
        if(n==0 || n==1){ 
            return 1;
        }
        else if(n<0){ 
            System.out.println("Please enter a positive integer");        }
        else{
            if (n>1){
                num = n*fac(n-1);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which factorial is needed");
        int n = sc.nextInt();
        System.out.println("The factorial is "+ fac(n));
        sc.close();
    }
}

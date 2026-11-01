package patterns;

import java.util.Scanner;

public class rhombus_solid {
    public static void rhombus(int n){ 
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=n-i;j++){ 
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        rhombus(n);
        sc.close();
    }
}

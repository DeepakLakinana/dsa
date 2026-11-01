package patterns;

import java.util.Scanner;

public class inverted_halfpyramid_number {
    public static void halfpyramid_num(int n){ 
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=n-i+1;j++){ 
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        halfpyramid_num(n);
        sc.close();
    }
}

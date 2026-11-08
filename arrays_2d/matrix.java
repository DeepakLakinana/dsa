package arrays_2d;

import java.util.*;

public class matrix {
    public static void main(String args[]){ 
        int matrix1[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers for the matrix");

        for(int i=0;i<matrix1.length;i++){ 
            for(int j=0;j<matrix1[0].length;j++){ 
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<matrix1.length;i++){ 
            for(int j=0;j<matrix1[0].length;j++){ 
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

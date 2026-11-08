package arrays_2d;

import java.util.Scanner;

public class diagonalsum {
    public static int bruteforce(int matrix[][]){ 
        int sum= 0;
        for(int i=0;i<matrix.length;i++){ 
            for(int j=0;j<matrix[0].length;j++){ 
                if(i==j){ 
                    sum += matrix[i][j];
                }
                else if(i+j==matrix.length-1){ 
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int optimized(int matrix[][]){ 
        int sum =0;
        for(int i=0;i<matrix.length;i++){ 
            sum += matrix[i][i];
            if(i!=matrix.length-1-i){ 
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix1[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers for the matrix");

        for(int i=0;i<matrix1.length;i++){ 
            for(int j=0;j<matrix1[0].length;j++){ 
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("The diagonal sum is = "+bruteforce(matrix1));
        System.out.println("The diagonal sum is = "+optimized(matrix1));
        sc.close();
    }
}

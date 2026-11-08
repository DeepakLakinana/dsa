package arrays_2d;

import java.util.*;

public class spiral {
    public static void printspiral(int matrix[][]){ 
        int startrow =0;
        int starcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length -1;

        while(startrow<=endrow && starcol<=endcol){ 
            for(int i = starcol;i<=endcol;i++){ 
                System.out.print(matrix[startrow][i]+" ");
            }

            for(int i =startrow+1;i<=endrow;i++){ 
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int i = endcol-1;i>=starcol;i--){ 
                System.out.print(matrix[endrow][i]+" ");
            }

            for(int i =endrow-1;i>=startrow+1;i--){ 
                System.out.print(matrix[i][starcol]+" ");
            }
            
            starcol++;
            startrow++;
            endcol--;
            endrow--;
        }

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

        printspiral(matrix1);
        sc.close();
    
    }
}

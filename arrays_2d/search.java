package arrays_2d;

import java.util.*;

public class search {
    public static boolean search1(int matrix[][],int key){ 
        for(int i=0;i<matrix.length;i++){ 
            for(int j=0;j<matrix[0].length;j++){ 
                if(matrix[i][j]== key){ 
                    System.out.println("The number was fount at index ("+i +","+j+")");
                    return true;
                }
            }
        }
        System.out.println("The key was not found");
        return false;
    }

    public static void main(String args[]){ 
        int matrix1[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers for the matrix");

        for(int i=0;i<matrix1.length;i++){ 
            for(int j=0;j<matrix1[0].length;j++){ 
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the key to search for");
        int key = sc.nextInt();
        search1(matrix1, key);
        sc.close();
    }
}

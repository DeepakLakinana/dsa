package sorting_algorithms;
import java.util.*;
public class inbuiltsort {
    public static void sort(int arr[]){ 
        Arrays.sort(arr);
    }
    
    public static void main(String[] args) {
        int arr[] = {8,4,7,2,5,1};
        sort(arr);
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

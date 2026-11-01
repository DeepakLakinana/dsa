package arrays;

import java.util.*;

public class linear_search {
    public static int linearsearch(int numbers[],int key){ 
        for(int i=0;i<numbers.length;i++){ 
            if(numbers[i]==key){ 
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element you want index of:");
        key = sc.nextInt();
        int index = linearsearch(numbers, key);
        System.out.println("The index of "+key+" is " + index);
        sc.close();
    }
}

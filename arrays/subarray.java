package arrays;

public class subarray {
    public static void dispaly_subarray(int numbers[]){ 
        int ts = 0;
        for(int i=0;i<numbers.length;i++){ 
            for(int j =i+1;j<numbers.length;j++){ 
                for(int k=i;k<=j;k++){ 
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("The total no. of subarrays are: "+ ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        dispaly_subarray(numbers);
    }
}

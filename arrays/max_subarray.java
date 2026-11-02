package arrays;

public class max_subarray {
    public static void maxsum(int numbers[]){ 
        int msum =0;
        for(int i=0;i<numbers.length;i++){ 
            for(int j=i+1;j<numbers.length;j++){ 
                int currsum = 0;
                for(int k=i;k<=j;k++){ 
                    currsum += numbers[k];
                }
                if(currsum>msum){ 
                    msum = currsum;
                }
            }
        }
        System.out.println("The max sum is:"+msum);
    }
    
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,-4,1,2,-20,2,1};
        maxsum(numbers);
    }
}

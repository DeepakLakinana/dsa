package arrays;

public class prefix_sum {
    public static void maxsub(int numbers[]){ 
        int prefix[] = new int[numbers.length];
        int maxsum = Integer.MIN_VALUE;
        prefix[0]= numbers[0];
        for(int i=1;i<numbers.length;i++){ 
            prefix[i]= prefix[i-1]+numbers[i];
        }
        int currsum =0;
        for(int i=0;i<numbers.length;i++){ 
            for(int j=i;j<numbers.length;j++){ 
                currsum = (i==0)?prefix[j]:prefix[j]-prefix[i-1];
                if(currsum>maxsum){ 
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The max sum is: "+maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsub(numbers);
    }
}

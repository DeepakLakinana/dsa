package arrays;

public class kadanes {
    public static void kadane(int numbers[]){ 
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<numbers.length;i++){ 
            sum += numbers[i];
            if(sum>max){ 
                max = sum;
            }
            if(sum <0){ 
                sum =0;
            }   
        }
        System.out.println("The max sum is :"+max);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}



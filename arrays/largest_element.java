package arrays;


public class largest_element {
    public static int largest_index(int numbers[]){ 
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){ 
            if (largest<numbers[i]){ 
                largest = numbers[i];
            }
        }
        return largest;
        
    }

    public static void main(String[] args) {
        int numbers[] = {1,5,7,3,2};
        int num =largest_index(numbers);
        System.out.println("The largest number is "+ num);
    }
}


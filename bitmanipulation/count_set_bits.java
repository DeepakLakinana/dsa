package bitmanipulation;

public class count_set_bits {
    public static int countbits(int num){ 
        int count = 0;
        while(num>0){ 
            if((num & 1) != 0){ //checking out least significant bit
                count ++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countbits(15));
    }

}

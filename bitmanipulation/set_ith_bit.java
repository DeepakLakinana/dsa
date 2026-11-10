package bitmanipulation;

public class set_ith_bit {
    public static int set_i_th(int num,int i){ 
        int bitmask = 1<<i;
        return ( num | bitmask);
    }

    public static void main(String[] args) {
        int num = 0b1010; //as it is a binary number
        System.out.println(Integer.toBinaryString(set_i_th(num, 2)));
    }
}

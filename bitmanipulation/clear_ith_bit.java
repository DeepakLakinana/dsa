package bitmanipulation;

public class clear_ith_bit {
    public static int clear_ith(int num,int i){ 
        int bitmask = 1<<i;
        return num &(~(bitmask));
    }

    public static void main(String[] args) {
        int num = 0b1010;
        System.out.println(Integer.toBinaryString(clear_ith(num, 1)));
    }
}

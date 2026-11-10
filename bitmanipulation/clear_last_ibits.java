package bitmanipulation;

public class clear_last_ibits {
    public static int clear(int num,int i){ 
        int bitmask = (-1)<<i; //(~0 == -1)
        return (num & bitmask);
    }

    public static void main(String[] args) {
        int num = 0b1111;
        System.out.println(Integer.toBinaryString(clear(num, 2)));
    }
}

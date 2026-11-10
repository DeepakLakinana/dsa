package bitmanipulation;

public class clear_rangebits {
    public static int range_clear(int num,int i,int j){ 
        int a = (~0)<<j+1;
        int b =(1<<i)-1; //(~((-1)<<i)) this can also be used but the other one is better approach because of better readability
        int bitmask = a|b;
        return num & bitmask;
    }

    public static void main(String[] args) {
        int num = 0b100111010011;
        System.out.println(Integer.toBinaryString(range_clear(num, 2, 7)));
    }
}

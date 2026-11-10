package bitmanipulation;

public class get_ith_bit {
    public static int i_th(int num,int i){ 
        int bitmask = 1<<i;
        if((num & bitmask)==0){ 
            return 0;
        }
        else{ 
            return 1;
        }

    }
    public static void main(String[] args) {
        int num = 1110;
        int i = 2;
        System.out.println(i_th(num, i));
    }
}

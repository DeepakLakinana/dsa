package bitmanipulation;

public class update_ith_bit {
    public static int update1(int num,int i ,int newbit){ 
        if(newbit == 0){ 
            return clear_ith_bit.clear_ith(num,i);
        }
        else{ 
            return set_ith_bit.set_i_th(num,i);
        }
    }

    public static int update2(int num,int i,int newbit){ 
        num = clear_ith_bit.clear_ith(num, i);
        int bitmask = newbit<<i;
        return num | bitmask;
    }
    

    public static void main(String[] args) {
        int num = 0b101010;
        System.out.println(Integer.toBinaryString(update1(num, 2, 1)));
        System.out.println(Integer.toBinaryString(update2(num, 1, 0)));
    }
}


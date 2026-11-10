package bitmanipulation;

public class fast_exponentiation {
    public static int fast(int num,int pow){ 
        int ans =1;
        int n = num;
        while(pow > 0){ 
            int bit = (pow & 1);
            if(bit == 0){ 
                n = n * n;
            }
            else{ 
                ans = ans * n;
                n = n * n;
            }
            pow = pow>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fast(5,10));
    }
}

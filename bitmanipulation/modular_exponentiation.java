package bitmanipulation;

public class modular_exponentiation {
    public static int mod(int num,int pow,int mod){ 
        int ans = 1;
        int n = num % mod;

        while(pow>0 ){ 
            int bit = (pow & 1);
            if(bit == 1){ 
                ans = (ans * n) % mod;
            }

            n = (n * n)%mod;

            pow = pow>>1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mod(5, 10, 13));
    }
}

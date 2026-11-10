package bitmanipulation;

public class num_powerof2 {
    public static boolean check(int num){ 
        return (num & num-1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(check(7));
    }
}

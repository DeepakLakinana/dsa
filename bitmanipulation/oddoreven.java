package bitmanipulation;

public class oddoreven {
    public static void check(int n){ 
        int bitmask =1;
        if((n & bitmask) == 1){ 
            System.out.println("The number is odd");
        }
        else{ 
            System.out.println("The number is even");
        }
    }

    public static void main(String[] args) {
        check(3);
        check(2);
    }

}

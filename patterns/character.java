package patterns;

public class character {
    public static void main(String[] args) {
        char ch = 'A';
        int num = 5;
        for(int i=0;i<num;i++){ 
            for(int j=0;j<=i;j++){ 
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

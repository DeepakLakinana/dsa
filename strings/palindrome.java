package strings;

public class palindrome {
    public static boolean check(String str){ 
        int len = str.length();
        for(int i=0;i<str.length();i++){ 
            if(str.charAt(i)!= str.charAt(len-i-1)){ 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(check(str));
    }
}

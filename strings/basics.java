package strings;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        //declare string
        String str1 = "abcd";
        String str2 = new String("abcde");

        System.out.println(str1);
        System.out.println(str2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str3 = sc.nextLine();
        System.out.println(str3);
        sc.close();

        //length
        System.out.println(str1.length());

        //character at particular position
        System.out.println(str1.charAt(2));

        //print all character using loop
        for(int i=0;i<str1.length();i++){ 
            System.out.print(str1.charAt(i));
        }
    }
}

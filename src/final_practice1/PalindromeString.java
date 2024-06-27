package final_practice1;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
// Scanner class object creation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();

        // give org_str the value of str.
        String org_str = str;

        String rev = "";

        //find out the length of str do we can use it in a For Loop.
        int len = str.length();

        // reversing For Loop
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
if(org_str.equals(rev)){
    System.out.println("It's a palindrome");
}else{
    System.out.println("It is not a palindrome");
}



    }
}

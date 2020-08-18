/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 13-08-2020
 *   Time: 00:34
 *   File: PalindromeString.java
 */

package gautam;

import java.util.Scanner;


public class PalindromeString {
    public static void main(String[] args) {
        String original;
        String reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be checked : ");
        original = scanner.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse += original.charAt(i);


        }
        if (reverse.equals(original)) {
            System.out.println("the given  string is a palindrome");
        } else {
            System.out.println("the string is not palindrome");
        }


    }

}

/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 13-08-2020
 *   Time: 00:57
 *   File: ArrayPalindrome.java
 */

package gautam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the length for the array");
        int number = scanner.nextInt();

        int[] nums = new int[number];
        int[] nums1 = new int[number];


        System.out.println("enter the array values");


        for (int index = 0; index < number; index++) {
            nums[index] = scanner.nextInt();

            System.out.println(nums[index]);

        }
        int length1 = nums.length;
        int length2 = nums1.length;

        System.out.println("the length of the array 1 is : " + length1);
        System.out.println("the length of the array 2 is : " + length2);


        int j = 0;
        for (int index = length1 - 1; index >= 0; index--) {

            nums1[j] = nums[index];
            j = j + 1;


        }
        if (Arrays.equals(nums, nums1)) {
            System.out.println("the array is palindrome");

        } else {
            System.out.println("the array is not palindrome");
        }
    }
}

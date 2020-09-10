/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-08-2020
 *   Time: 00:42
 *   File: ArraysDemo1D.java
 */

package gautam;

import java.util.Scanner;

public class ArraysDemo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the length for the array");
        int number = scanner.nextInt();

        int[] nums = new int[number];
        System.out.println("enter the array values");


        for (int index = 0; index < nums.length; index++) {
            nums[index] = scanner.nextInt();

            System.out.println(nums[index]);

        }

    }
}

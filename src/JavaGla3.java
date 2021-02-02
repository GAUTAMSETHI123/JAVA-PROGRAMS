/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 02-02-2021
 *   Time: 11:29
 *   File: JavaGla3.java
 */

import java.util.Scanner;

public class JavaGla3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int n = scn.nextInt();
        int[] arr = new int[n];


        System.out.println("please enter the array values");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate elements are" + arr[j]);
                }


            }

        }

    }


}

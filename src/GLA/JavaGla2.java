/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 02-02-2021
 *   Time: 10:44
 *   File: JavaGla2.java
 */

package GLA;

import java.util.Scanner;

public class JavaGla2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int n = scn.nextInt();
        int[] arr = new int[n];


        System.out.println("please enter the array values");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = scn.nextInt();

        }
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(arr[n - 1] - arr[0]);


        for (int var : arr) {
            System.out.println(var);
        }


    }
}

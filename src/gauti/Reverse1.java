/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 02-05-2021
 *   Time: 03:11
 *   File: Reverse1.java
 */

package gauti;

import java.util.Scanner;

public class Reverse1 {
    static void rvereseArray(int arr[],
                             int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /* Utility that prints out an
    array on a line */

    // Driver code
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();


        }

        for (int val : arr
        ) {
            System.out.print(val + " ");

        }
        rvereseArray(arr, 0, N - 1);
        System.out.println();
        System.out.print("Reversed array is \n");
        for (int val : arr
        ) {
            System.out.print(val + " ");

        }


    }
}


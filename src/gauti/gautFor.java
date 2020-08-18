/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 25-07-2020
 *   Time: 13:57
 *   File: gautFor.java
 */

package gauti;

import java.util.Scanner;

public class gautFor {
    private static final int ARRAY_SIZE = 13;

    public static void main(String[] args) {
        int[] right = new int[ARRAY_SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < ARRAY_SIZE; index++) {

            right[index] = scanner.nextInt();


        }
        scanner.close();
        for (int index = 0; index < ARRAY_SIZE; index++) {
            System.out.print(right[index] + " ");


        }

        System.out.println(" ");


    }
}

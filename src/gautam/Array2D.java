/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 16-08-2020
 *   Time: 12:06
 *   File: Array2D.java
 */

package gautam;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        System.out.println("enter number of rows");
        Scanner scanner = new Scanner(System.in);
        int noOfRows = scanner.nextInt();
        System.out.println("enter number of columns");
        int noOfColumns = scanner.nextInt();


        int[][] twoD = new int[noOfRows][noOfColumns];
        System.out.println("enter the values for the 2D array : ");

        for (int index = 0; index < noOfRows; index++) {
            for (int index1 = 0; index1 < noOfColumns; index1++) {
                twoD[index][index1] = scanner.nextInt();
            }
        }
        System.out.println("2D array formed is: ");
        for (int index = 0; index < noOfRows; index++) {
            for (int index1 = 0; index1 < noOfColumns; index1++) {
                System.out.print(twoD[index][index1] + " ");
            }
            System.out.println();
        }


    }

}





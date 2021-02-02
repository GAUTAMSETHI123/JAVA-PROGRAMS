package GLA;
/*
import java.util.Scanner;

public class xyz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int G = scan.nextInt();
        int P= scan.nextInt();

        int U = scan.nextInt();
        System.out.println(G);
        System.out.println(P);
    }
}
*/
/*

1.wap to get the difference b/w largest and smallest value in an array of integers.
2.wap to get or find the duplicate value in an array.
3.wap to insert an element on specific position to insert an element without overwrite the value.
4.wap to find common element b/w two arrays.

 */

import java.util.Scanner;

class xyz1 {
    public static void main(String[] args) {
        int arr1[] = new int[]{123, 234, 567, 456, 345};
        int arr_min = arr1[0];
        int arr_max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr_min > arr1[i]) {
                arr_min = arr1[i];
            }
            if (arr_max < arr1[i]) {
                arr_max = arr1[i];
            }
        }
        System.out.println("Difference B/w max and min =>  " + (arr_max - arr_min));
    }
}

class xyz2 {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        StringBuffer arr = new StringBuffer();
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the value what u want to insert :  ");
        String v = k.next();
        System.out.print("Enter the index value at what u want to insert :  ");
        int p = k.nextInt() - 1;
        for (int i = 0; i <= p - 1; i++) {
            arr.append(arr1[i] + ",");
        }
        arr.append(v);
        for (int i = p + 1; i < arr1.length - 1; i++) {
            arr.append("," + arr1[i]);
        }
        System.out.println(arr);
    }
}

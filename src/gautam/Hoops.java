/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-06-2021
 *   Time: 00:18
 *   File: Hoops.java
 */

package gautam;

import java.util.Scanner;

public class Hoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(n);
            } else {
                int q = (n + 1) / 2;
                System.out.println(q);
            }
            t--;
        }
    }
}

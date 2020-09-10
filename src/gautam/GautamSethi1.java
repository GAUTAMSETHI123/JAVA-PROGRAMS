/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 07-08-2020
 *   Time: 20:07
 *   File: GautamSethi1.java
 */

package gautam;

import java.util.Scanner;

public class GautamSethi1 {
    public static void main(String[] args) {
        String name;
        String aniket = "`";
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            int number;


            char cunters;
            cunters = (char) (name.charAt(i) + 5);


            number = (int) (name.charAt(i) + 5);
            if (number > 122) {
                int t;
                t = number % 10;
                for (int j = 0; j < aniket.length(); j++) {
                    cunters = (char) (aniket.charAt(j) + t - 2);

                }

            }
            System.out.println(cunters);
        }


    }


}
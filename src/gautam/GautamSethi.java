/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 31-07-2020
 *   Time: 22:52
 *   File: GautamSethi.java
 */

package gautam;

import java.util.Random;
import java.util.Scanner;

public class GautamSethi {
    private static final int FINAL_NUMBER = 1000;

    public static void main(String[] args) {
        Random random = new Random();
        int enterRandom = random.nextInt(FINAL_NUMBER);
        System.out.println("lottery number is : " + enterRandom);
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your number ? ");
        int winningNumber = scanner.nextInt();
        if (enterRandom == winningNumber) {
            System.out.println("congratulations, you are the winner");
        } else {
            System.out.println("sorry,better luck next time");
            scanner.close();

        }

    }

}

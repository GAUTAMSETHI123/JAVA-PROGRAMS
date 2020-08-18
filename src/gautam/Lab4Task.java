/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-07-2020
 *   Time: 18:53
 *   File: Lab4Task.java
 */

package gautam;

import java.util.Scanner;


public class Lab4Task {
    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " +
                "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        byte ticketsToBeSold = (byte) 0;
        while (ticketsToBeSold <= TOTAL_PARTICIPANTS) {
            System.out.println("Total tickets left: " + (TOTAL_PARTICIPANTS - ticketsToBeSold));
            System.out.println(" enter name: ");
            Scanner scanner = new Scanner(System.in);
            String participantName = scanner.nextLine();
            Lab4Task.sellTicket(participantName);
            ticketsToBeSold++;

            if (ticketsToBeSold == TOTAL_PARTICIPANTS) {
                System.out.println("Sorry, The ticket are sold-out");
                scanner.close();
                break;
            }


        }


    }


}

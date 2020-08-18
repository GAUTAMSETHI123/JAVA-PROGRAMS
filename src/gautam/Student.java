/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-08-2020
 *   Time: 19:34
 *   File: Student.java
 */

package gautam;

import java.util.Scanner;

class Gautam {
    String student;
    int rollNumber;
    float cgpa;
}

public class Student {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gautam student1 = new Gautam();
        System.out.println("enter the values : ");
        student1.student = scanner.nextLine();
        student1.rollNumber = scanner.nextInt();
        student1.cgpa = scanner.nextFloat();

        System.out.println("My name is: " + student1.student);
        System.out.println("My roll number is: " + student1.rollNumber);
        System.out.println("My cgpa is: " + student1.cgpa);
        scanner.close();
    }
}

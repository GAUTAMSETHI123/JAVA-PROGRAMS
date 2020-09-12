/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 23-07-2020
 *   Time: 23:15
 *   File: LabTask1.java
 */

package lab2;

//Task-1:Create a program in Java that prints the following table.

public class LabTask1 {
    public static void main(String args[]) {
        System.out.printf("%-17s\t%-17s\t%-17s\t%-17s\n", "Data Types", "Size in Bits", "Size in Bytes", "Range");
        System.out.printf("%-17s\t%-17d\t%-17d\t%-17s\n", "byte", Byte.SIZE, Byte.SIZE / 8, "From " + Byte.MIN_VALUE
                + " to " + Byte.MAX_VALUE);
        System.out.printf("%-17s\t%-17d\t%-17d\t%-17s\n", "short", Short.SIZE, Short.SIZE / 8, "From " + Short.MIN_VALUE
                + " to " + Short.MAX_VALUE);
        System.out.printf("%-17s\t%-17d\t%-17d\t%-17s\n", "int", Integer.SIZE, Integer.SIZE / 8, "From " + Integer.MIN_VALUE
                + " to " + Integer.MAX_VALUE);
        System.out.printf("%-17s\t%-17d\t%-17d\t%-17s\n", "long", Long.SIZE, Long.SIZE / 8, "From " + Long.MIN_VALUE
                + " to " + Long.MAX_VALUE);
        System.out.printf("%-17s\t%-17d\t%-17d\t%-17s\n", "float", Float.SIZE, Float.SIZE / 8, "From " + Float.MIN_VALUE
                + " to " + Float.MAX_VALUE);
        System.out.printf("%-17s\t%-17d\t%-17d\t%-17s\n", "double", Double.SIZE, Double.SIZE / 8, "From " + Double.MIN_VALUE
                + "to " + Double.MAX_VALUE);
        System.out.printf("%-17s\t%-17d\t%-17d\t%-17s\n", "char", Character.SIZE, Character.SIZE / 8, "From " + (int) Character.MIN_VALUE
                + " to " + (int) Character.MAX_VALUE);
        System.out.printf("%-17s\t %-17s\t%-17s\t%-17s\n", "boolean", "1", "*", "has " + Boolean.TRUE + " and " + Boolean.FALSE);


    }
}


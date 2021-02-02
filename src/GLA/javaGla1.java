/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-01-2021
 *   Time: 10:37
 *   File: javaGla1.java
 */
/*
package GLA;

import java.util.Arrays;
import java.util.Scanner;

class javaGla1 {
    private int ID;
    private String name;
    private int salary;
    private String designation;

    @Override
    public String toString() {
        return """
    javaGla1{
    ID=$ID,
    name='$name',
    salary=$salary,
    designation='$designation'
}"""
    }

    public javaGla1(int ID, String name, int salary , String designation) {
        this.designation = designation;
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
class Test{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ID;
        String name;
        int salary;
        String designation;

        javaGla1 arr[] = new javaGla1[2];



        for (int i = 0; i < arr.length; i++){
            ID = scan.nextInt();
            scan.nextLine();
            name = scan.nextLine();
            salary = scan.nextInt();
            scan.nextLine();
            designation = scan.nextLine();
            arr[i] = new javaGla1(ID,name,salary, designation);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i +
                    " : "+ arr[i]);
        }




    }
}
*/
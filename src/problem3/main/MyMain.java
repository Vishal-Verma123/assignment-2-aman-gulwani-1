/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.Student.Student;
import problem3.myqueue.MyPriorityQueue;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyPriorityQueue queue = new MyPriorityQueue();

        System.out.println("ENTER THE CHOICE .ENTER 1 TO INSERT and TO VIEW");

        int ch = scanner.nextInt();

        scanner.nextLine();

        switch (ch) {

            case 1:

                for (int i = 0; i <= 5; i++) {

                    System.out.println("Enter the Student name");

                    String n = scanner.nextLine();

                    System.out.println("Enter the Roll Number for the student");

                    int r = scanner.nextInt();

                    Student student = new Student(n, r);

                    queue.enqueue(student);

                    scanner.nextLine();

                }

                queue.show();

                break;
            default:

                System.out.println("WRong choice");

        }

    }

}
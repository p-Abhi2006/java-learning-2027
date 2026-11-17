
package javacore.day02;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double cgpa;

        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        System.out.println("Enter your CGPA:");
        cgpa = sc.nextDouble();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        sc.close();
    }
}

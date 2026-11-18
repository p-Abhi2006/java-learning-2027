package javacore.day03;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(result = a + b);
                break;
            case '-':
                System.out.println(result = a - b);
                break;
            case '*':
                System.out.println(result = a * b);
                break;
            case '/':
                if (b != 0) {System.out.println(result = a / b);
                }
                else {
                    System.out.println("Cannot divide by zero");
                }                break;
            case '%':
                System.out.println(result = a + b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
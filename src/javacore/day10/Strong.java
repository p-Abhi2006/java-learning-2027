package javacore.day10;

import java.util.Scanner;

public class Strong {
    static int fact(int num) {
        if(num==0||num==1){
            return 1;
        }
return num*fact(num-1);
    }
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int temp=n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += fact(rem);
            temp= temp/ 10;
        }

if(sum==n){
    System.out.println("Strong number");
}
    }
}
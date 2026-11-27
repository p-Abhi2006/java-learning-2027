package javacore.day10;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int temp=n;
        int count=0;
        while(temp>0) {
                count++;
                temp /= 10;
            }
        temp=n;
        if(n==0){
            System.out.println("Armstrong");
            return;
        }
        while(temp>0) {
        int rem = temp % 10;
           sum+=(int)Math.pow(rem,count);
            temp = temp / 10;
        }
if(sum==n) {
    System.out.println("Armstrong");
}
else {
    System.out.println("Not Armstrong");
}
    }
}

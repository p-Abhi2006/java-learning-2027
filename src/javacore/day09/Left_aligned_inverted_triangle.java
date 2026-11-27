package javacore.day09;

import java.util.Scanner;

public class Left_aligned_inverted_triangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

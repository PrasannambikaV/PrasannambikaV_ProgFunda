package com.gradedproject.q2;
import java.util.Scanner;
/* This code is to find x powwer N with user input */
public class XpowerN
{
    public static void main(String args[])
    {
        int baseX,powerN;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base number X = ");
        baseX = sc.nextInt();
        System.out.println("Enter the Power N =");
        powerN = sc.nextInt();
        System.out.println("X Power N = "+xPowerN(baseX,powerN));
    }
    public static int xPowerN(int x,int n)
    {
        if (n == 0)
            return 1;
        else
            return x * xPowerN(x,n-1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginnerjava;

import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp,r,sum=0,n;
        temp=input.nextInt();
        n=temp;
        while(temp!=0)
        {
            r=temp%10;
            sum=(int) (sum+Math.pow(r,3));
            temp=temp/10;
        }
        System.out.println(sum);
        if(sum==n)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("not Armstrong");
        }
    }
}

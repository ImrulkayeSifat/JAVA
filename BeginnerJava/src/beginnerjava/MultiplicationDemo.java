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
public class MultiplicationDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,ans;
        num=input.nextInt();
        for (int i = 1; i <= 10; i++) {
            ans=num*i;
            System.out.println(num+" "+"*"+" "+i+" "+"="+" "+ ans);
        }
    }
}

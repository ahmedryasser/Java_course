/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifs;

import java.util.Scanner;

/**
 *
 * @author Ahmed Yasser
 */
public class terenary_greatest_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        System.out.println("Enter a third number");
        int c=sc.nextInt();
        
        System.out.println(a>b&&a>c?"a is greater":b>c&&b>a?"b is greater":"c is greater");

       
     
            }
    
}

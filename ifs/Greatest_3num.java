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
public class Greatest_3num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        
        System.out.println("Enter a second number");
        int b=sc.nextInt(); 
        
        System.out.println("Enter a second number");
        int c=sc.nextInt();        
        if(a>b && a>c)
        {
            System.out.println("The first number is the biggest");
        }
        else if(a<b && c<b)
        {
            System.out.println("The second number is the biggest");
        }
        else
        {
            System.out.println("The third number is the biggest");
    }
    }   
}

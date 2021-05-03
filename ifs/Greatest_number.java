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
public class Greatest_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        
        if(a>b)
        {
            System.out.println("The first number is bigger");
        }
        else if(a<b)
        {
            System.out.println("The second number is bigger");
        }
        else
        {
            System.out.println("They are equal");
        }
    }
    
    }
    


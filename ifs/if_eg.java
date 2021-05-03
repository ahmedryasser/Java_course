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
public class if_eg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
     
        if(a>0)
        {
            System.out.println("a is positive");
        }
        else if(a<0)
        {
            System.out.println("a is negative");
        }
        else
        {
            System.out.println("a is zero");
        }
    }
    
}

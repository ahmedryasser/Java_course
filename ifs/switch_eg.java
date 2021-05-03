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
public class switch_eg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:System.out.println("One");
                break;
            case 2:System.out.println("Two");
                break;
            case 3:System.out.println("Three");
                break;
            
            default:System.out.println("Invalid Input");
        }
    }
    
}

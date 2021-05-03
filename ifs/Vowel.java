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
public class Vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter");
        char a=sc.next().charAt(0);
        
        
        switch(a)
        {
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':System.out.println("It is a vowel");
                break;                
                       
            default:System.out.println("It is a constenant");
        }
    }
}

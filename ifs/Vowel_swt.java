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
public class Vowel_swt {

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter");
        char a=sc.next().charAt(0);

        
        if(a == 'a' || a == 'e' || a == 'o' || a == 'u'|| a == 'i')
        {
            System.out.println("This is a vowel");
        }
        else 
        {
            System.out.println("This is a constenant");
        }
    }
    }
    

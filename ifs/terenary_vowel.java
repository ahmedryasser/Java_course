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
public class terenary_vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter");
        char a=sc.next().charAt(0);       
        
        
       
        System.out.println(a == 'a' || a == 'e' || a == 'o' || a == 'u'|| a == 'i' ? "Vowel":"Constenant");
    
}}

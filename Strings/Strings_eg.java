/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Ahmed Yasser
 */
public class Strings_eg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a string");
//        String s=sc.nextLine();        
//        System.out.println("String="+s);
        //A-Z  65-90
        //a-z  97-120
        String str="Aptech";
        
        System.out.println("String="+str);
        System.out.println("String length="+str.length());
        System.out.println("Character at oth position="+str.charAt(0));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo("Aptech"));
        System.out.println(str.compareTo("aptech"));
        System.out.println("apple".compareTo("Apple"));
        System.out.println(str.equals("Aptech"));
        System.out.println(str.equals("aptech"));
        System.out.println(str.equalsIgnoreCase("aptech"));
        System.out.println(str.endsWith("ch"));
        System.out.println(str.startsWith("Ap"));
        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("p",2));
        System.out.println("typewriter".lastIndexOf("e"));
        str=str+" computer";
        System.out.println(str);
        System.out.println(str.replace("e", "E"));
        System.out.println(str.replace("computer", "Institute"));
        System.out.println(str.substring(0));
        System.out.println(str.substring(6));
        System.out.println(str.substring(7,15));
        System.out.println(" aptech computer  ".trim());
    }
    
}

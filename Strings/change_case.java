/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Ahmed Yasser
 */
public class change_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String str="aptech";
        System.out.println((char)(str.charAt(0)+1));
        
        char ch='A';
        ch=(char)(ch+32);
        System.out.println(ch);
        System.out.println(str.charAt(0)>65);
    }
    
}

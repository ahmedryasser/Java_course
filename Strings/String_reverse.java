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
public class String_reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String str=sc.nextLine();
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }
}

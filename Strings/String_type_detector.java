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
public class String_type_detector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence ");
        char str = sc.next().charAt(0);
        if (str<= 90  && str>= 65 ){
            System.out.println("This is a capital letter");
        }
        else if (str<= 'z' && str>= 'a' ){
            System.out.println("This is a lowercase letter");
        }
        else if (str >= '0' && str <='9'){
            System.out.println("This is a digit");
        }
        else{
            System.out.println("This is a special charachter");
        }
            }
}

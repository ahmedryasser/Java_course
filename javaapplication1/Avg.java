/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
//import the scanner class
import java.util.Scanner;

public class Avg {

    public static void main(String[] args) {
       //create object for scanner and initialise it
        Scanner sc=new Scanner(System.in);
        
        //use the functions inside the scanner
        System.out.println("Enter marks for english");
        int a=sc.nextInt();
        System.out.println("Enter marks for Arabic");
        int b=sc.nextInt();
        System.out.println("Enter marks for Science");
        int c=sc.nextInt();
        
        int sum=a+b+c;
        int avg=sum/3;
        float pre=(sum/300.0F)*100;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
        System.out.println("The precent is " + pre + "%");
        
    }
    
}

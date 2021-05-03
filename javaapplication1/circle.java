/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Ahmed Yasser
 */
import java.util.Scanner;

public class circle {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius");
        int a=in.nextInt();;
 
        System.out.println("The area of this circle is " + a*a*3.14);
        System.out.println("The circumference of this circle is " + 2*a*3.14);
        
    }
}

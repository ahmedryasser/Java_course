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

public class Rectangle {

    
    public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the length");
    int a=in.nextInt();
    
    System.out.println("Enter the width");
    int b=in.nextInt();
    
    System.out.println(" The area of this rectangle is " + a*b);
    System.out.println(" The perimeter of this rectangle is " + (2*(a+b)));
    }
    
}

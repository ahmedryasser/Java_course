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

public class Rotate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        
     
    System.out.println("What is your new value for a");
    int a=in.nextInt();
         
    System.out.println("What is your new value for b");
    int b=in.nextInt();
    
    System.out.println("a=" +a);
    System.out.println("b=" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        
    
    
        System.out.println("Afer swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    
    }
    
}

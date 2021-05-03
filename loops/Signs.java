/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author Ahmed Yasser
 */
public class Signs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int a=sc.nextInt();
        
        System.out.println("Enter a second number");
        int b=sc.nextInt();        
        
        System.out.println("Enter your sign: 1 for addition; 2 for multiplication; 3 for division; and 4 for subtraction");
        String opt=sc.next();
        switch(opt)
        {
            case "+":System.out.println(a+b);
                break;
            case "-":System.out.println(a-b);
                break;
            case "*":System.out.println(a*b);
                break;
            case "/":System.out.println(a/b);
                break;
            default:System.out.println("Invalid Input");
        }
    }
    
}

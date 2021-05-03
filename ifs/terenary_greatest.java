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
public class terenary_greatest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        

        int num=12;
        
        
        
        System.out.println(a>b?" First number is bigger":"Second number is bigger ");
        String res=a>b?" First number is bigger ":" Second number is bigger ";
        System.out.println(res);
        
    }
    
}

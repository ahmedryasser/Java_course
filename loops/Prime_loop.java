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
public class Prime_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a =1;
        int c =0;
        while(a<=n){
                if(n%a==0)
                {
                    System.out.println(a);
                    c++;
                }
                a++;
        }
        if (c==2){
            System.out.println("It is a prime number ");}
        else {
                
                System.out.println("It is not a prime number");
                    
                }
        }
    }
    

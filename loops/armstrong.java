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
public class armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int s=n;
    int a;
    int t;
    int r=0;
    while ( n != 0){
        a = n%10;
        r=(a*a*a)+r;
        n/=10;
        
    }
    
        if (s == r){
            System.out.println("It is armstrong");
            
        }
        else{
            System.out.println("It is not armstrong");
            
        }
              
    }
    
}

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
public class palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int s=n;
    int a;
    int rev=0;
    while ( n != 0){
        a = n%10;
        rev=rev*10+a;
       // System.out.println(a);
        n/=10;
    }
    
        if (s == rev){
            System.out.println("It is a palindrome");
            
        }
        else{
            System.out.println("It is not a palindrome");
            
        }
}
    
    }
    


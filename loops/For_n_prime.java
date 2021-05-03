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
public class For_n_prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");    
    int n=sc.nextInt();
    for(int i=2;i<=n;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
                count++;
        }
        if(count==2)
            System.out.println(i);
    }
}}

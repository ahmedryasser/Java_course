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
public class Numbers_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
                
            }
            System.out.println("");
        }    }
    
}

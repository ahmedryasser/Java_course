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
public class For_prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");    
    int n=sc.nextInt();
    int c=0;
    int i;
        for (i=1;i<=n;i++)
        {
        if (n%i ==0){
        c++;
        
        
        }
        
        
        
        }
        if(c==2){
        System.out.println("It is prime"); 
        }
        else{
        System.out.println("It is not prime");
    }     
    
    
    
    }
    
}

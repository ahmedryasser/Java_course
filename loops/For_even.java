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
public class For_even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");    
    int n=sc.nextInt();
        for (int i=1;i<=n;i++)
    {
        if(i%2==0){
        System.out.println(i);  
        }
    }    }
    
}

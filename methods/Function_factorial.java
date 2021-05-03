/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 *
 * @author Ahmed Yasser
 */
public class Function_factorial {

    public static int factorial(int n){
        int f=1;
        if (n==1)
            return 1;
        return n*factorial(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The factorial of this number is " + factorial(n));
    }
    
}

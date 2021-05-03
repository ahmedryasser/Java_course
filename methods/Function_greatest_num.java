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
public class Function_greatest_num {

    public static int greatest(int a,int b, int c){
    if (a>b && a>c){
        return a;
    }
    else if(b>a && b>c){
        return b;
    }
    else {
        return c;
    
    }
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        
        System.out.println(greatest(a,b,c));

    }
    
}

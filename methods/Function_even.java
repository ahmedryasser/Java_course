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
public class Function_even {

    public static void even(int a){
    for (int i=1;i<=a;i++){
    
        if(i%2==0){
            System.out.println(i);     
        }
    }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
    int a=sc.nextInt();
       even (a);
    }
    
}

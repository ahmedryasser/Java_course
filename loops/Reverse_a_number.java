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
public class Reverse_a_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int a;
    int rev=0;
    while ( n != 0){
        a = n%10;
        rev=rev*10+a;
       // System.out.println(a);
        n/=10;
    }
    
        System.out.println(rev);
    
}}

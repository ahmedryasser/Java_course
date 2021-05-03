/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Ahmed Yasser
 */
public class operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=12,b=90;
        System.out.println(a);
        a++;  //add 1 to the value
        System.out.println(a);
        a--;  //decrement by 1
        System.out.println(a);
        System.out.println(a>100);
        System.out.println(a/2);
        System.out.println(a%2);
        System.out.println(a);
        System.out.println(a>10 && b!=100);
        System.out.println(a<10 && b!=100);
        System.out.println(a<10 || b!=100);
        System.out.println(a<10 || b==100);
        System.out.println(!(a>b));
        a=2;
        System.out.println(a);
        a+=2;  //a=a+2
        System.out.println(a);
        a-=2; //a=-2
        System.out.println(a);
        a*=2;
        System.out.println(a);
        
    }
    
}

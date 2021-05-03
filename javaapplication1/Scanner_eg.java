/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
public class Scanner_eg {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter integer value");
        int a=in.nextInt();
        System.out.println("Enter byte value");
        byte b=in.nextByte();
        System.out.println("Enter short value");
        short c=in.nextShort();
        System.out.println("Enter long value");
        long d=in.nextLong();
        System.out.println("Enter float value");
        float e=in.nextFloat();
        System.out.println("Enter double value");
        double f=in.nextDouble();
        System.out.println("Enter boolean value");
        boolean g=in.nextBoolean();
        System.out.println("Enter character value");
        char ch=in.next().charAt(0);
        System.out.println("Enter string value");
        String str=in.next();
        
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
        
    }
    
}

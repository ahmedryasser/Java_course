/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.Scanner;

/**
 *
 * @author Ahmed Yasser
 */
public class Rectangle {

   int length;
   int breadth;
   
   void set()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length");
       length=sc.nextInt();
       System.out.println("Enter Breadth");
       breadth=sc.nextInt();
   }
   
   void set(int l,int b)
   {
       length=l;
       breadth=b;
   }
   
   void show()
   {
       System.out.println("Length: "+length);
       System.out.println("Breadth: "+breadth);
   }
   void area()
   {
       System.out.println("Area: "+length*breadth);
   }
   
   void perimeter()
   {
       System.out.println("Perimeter: "+2*(length+breadth));
   }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.set(1, 2);
        r1.show();
        r1.area();
        r1.perimeter();
    }
    
}

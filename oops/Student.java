/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.Scanner;

public class Student {
    int roll;
    String name;
    float marks;
    
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll");   roll=sc.nextInt();
        System.out.println("Enter name");   name=sc.next();
        System.out.println("Enter marks");  marks=sc.nextFloat();
    }
    void set(int roll,String name,float  marks)
    {
       this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    void show()
    {
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}

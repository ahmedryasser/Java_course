/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.util.Scanner;

/**
 *
 * @author Ahmed Yasser
 */
public class Student {

    int roll;
    String name;
    float marks;
    
    //constructor
    //it get called automatically when a n object is created
    Student()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no");
        roll=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter marks");
        marks=sc.nextFloat();       
    }
    
    Student(int r,String n,float m)
    {
        roll=r;
        name=n;
        marks=m;
    }
    void show()
    {
        System.out.println("Roll No: "+roll);
        System.out.println("NAme: "+name);
        System.out.println("Marks: "+marks);
    }
    
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(12, "Zara", 123.66F);
        s1.show();
        s2.show();
        
    }
    
}

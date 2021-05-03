/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

//Student class is inheriting the School class
//Student class is known as derived class
//School class is known as base class
//Student object has the feature of School class also



class School
{
    String sch_name;
    String loc;
    
    void set_sch()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter school Name");    sch_name=sc.next();
        System.out.println("Enter location");       loc=sc.next();
    }
    
    void set_sch(String s,String l)
    {
        sch_name=s;
        loc=l;
    }
    
    void display()
    {
        System.out.println("School Name: "+sch_name);
        System.out.println("Location: "+loc);
    }
}

class Student extends School
{
    int roll;
    String name;
    float marks;
    
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll");   roll=sc.nextInt();
        System.out.println("Enter name");   name=sc.next();
        System.out.println("Enter marks");  marks=sc.nextFloat();
        set_sch();
    }
    
    void set(int r,String n,float m,String s,String l)
    {
        set_sch(s, l);
        roll=r;
        name=n;
        marks=m;
    }
    
    void show()
    {
        System.out.println("Roll No:"+roll);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        display();
    }
}
public class single_inheritance {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.set(12,"Anoop",123.33F,"DPS","DXB");
        s1.show();
    }
    
}

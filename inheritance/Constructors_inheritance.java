/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

class school {

    String sch_name;
    String loc;

    school() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter school Name");
        sch_name = sc.next();
        System.out.println("Enter location");
        loc = sc.next();
    }

    school(String s, String l) {
        sch_name = s;
        loc = l;
    }

    void display() {
        System.out.println("School Name: " + sch_name);
        System.out.println("Location: " + loc);
    }
}

class student extends school {

    int roll;
    String name;
    float marks;

    student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no");
        roll = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter marks");
        marks = sc.nextFloat();
    }

    student(int r, String n, float m,String s,String l) {
        //super is used to access the feature of the parent class
        super(s,l);
        roll = r;
        name = n;
        marks = m;
    }
    void show()
    {
        System.out.println("Roll No:"+roll);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        display();
    }
}

public class Constructors_inheritance {


    public static void main(String[] args) {
        student s1=new student(12,"Anoop",123.33F,"dps","dxb");
        
        s1.show();
    }

}

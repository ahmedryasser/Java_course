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
public class Employer {
    int salary;
    String name;
    float attendence;
    String job;
    
    //void set()
    //Default Constructor
    Employer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary");   salary=sc.nextInt();
        System.out.println("Enter name");   name=sc.next();
        System.out.println("Enter attendence");  attendence=sc.nextFloat();
        System.out.println("Enter job"); job=sc.next();
    }
    //void set(int s,String n,float  a, String j)
    //Parametrized Constructor
    Employer(int s,String n,float  a, String j)
    {
        salary=s;
        name=n;
        attendence=a;
        job=j;
    }
    void show()
    {
        System.out.println("Salary: "+salary);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+attendence);
        System.out.println("Job: "+ job);
    }
    
}

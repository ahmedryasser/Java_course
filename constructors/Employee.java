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
public class Employee {

   
   
    int id;
    String name;
    float salary;
    
    //constructor
    //it get called automatically when a n object is created
    Employee()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id no");
        id=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter Salary");
        salary =sc.nextFloat();       
    }
    
    Employee(int r,String n,float m)
    {
        id=r;
        name=n;
        salary=m;
    }
    void show()
    {
        System.out.println("Id No: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(8, "Zara", 1500);
        s1.show();
        s2.show();
    }
        
  
    
}

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



class Company
{
    String comp_name;
    String loc;
    
    void set_sch()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter company Name");    comp_name=sc.next();
        System.out.println("Enter location");       loc=sc.next();
    }
    
    void set_sch(String s,String l)
    {
        comp_name=s;
        loc=l;
    }
    
    void display()
    {
        System.out.println("Company Name: "+comp_name);
        System.out.println("Location: "+loc);
    }
}

class employee extends Company
{
    int ID;
    String Name;
    float Salary;
    
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");   ID=sc.nextInt();
        System.out.println("Enter Name");   Name=sc.next();
        System.out.println("Enter Salary");  Salary=sc.nextFloat();
        set_sch();
    }
    
    void set(int r,String n,float m,String s,String l)
    {
        set_sch(s, l);
        ID=r;
        Name=n;
        Salary=m;
    }
    
    void show()
    {
        System.out.println("ID No:"+ID);
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
        display();
    }
}
public class Employee_inheritance {

    public static void main(String[] args) {
        employee s1=new employee();
        s1.set(12,"Anoop",123.33F,"DPS","DXB");
        s1.show();
    }
    
}

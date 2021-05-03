/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Scanner;

class Comp {

    String comp_name;
    String loc;

    Comp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company Name");
        comp_name = sc.next();
        System.out.println("Enter location");
        loc = sc.next();
    }

    Comp(String s, String l) {
        comp_name = s;
        loc = l;
    }

    void display() {
        System.out.println("Company Name: " + comp_name);
        System.out.println("Location: " + loc);
    }
}

class Emp extends Comp {

    int ID;
    String Name;
    float Salary;

    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID no");
        ID = sc.nextInt();
        System.out.println("Enter Name");
        Name = sc.next();
        System.out.println("Enter Salary");
        Salary = sc.nextFloat();
    }

    Emp(int r, String n, float m,String s,String l) {
        //super is used to access the feature of the parent class
        super(s,l);
        ID = r;
        Name = n;
        Salary = m;
    }
    void show()
    {
        System.out.println("ID No:"+ID);
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
        display();
    }
}

public class employee_const_inherit {


    public static void main(String[] args) {
        Emp s1=new Emp(12,"Anoop",123.33F,"dps","dxb");
        
        s1.show();
    }

}
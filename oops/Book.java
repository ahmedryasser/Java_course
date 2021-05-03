/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.Scanner;
public class Book
{
    int Book_id;
    String name;
    float price;
    
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Id");
        Book_id=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter price");
        price=sc.nextFloat();
    }
    
    void set(int i,String n,float p)
    {
        Book_id=i;
        name=n;
        price=p;
    }
    
    void show()
    {
        System.out.println("Book ID: "+Book_id);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
    
    public static void main(String[] args)
    {
        Book it=new Book();
        it.set();
        it.show();
        
        Book it2=new Book();
        it2.set(101,"Mobile",2500);
        it2.show();
    }
}

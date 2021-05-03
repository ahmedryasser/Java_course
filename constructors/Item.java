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
public class Item {

    int Id;
    String name;
    float Price;
    
    //constructor
    //it get called automatically when a n object is created
    Item()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id no");
        Id=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter Price");
        Price=sc.nextFloat();       
    }
    
    Item(int r,String n,float m)
    {
        Id=r;
        name=n;
        Price=m;
    }
    void show()
    {
        System.out.println("Id No: "+Id);
        System.out.println("Name: "+name);
        System.out.println("Price: "+Price);
    }
    
    public static void main(String[] args) {
        Item s1=new Item();
        Item s2=new Item(12, "Zara", 123.66F);
        s1.show();
        s2.show();
        
    }
    
}
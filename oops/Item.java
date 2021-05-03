/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
import java.util.Scanner;
public class Item
{
    int item_id;
    String name;
    float price;
    
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Item Id");
        item_id=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter price");
        price=sc.nextFloat();
    }
    
    void set(int i,String n,float p)
    {
        item_id=i;
        name=n;
        price=p;
    }
    
    void show()
    {
        System.out.println("Item ID: "+item_id);
        System.out.println("NAme: "+name);
        System.out.println("Price: "+price);
    }
    
    public static void main(String[] args)
    {
        Item it=new Item();
        it.set();
        it.show();
        
        Item it2=new Item();
        it2.set(101,"Mobile",2500);
        it2.show();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

class product
{
    
    int ID;
    String Name;
    float Price;


    public product() {
    ID=100;
    Name="ahmed";
    Price=0.3489F;
    }

    public product(int ID,String Name,float Price) {
        this.ID = ID;
        this.Name= Name;
        this.Price = Price;
        
    }
    
}

class salesman extends product
{
    int IDs;
    String Names;

    public salesman() {
    IDs=200;
    Names="Anthony";
    }

    public salesman(int IDs, String Names) {
        this.IDs = IDs;
        this.Names = Names;

    }

    public salesman(int ID, String Name, float Price, int IDs, String Names) {
        super(ID, Name, Price);

        this.IDs = IDs;
        this.Names = Names;
        
    }
    
    
}

class area extends salesman
{
    int Loc;

    public area() {
    Loc=300;
    }

    public area(int Loc) {
        this.Loc = Loc;
    }

    public area(int Loc, int IDs, String Names) {
        super(IDs, Names);
        this.Loc = Loc;
        this.IDs = IDs;
        this.Names = Names;
    }

    public area(int Loc, int ID, String Name, float Price, int IDs, String Names) {
        super(ID, Name, Price, IDs, Names);
        this.Loc = Loc;
        this.IDs = IDs;
        this.Names = Names;
        this.ID = ID;
        this.Name= Name;
        this.Price = Price;
    }

   
     void show()
     {
         System.out.println("Product ID:"+ID);
         System.out.println("Salesman ID:"+IDs);
         System.out.println("Location:"+Loc);
         System.out.println("Product Name:"+Name);
         System.out.println("Salesman Name:"+Names);
         System.out.println("Product Price:"+Price);

     }    
    
}

public class Shape_multi_inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        area s=new area();
        s.show();
    }
}

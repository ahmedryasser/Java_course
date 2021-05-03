/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Ahmed Yasser
 */
public class method_eg {
/*
    public static return_type function_name(parameterlist)
    {
        body of the function
    }
    */
    //function definition
    public static void address()
    {
        System.out.println("Aptech Computer Education");
        System.out.println("Sharjah and Dubai");
        System.out.println("UAE");
    }
     public static  void add(int a,int b)
     {
         System.out.println("Sum="+(a+b));
     }
     
     public static int cube(int x)
     {
         return x*x*x;
     }
    public static void main(String[] args) {
     //function calling
        address();
        add(7,8);
        System.out.println("Cube of 3 is "+cube(3));
    }
    
}

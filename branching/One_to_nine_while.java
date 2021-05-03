/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branching;

/**
 *
 * @author Ahmed Yasser
 */
public class One_to_nine_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i=1;
       while(i<=10)
       {
          // System.out.println("hi");
           if(i==5)
           {
               i++;
               continue;
           }
           System.out.println(i);
           i++;
       }
    }
    
}

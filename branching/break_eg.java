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
public class break_eg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i==5)
                break;
            System.out.println(i);
        }
        System.out.println("The End");
    }
    
}

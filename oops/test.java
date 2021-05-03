/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author Ahmed Yasser
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create object
        Student s1=new Student();
        Student s2=new Student();
        s1.set(11,"Philip",899.99F);
        s2.set(12,"Zara",123.33F);
        s1.show();
        s2.show();

    }
    
}

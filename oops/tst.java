/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

public class tst {

    public static void main(String[] args) {
        Employer e1=new Employer();
        Employer e2=new Employer(2500,"Philip",95.95F, "medic");
       // e1.set(2500,"Philip",95.95F, "medic");
        //e2.set(3500,"Zara",97.23F,"engineer");
        e1.show();
        e2.show();    }
    
}

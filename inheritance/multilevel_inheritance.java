/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

class sample1
{
    int num1;

    public sample1() {
    num1=100;
    }

    public sample1(int num1) {
        this.num1 = num1;
    }
    
}

class sample2 extends sample1
{
    int num2;

    public sample2() {
    num2=200;
    }

    public sample2(int num2) {
        this.num2 = num2;
    }

    public sample2(int num2, int num1) {
        super(num1);
        this.num2 = num2;
    }
    
    
}

class sample3 extends sample2
{
    int num3;

    public sample3() {
    num3=300;
    }

    public sample3(int num3) {
        this.num3 = num3;
    }

    public sample3(int num3, int num2) {
        super(num2);
        this.num3 = num3;
    }

    public sample3(int num3, int num2, int num1) {
        super(num2, num1);
        this.num3 = num3;
    }

   
     void show()
     {
         System.out.println("Num 1:"+num1);
         System.out.println("Num 2:"+num2);
         System.out.println("Num 3:"+num3);
     }    
    
}

public class multilevel_inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sample3 s=new sample3(121,151,125);
        s.show();
    }
    
}

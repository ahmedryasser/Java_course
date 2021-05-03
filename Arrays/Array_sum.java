/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Ahmed Yasser
 */
public class Array_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int [] arr={1,2,3,4,5,6,7,8,9};
    int sum=0;
    for (int i=0;i<arr.length;i++){
        sum = arr[i]+sum;        
    }
    System.out.println(sum);
    }
    
}

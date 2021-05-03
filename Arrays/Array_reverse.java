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
public class Array_reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.print("[");
    for (int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+ ", ");       
    }
        System.out.print("]");
    }
    
}

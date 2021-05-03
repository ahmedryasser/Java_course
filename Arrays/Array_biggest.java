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
public class Array_biggest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] arr= {1,9,7,8,5,3,6,4};
    int b=0;
    for (int i=0;i<arr.length;i++){
        if(arr[i]>b){
            b=arr[i];
        }
        
    }
        System.out.println(b);
    
    }    
}

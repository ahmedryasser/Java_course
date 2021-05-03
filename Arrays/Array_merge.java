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
public class Array_merge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] arr={1,2,3,4};
    int [] arr2={2,4,6,8};
    int [] arr3=new int[arr.length+arr2.length];
    for (int i=0;i<arr.length;i++){
        arr3[i]= arr[i];
        }
    for (int i=0;i<arr2.length;i++){
        arr3[i+arr.length]=arr2[i];
    }
    
    /*for(int i=0;i<arr3.length;i++)
        System.out.print(arr3[i]+" ");
    */
    for(int num: arr3)
    {
            System.out.println(num);
    }
}}

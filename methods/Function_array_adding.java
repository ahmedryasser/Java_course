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
public class Function_array_adding {

    public static int[] add_array(int[] arr, int[] arr2){
    int [] arr3=new int[arr.length];
    for (int i=0;i<arr.length;i++){
    arr3[i]=arr2[i]+arr[i];
    }

        return arr3;
    
    }
    public static void main(String[] args) {
    int [] arr={1,2,3,4};
    int [] arr2={2,4,6,8};
    int [] arr3=new int[arr.length+arr2.length];
    
        int[] c=add_array(arr,arr2);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    
    }
    
}

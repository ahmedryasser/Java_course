/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;
import java.util.Scanner;
/**
 *
 * @author Ahmed Yasser
 */
public class array_eg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int s=sc.nextInt();
        int[] arr=new int[s];
        int[] b={11,22,33,44,55};
        
        System.out.println("Enter "+s+" number of elements");
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Array 1 values");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println("array 2 values");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
    
}

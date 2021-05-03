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
public class two_d_even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size");
        int r=sc.nextInt();
        System.out.println("Enter column size");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter "+r*c+" number of elements");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Array values are");
        for(int i=0;i<arr.length;i++)
        {
           
            for(int j=0;j<arr[i].length;j++)
            {
                 if (arr[i][j]%2==0){
                System.out.print(arr[i][j]+" ");
                
            }}
            System.out.println("");
        }    }
    
}

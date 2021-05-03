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
public class Array_2d_sum {

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
        int sum=0;
        System.out.println("Enter "+r*c+" number of elements");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
                sum=arr[i][j]+sum;
            }
        }
        
        System.out.println("The sum of array values is");
        System.out.println(sum);
        }
    }
    


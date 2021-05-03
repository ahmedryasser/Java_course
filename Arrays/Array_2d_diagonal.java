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
public class Array_2d_diagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
      
      for(int i=0;i<arr.length;i++)//no of rows
      {
          for(int j=0;j<arr[i].length;j++)//no of columns
          {
              if(i==j)
              System.out.print(arr[i][j]+" ");
              //i++;
          }
          System.out.println("");    }
    }
}

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
public class Array_2d_borders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
      
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[i].length;j++)
          {
              if(i ==0 || j==0 || i == arr[i].length-1 || j==arr[i].length-1 ){
              System.out.print(arr[i][j]+" ");

              }
          }
          System.out.println("");    }
    
}
}
    

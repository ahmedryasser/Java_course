
package loops;

import java.util.Scanner;

/**
 *
 * @author Ahmed Yasser
 */
public class While_n_to_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 1;
        System.out.println("Enter The number");
        int n = sc.nextInt();
        
        while (n >= a) {
            System.out.println(n);
            n--;
            
        }
    }

}

    
    


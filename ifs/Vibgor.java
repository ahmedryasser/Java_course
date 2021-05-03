/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifs;
import java.util.Scanner;
/**
 *
 * @author Ahmed Yasser
 */
public class Vibgor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your letter");
        String opt=sc.next();        

    
            switch(opt)
        {
            case "v":System.out.println("Violet");
                break;
            case "i":System.out.println("Indigo");
                break;
            case "b":System.out.println("Blue");
                break;
            case "g":System.out.println("Green");
                break;
            case "y":System.out.println("Yellow");
                break;
            case "o":System.out.println("Orange");
                break;
            case "r":System.out.println("Red");
                break;
            default:System.out.println("Invalid Input");
        }
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;
import java.util.Scanner;
/**
 *
 * @author Ahmed Yasser
 */
public class String_count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();
        int count=1;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                
                count++;
            }
        }
                    System.out.println(count);

    }}

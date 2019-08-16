/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number:");
        int a = scanner.nextInt();
       
        for(int i=0; i< 10; i++){
           System.out.println(a + "x" + (i+1) + "=" + (a * (i+1)));  
        }
        
       
    }

}

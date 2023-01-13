/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author shanv
 */
import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the number:");
        Scanner sb=new Scanner(System.in);
        int number=sb.nextInt();
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
}
}

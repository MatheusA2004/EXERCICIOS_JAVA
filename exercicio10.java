/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiormenor;

import java.util.Scanner;

/**
 *
 * @author 36127512022.1
 */
public class Maiormenor {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite o primeiro valor");
        num1 = ler.nextInt();
        
        System.out.println("digite o segundo valor");
        num2 = ler.nextInt();
        
        if(num1 > num2){
            System.out.println("o primeiro numero e maior que o segundo numero");
        } else if(num1 < num2){
            System.out.println("o primeiro numero e menor que o segundo numero");
        } else if(num1 == num2){
            System.out.println("o primeiro numero e igual o segundo numero");
        }
        
        
        
        
    }
    
}

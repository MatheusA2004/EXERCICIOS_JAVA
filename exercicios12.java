/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo;

import java.util.Scanner;



/**
 *
 * @author mathe
 */
public class Modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        int n1, resultado1, resultado2;
        
        System.out.println("digite o valor de n1:");
        n1 = ler.nextInt();
        
        if(n1 >= 0){
            resultado1 = n1;
            System.out.println("o modulo de n1 e " +resultado1);
        } else{
            resultado2 = n1 * (-1);
            System.out.println("o modulo de n1 e " +resultado2);
        }
        
        
    }
    
}

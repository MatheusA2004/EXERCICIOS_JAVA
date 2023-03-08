/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;


/**
 *
 * @author 36127512022.1
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        double n1, resultado;
        double cotacao = 5.17;
        
        System.out.println("quanto voce quer converter: ");
        n1 = ler.nextDouble();
        
        resultado = n1 * cotacao;
        
        
        
        System.out.println("voce vai ter " +resultado + " reais");
        
        
   
        
        
        
        
    }
}
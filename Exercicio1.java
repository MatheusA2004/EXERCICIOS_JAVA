/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.Scanner;





/**
 *
 * @author 36127512022.1
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        int n1, n2, estM;
        
        
        System.out.println("informe a quantidade minima");
        n1 = ler.nextInt();
        
        System.out.println("informe a quantidade maxima");
        n2 = ler.nextInt();
        
        estM = (n1 + n2) / 2;
        
        System.out.println("o estoque medio e: " +estM);
        
        
    }
    
}

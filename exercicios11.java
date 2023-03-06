/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trocados;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Trocados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        int n1, n2, Out;
        
        System.out.println("digite o valor de n1");
        n1 = ler.nextInt();
        
        System.out.println("digite o valor de n2");
        n2 = ler.nextInt();
        
        Out = n1;
        n1 = n2;
        n2 = Out;
        
        System.out.println("O valor de n1 e " +n1+ " e o valor de n2 e "+n2);
        
        
    }
    
}

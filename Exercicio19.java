/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio19;

import java.util.Scanner;

/**
 *
 * @author 36127512022.1
 */
public class Exercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Escreva o valor do lado A");
        a = ler.nextInt();
        
        System.out.println("Escreva o valor do lado B");
        b = ler.nextInt();
        
        System.out.println("Escreva o valor do lado C");
        c = ler.nextInt();
        
        
        if(a == b){
            if(b == c){
                System.out.println("o triangulo e equilatero");
            }else{
                System.out.println("o triangulo e isosceles");
            }
        }else if(b == c){
            if(a == b){
                System.out.println("o triangulo e equilatero");
            }else{
                System.out.println("o triangulo e isosceles");
            }
        }else{
            System.out.println("o triangulo e escaleno");
        }
        
         
    }
    
}

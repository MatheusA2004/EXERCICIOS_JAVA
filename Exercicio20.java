/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio20;

import java.util.Scanner;

/**
 *
 * @author 36127512022.1
 */
public class Exercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        int a,b,c,soma1,soma2,soma3 ;
        
        
        System.out.println("digite o valor do lado A: ");
        a = ler.nextInt();
        
        System.out.println("digite o valor do lado B: ");
        b = ler.nextInt();
        
        System.out.println("digite o valor do lado C: ");
        c = ler.nextInt();
        
        soma1 = a + b;
        soma2 = a + c;
        soma3 = b + c;
        
        if(a < soma3){
            if(a == b){
                System.out.println("o triangulo e isosceles");
               if(b == c){
                  System.out.println("o triangulo e equilatero");
               } 
            }
            
            if(a == c){
                System.out.println("o triangulo e isosceles");
               if(c == b){
                  System.out.println("o triangulo e equilatero");
               } 
            }
            
            if(b == c){
                System.out.println("o triangulo e isosceles");
               if(c == a){
                  System.out.println("o triangulo e equilatero");
               } 
            }
                    
            
        } else if(b < soma2){
            if(a == b){
                System.out.println("o triangulo e isosceles");
               if(b == c){
                  System.out.println("o triangulo e equilatero");
               } 
            }
            
            if(a == c){
                System.out.println("o triangulo e isosceles");
               if(c == b){
                  System.out.println("o triangulo e equilatero");
               } 
            }
            
            if(b == c){
                System.out.println("o triangulo e isosceles");
               if(c == a){
                  System.out.println("o triangulo e equilatero");
               } 
            }
           
        } else if(c < soma1){
           if(a == b){
                System.out.println("o triangulo e isosceles");
               if(b == c){
                  System.out.println("o triangulo e equilatero");
               } 
            }
            
            if(a == c){
                System.out.println("o triangulo e isosceles");
               if(c == b){
                  System.out.println("o triangulo e equilatero");
               } 
            }
            
            if(b == c){
                System.out.println("o triangulo e isosceles");
               if(c == a){
                  System.out.println("o triangulo e equilatero");
               } 
            }
        } else{
            System.out.println("o triangulo e escaleno");
        }
        
        
        
    }
    
}

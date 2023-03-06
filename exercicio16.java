/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromaior16;

import java.util.Scanner;

/**
 *
 * @author 36127512022.1
 */
public class Numeromaior16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int n1, n2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero: ");
        n1 = ler.nextInt();
        
        System.out.println("digite o segundo numero: ");
        n2 = ler.nextInt();
        
        
        if(n1 > n2){
            System.out.println("o primeiro numero e maior que o segundo");
        } else if(n2 > n1){
            System.out.println("o primeiro numero e menor que o segundo");
        } else{
             System.out.println("os numeros sao iguais");
        }
        
        
    }
    
}

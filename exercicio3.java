/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comissao;

import java.util.Scanner;



/**
 *
 * @author mathe
 */
public class Comissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            
        int id, cod, quant;
        float preco, comi;
        
        Scanner calcular = new Scanner(System.in);
        
        System.out.println("Escreva seu numero de identificacao");
        id = calcular.nextInt();
        System.out.println("digite o codigo do produto");
        cod = calcular.nextInt();
        System.out.println("digite quantas unidades serao levadas");
        quant = calcular.nextInt();
        System.out.println("digite o preco da peca");
        preco = calcular.nextFloat();
        
        comi = (preco * quant) * 5 / 100;
        
        
       
        
        if (cod == 0001){
            System.out.println("Voce está levando "+ quant + "unidades de madeira e sua comissão será de " +comi);
        } else if(cod == 0002){
            System.out.println("Voce está levando "+ quant + "unidades de ferro e sua comissão será de " +comi);
    }
        
        
        
        
        
        
    }
    
}

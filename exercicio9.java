/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idade;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ano, mes, dias;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva quantos ano, meses e dias consecutivos voce tem de vida");
        ano = ler.nextInt();
        mes = ler.nextInt();
        dias = ler.nextInt();
        System.out.println((ano * 365) + (mes *30) + dias);
        
        
        
        
        
        
    }
    
}

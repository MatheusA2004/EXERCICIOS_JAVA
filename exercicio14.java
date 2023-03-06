/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decrescente;
import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author mathe
 */
public class Decrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        int Quantidade = 3;
        int[] Numeros = new int[Quantidade];
        
        System.out.print("organizador de numeros \n\n");
        
        for(int x = 0; x < Quantidade; x++){
            System.out.print("digite o" +(x+1)+ "numero: ");
            Numeros[x] = ler.nextInt();
        }
        
        Arrays.sort(Numeros);
        System.out.println("os numeros em ordem decrescente sao: ");
        for(int Numero : Numeros){
            System.out.println(Numero);
        }
                
        
        
    }

    private static String x(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

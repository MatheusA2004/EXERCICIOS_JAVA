/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valorvalido17;

import java.util.Scanner;


/**
 *
 * @author 36127512022.1
 */
public class Valorvalido17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1;
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor: ");
        n1 = ler.nextInt();
        
        
        if(n1 > 9){
            System.out.println("valor invalido");
        } else if(n1 < 0){
            System.out.println("valor invalido");
           }else{
            System.out.println("valor valido");
        }
                
        
        
        
        
        
    }
    
}

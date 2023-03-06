/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo18;
import java.util.Scanner;


/**
 *
 * @author 36127512022.1
 */
public class Codigo18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int codigo;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite o codigo");
        codigo = ler.nextInt();
        
        if(codigo > 3){
            System.out.println("codigo invalido");
        }
        
        else if(codigo < 1){
            System.out.println("codigo invalido");
        } else{
            switch(codigo){
                case 1: System.out.println("UM"); break;
                case 2: System.out.println("DOIS"); break;
                case 3: System.out.println("TRES"); break;
            }
        }
        
    }
    
}

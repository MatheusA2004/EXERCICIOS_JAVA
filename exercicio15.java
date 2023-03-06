/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprovacao;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Aprovacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n1,n2,n3,n4,nr;
        float resultado, resultado2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite a primeira nota: ");
        n1 = ler.nextFloat();
        
        System.out.println("digite a segunda nota: ");
        n2 = ler.nextFloat();
        
        System.out.println("digite a terceira nota: ");
        n3 = ler.nextFloat();
        
        System.out.println("digite a quarta nota: ");
        n4 = ler.nextFloat();
        
        resultado = (n1 + n2 + n3+ n4) / 4;
        
       if(resultado > 7){
          System.out.println("Parabens voce passou de ano direto !!");
       } else{
           System.out.println("voce nao passou direto, digite a nota de recuperacao: ");
           nr = ler.nextFloat();
           
           resultado2 = resultado + nr;
            
          if(resultado2 >= 7){
           System.out.println("voce foi aprovado na recuperacao !!!");
            } else{
                System.out.println("voce esta reprovado");
             }
           
       }
       
      
       
       
        
        
        
    }
    
}

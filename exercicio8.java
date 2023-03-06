/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volume_lata;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Volume_lata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float raio, alt, vol;
        
        Scanner calcular = new Scanner(System.in);
        
        
        System.out.println("informe o raio da lata");
        raio = calcular.nextFloat();
        System.out.println("informe a altura da lata");
        alt = calcular.nextFloat();
        
        
        vol = (float) (3.14 * raio * raio * alt);
        
        System.out.println(vol);
        
        
        
    }
    
}

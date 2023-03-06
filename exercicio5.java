/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gasttocarro;

import java.util.Scanner;



/**
 *
 * @author mathe
 */
public class GasttoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        float tempo, dist, litro_usado;
        int veloc;
        
        
        Scanner calcular = new Scanner(System.in);
        
        System.out.println("Quanto tempo voce demorou");
        tempo = calcular.nextFloat();
        System.out.println("Qual foi a velocidade media");
        veloc = calcular.nextInt();
        
        dist = tempo * veloc;
        litro_usado = dist / 12;
        
        System.out.println("Voce percorreu uma distancia de " +dist+ " km, com uma velociade media de " +veloc+ " km/h ,em " +tempo+ " horas, e utilizou " +litro_usado+ " litros de gasolina" );
        
        
        
    }
    
}

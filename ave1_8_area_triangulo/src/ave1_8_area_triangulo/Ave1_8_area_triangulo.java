/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ave1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Ave1_8_area_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base;
        double altura;
        double area;
        //double-->tipo de datos para números con parte ecimal 
        Scanner captura = new Scanner (System.in);
        System.out.println("introduce la base del triangulo");
        base = captura.nextDouble();
        System.out.print("introduce la altura del triangulo");
        altura = captura.nextDouble();
        
        area = (base * altura) /2;
        System.out.print(area);
        
    }
    
}

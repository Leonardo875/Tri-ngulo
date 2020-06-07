/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double a;
     double b;
     double c;
        
     
       Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a medida de a:");
        a = entrada.nextDouble();
        System.out.println("Informe a medida de b:");
        b = entrada.nextDouble();
        System.out.println("Informe a medida de c:");
        c = entrada.nextDouble();
       
        if(a + b > c && a + c > b && b + c > a)
        { 
         
        
           
          if(a == b && a == c && b == c){
                 System.out.println("Equilátero");
             }
           else if(a != b && a != c && b != c){
                 System.out.println("Escaleno");
             }      
           else if(a == b && a != c || a == c && a == b || b == c && b != a){
                 System.out.println("Isósceles");
              
             }
          
        }else{
            System.out.println("Os valores não são validos");
        }
        
      
           
      
    }
    
}

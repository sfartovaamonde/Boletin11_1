
package boletín.pkg11_1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Xogo {

    public void amosarNumSecreto(){
        //declaramos e inicializamos el número secreto que vamos a introducir, el número que introducirá el jugador 2 y el número máximo de intentos
    int numSecr;
    int num2;
    int num3;
    
    //creo el método scanner para introducir por teclado el número máximo de intentos y el número secreto
    Scanner sc = new Scanner(System.in);
        System.out.println("El juego consiste en adivinar un número entre el 1 y el 10");
      
        System.out.println("introduce el número máximo de intentos");
       num3=sc.nextInt();
       
        System.out.println("El número máximo de intentos son: "+ num3);
        
        System.out.println("xogador 1, introduce el número secreto");
        numSecr=sc.nextInt();
       
        //inicializo y declaro el contador intentos
        int intentos=0;
        // utilizo una estructura con for, ya que sabemos el número de veces como máximo que se repetirá el bucle
        for (int contador=0; contador<num3; contador++ ){
           // le pedimos al jugador 2 que introduzca un número
            System.out.println(" Xogador 2, introduce un número");
            num2=sc.nextInt();
            //utilizamos un if, si el número introducido por el jugador dos es distinto que el número secreto, sumamos un intento cada vez que introduzca el jugador un número que sea distitno del secreto
            if (num2!=numSecr){
                
                intentos++;
                
                JOptionPane.showMessageDialog(null," No has acertado, inténtalo de nuevo, además has ralizado" + intentos + " intentos ");
                
           
                if ( numSecr>num2)
                JOptionPane.showMessageDialog(null, " MENSAJE DE AYUDA: "+"\n"+"el número secreto es mayor que" +  num2);
            else if (numSecr<num2)
                JOptionPane.showMessageDialog(null," MENSAJE DE AYUDA: "+"\n"+"el número secreto es menor que "+  num2);
                
            }
            else if ( num2==numSecr){
                intentos++;
                
                JOptionPane.showMessageDialog(null, " Has acertado!"+"\n"+"realizaste" + intentos + " intentos ");
                break;
            }

    }
    

    }  
    
}

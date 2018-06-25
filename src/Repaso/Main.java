
package Repaso;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        
        int f, c;
                
        Scanner entrada = new Scanner(System.in);
        
        //se ingresan el numero de filas y columnas
        System.out.print("Ingrese el numero de Filas: ");
        f= entrada.nextInt();
        System.out.print("Ingrese el numero de Columnas: ");
        c = entrada.nextInt();
        
        //se declaran las  Matrices:
        int a[][] = new int[f][c];int b[][] = new int[f][c];int d[][] = new int[f][c];
        
        Matriz obj = new Matriz (); //se declara el objeto
        
        //se envia a imprimir el resultado
        obj.entradaa(f, c, a, d);
        obj.entradab(f, c, b, d);
        System.out.println("La suma de matrices es: ");
        obj.suma(f, c, a, b, d);
        obj.ordn(c, f, d);
    }    
}

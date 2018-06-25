
package Repaso;

import java.util.Scanner;


public class Matriz {

    public Matriz() {
    }
    //ingresan los valores de la matriz a
    public void entradaa(int f, int c, int [][]a,int[][]d){
        Scanner entrada = new Scanner (System.in);
        System.out.println("\nMatriz a[][]\n");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese ["+i+"]["+j+"]: ");
                a[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < f; i++) {
            System.arraycopy(a[i], 0, d[i], 0, c);
        }
        mostrar(f, c, d);
    }
    //ingresi de balores de la matriz b
    public void entradab(int f, int c, int [][]b,int[][]d){
        Scanner entrada = new Scanner (System.in);
        System.out.println("=== Matriz b[][] ===\n"); 
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese ["+i+"]["+j+"]: ");
                b[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < f; i++) {
            System.arraycopy(b[i], 0, d[i], 0, c);
        }
        mostrar(f, c, d);
    }
    //suma ambas matrices
    public void suma(int f, int c, int [][]a,int [][]b,int [][]d){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = a[i][j] +  b[i][j];
            }
        }
        mostrar(f, c, d);
    }
    //imprime el resltado    
    public void mostrar(int f, int c,int[][]d){
        System.out.println("");
        for (int i = 0; i < f; i++) {            
            for (int j = 0; j < c; j++) {
                System.out.print("\t"+"|"+d[i][j]+"|");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    //valida el mayor  y ordena:
    public void ordn(int[][]d,int fil,int col){
        int aux = d[0][0];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (aux > d[i][j]){
                    aux = d[i][j];
                }
            }
        }
        System.out.println("El numero menor es: "+aux+"\n");
    }

    void ordn(int c, int f, int[][] d) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

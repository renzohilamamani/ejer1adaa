/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1adaa;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author USUARIO
 */
public class ejercici2ad {
    public static void main(String[] args){
       Scanner leer  = new Scanner (System.in);
        System.out.println("ingrese la dimension del ejercicio 2");
        int d =leer.nextInt() ;
        int cuadrado[][]= new int [d][d];
        int rota[][] = new int [d][d];
        llenar(cuadrado);
        System.out.println("cuadrado normal ");
        mostrar(cuadrado); 
        rotacion(cuadrado,d,rota);
        mostrarrotacion(rota);
        
        
        
    }
    public static int[][] llenar(int [][] cuadrado){
        for(int i = 0 ; i< cuadrado.length;i++){
            for(int j = 0 ; j< cuadrado.length; j++){
                
                cuadrado[i][j] = (int) (Math.random() * 50) + 1;

            }
        }
        return cuadrado;
    }
    public static int mostrar(int [][] cuadrado ){
        for(int i = 0 ; i< cuadrado.length;i++){
            for(int j = 0 ; j< cuadrado.length;j++){
                System.out.print(cuadrado[i][j]+ " ");
            }
            System.out.println();
        }
        return 0 ;
    }
    public static int [][] rotacion (int [][] cuadrado, int d, int [][] rota){
        int aux = cuadrado.length-1;
        for(int i = 0 ; i< cuadrado.length;i++){
            for(int j = 0; j< cuadrado.length;j++){
                rota[j][aux]= cuadrado[i][j];
            }
            aux = aux -1 ;
        }
        
        
        return rota;
    }
    public static int mostrarrotacion(int [][] rota){
        System.out.println(" cuadrado rotado   .....");
        for(int i = 0 ; i< rota.length;i++){
            for(int j = 0; j < rota.length;j++){
                System.out.print(rota[i][j]+ " ");
            }
            System.out.println();
        }
        return 0;
    }
    
}

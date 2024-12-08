/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1adaa;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author USUARIO
 */
public class Ejer1adaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer  = new Scanner (System.in);
        System.out.println("ingrese la dimension del ejercicio 1");
        int d =leer.nextInt() ;
        int cuadrado[][]= new int [d][d];
        llenar(cuadrado);
        mostrar(cuadrado);
       int  uno = sumauno(cuadrado,d);
       int dos = sumados(cuadrado);
       
       System.out.println("suma de izquierda superior a derecha inferior es  : "+ uno);
       System.out.println("suma de derecha superior a izquierda inferior es "+ dos);
        
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
    public static int sumauno(int [][] cuadrado, int d ){
        int sum = 0 ; 
        for(int i = 0 ; i < cuadrado.length;i++){
            sum = sum + cuadrado[i][i];
        }
        
        return sum;
    }
    public static int sumados(int [][] cuadrado){
        int su  = 0;
        int j = cuadrado.length - 1;
        for(int i = 0; i< cuadrado.length;i++){
            su = su + cuadrado[i][j];
            j= j -1;
        }
        return  su ;
    }
    
}

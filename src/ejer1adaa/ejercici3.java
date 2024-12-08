/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1adaa;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class ejercici3 {
    public static void main(String[] args){
       Scanner leer  = new Scanner (System.in);
        System.out.println("ingrese la dimension del ejercicio 3");
        int d =leer.nextInt() ;
        int cuadrado[][]= new int [d][d];
        rellenar(cuadrado);
        mostrar(cuadrado);
        int p = perimetro(cuadrado);
        System.out.println("la suma del perimetro es  "+  p);
    }
    public static int [][] rellenar(int [][] cuadrado){
        for(int i = 0 ; i< cuadrado.length;i++){
            for(int j = 0 ; j< cuadrado.length;j++){
                cuadrado[i][j]= (int )(Math.random()* 20)+ 1;
            }
        }
        return cuadrado;
    }
    public static int mostrar(int [][]cuadrado){
        for(int i = 0 ; i< cuadrado.length;i++){
            for(int j = 0 ; j< cuadrado.length;j++){
                System.out.print(cuadrado[i][j]+ " ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int perimetro(int [][] cuadrado){
        int sum = 0 ;
        for(int i = 0 ; i< cuadrado.length;i++){
            sum = sum + cuadrado[0][i];
        }
        for(int j= 1 ; j< cuadrado.length;j++){
            sum = sum + cuadrado[j][0];
        }
        for(int k = 1; k < cuadrado.length;k++){
            sum = sum + cuadrado[k][cuadrado.length-1];
        }
        for(int p = 1 ; p< cuadrado.length - 1;p++){
            sum = sum + cuadrado[cuadrado.length-1][p];
        }
        return sum;
    }
    
    
}

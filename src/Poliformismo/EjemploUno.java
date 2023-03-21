package Poliformismo;

import java.util.Scanner;

public class EjemploUno {
    static Scanner lectura=new Scanner(System.in);
    public static void main(String[] args) {
        cuadrado ejecucion1=new cuadrado();
        triangulo ejecucion2=new triangulo();
        rectangulo ejecucion3=new rectangulo();
        circulo ejecucion4=new circulo();
        int op1=1,elec;
        System.out.println("digite 1 para calcular el area de el cuadrado, 2 para el triangulo, 3 para el rectangulo, 4 para el circulo");
        elec=lectura.nextInt();
        while (op1==1) {
            if (elec==1) {
                ejecucion1.calcularArea();
                
            } else if (elec==2) {
                ejecucion2.calcularArea();
                
            }
            else if(elec==3){
                ejecucion3.calcularArea();
                
            }
            else if(elec==4){
                ejecucion4.calcularArea();

            }
            System.out.println("digite 1 para continuar y 2 para parar");
            op1=lectura.nextInt();
        }   
    }
}

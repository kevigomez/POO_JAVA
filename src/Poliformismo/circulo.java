package Poliformismo;

import java.util.Scanner;

public class circulo extends figura{
    Scanner lectura=new Scanner(System.in);
    private double R;
    public double getR(){
        return R;
    }
    public void setR(float R){
        this.R=R;
    }
    @Override
    
    public void calcularArea(){
        System.out.println("digite el radio de el circulo");
        this.R=lectura.nextDouble();
         R = Math.pow(R, 2);
    double area=3.1416*R;
    System.out.println("el radio de el circulo es "+ R +" el area es "+area);
    }
    
}

package Poliformismo;

import java.util.Scanner;

public class triangulo extends figura{
    Scanner lectura=new Scanner(System.in);
    private double base , altura;
    public double getBase(){
        return base;
    }
    public double  getaltura(){
        return altura;
    }
    public void setLado(Double base){
        this.base=base;
    }
    public void setaltura(Double altura){
        this.altura=altura;
    }
    @Override
    
    public void calcularArea(){
        System.out.println("digite la base de el triangulo");
        this.base=lectura.nextDouble();
        System.out.println("digite la altura de el triangulo");
        this.altura=lectura.nextDouble();
        double area=(base*altura)/2;
        System.out.println("la base de el triangulo es "+ base +"y la altura es "+altura+" el area es "+area);
    }
    
    
}

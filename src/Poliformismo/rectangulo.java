package Poliformismo;

import java.util.Scanner;

public class rectangulo extends figura{
    static Scanner lectura =new Scanner(System.in);
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
        System.out.println("digite la base de el triagulo");
        this.base=lectura.nextDouble();
        System.out.println("digite la altura de el triagulo");
        this.altura=lectura.nextDouble();
    double area=base*altura;
    System.out.println("la base de el rectangulo es "+ base +"y la altura es "+altura+" el area es "+area);
    }    
}

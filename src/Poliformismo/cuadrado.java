package Poliformismo;
import java.util.Scanner;
public class cuadrado extends figura {
    static Scanner lectura =new Scanner(System.in);
    private float lado;//encapsulado atributo
    //metodos accesores get set
    public float getLado(){
        return lado;
    }
    public void setLado(float lado){
        this.lado=lado;
    }
    @Override
    
    public void calcularArea(){
        System.out.println("digite el lado de el cuadrado");
        this.lado=lectura.nextFloat();
    float area=lado+lado;
    System.out.println("el lado cuadrado es "+lado+" el area es "+area);
    }
    
}

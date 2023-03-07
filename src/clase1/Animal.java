package clase1;

import java.util.Scanner;

public class Animal {
    private String nombre;
    public int edad;
    Scanner lectura =new Scanner(System.in);
    public void registrarAnimal(String n,int e) {
    nombre=n;
    edad=e;
    }
    public void mostrarAnimal(){
    System.out.println("el nombre de el animal es "+nombre +"y la edad es "+edad);  
    }
    public int duplicarEdad(){
        int duplicado=edad*2;
        return duplicado ;
    }

}

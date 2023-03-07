package clase1;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Animal guacamayo=new Animal();
        Scanner lectura =new Scanner(System.in);
        System.out.println("Ingrese nombre de el animal");
        String nombre=lectura.next();
        System.out.println("Ingrese la edad de el animal");
        int edad=lectura.nextInt();
        guacamayo.registrarAnimal(nombre, edad);//invocar
        guacamayo.mostrarAnimal();
        Movie titanic =new Movie();
        
        int duplicado = guacamayo.duplicarEdad();{
            System.out.println("el duplicado de la edad es"+duplicado);
        }
        
    }
}

package clase1;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Animal guacamayo=new Animal();
        Animal panda=new Animal("Po", 18);
        Scanner lectura =new Scanner(System.in);
        System.out.println("Ingrese nombre de el animal");
        String nombre=lectura.next();
        System.out.println("Ingrese la edad de el animal");
        int edad=lectura.nextInt();
        guacamayo.setNombre("Pablo");
        guacamayo.setEdad(4);
        System.out.println("el nombre de el guacamayo es "+guacamayo.getNombre()+" y la edad es "+guacamayo.getEdad());
        guacamayo.registrarAnimal(nombre, edad);//invocar
        guacamayo.mostrarAnimal();
        Movie titanic = new Movie("titanic","romance",2005,210);
        Movie la_noche_del_demonio= new Movie("la noche de el demonio", "terror",2010,210);
        
        int duplicado = guacamayo.duplicarEdad();{
            System.out.println("el duplicado de la edad es"+duplicado);
        }
        
    }
}


package salud;
import java.util.Scanner;

public class Persona {
    String tipeDoc, name ,lastName,sex;
    int   document, age;
    double weigth , heigth;
    Scanner lectura =new Scanner(System.in);
    public void pedirDatos() {
    System.out.println("Ingrese el tipo de documento");
    tipeDoc=lectura.nextLine();
    System.out.println("Ingrese su nombre");
    name=lectura.next();
    System.out.println("Ingrese su edad ");
    age=lectura.nextInt();
    System.out.println("Ingrese su numero de documento ");
    document=lectura.nextInt();
    System.out.println("Ingrese su estatura M");
    heigth=lectura.nextDouble();
    System.out.println("Digite su peso en Kg");
    weigth=lectura.nextDouble();
    System.out.println("digite su sexo");
    sex=lectura.next();
    }
    public void mostrarPersona(){
    System.out.println("datos de la persona, nombre: "+name+", tipo de documento: "+tipeDoc+", edad:"+age+", numero de documento:"+document+", estatura:"+heigth+", peso:"+weigth);  
    }
    public void calcularImc(){
        double pesoActual = Math.pow(heigth, 2);
        double pesoEstatura = pesoActual/weigth;
              if (pesoEstatura<20) {
            System.out.println("esta por debajo peso ideal");
        }
        else if (pesoEstatura>=20 && pesoEstatura<=25) {
            System.out.println("esta en el peso ideal");
        }
        else if (pesoEstatura>25) {
            System.out.println("tiene sobrepeso");
        }
        else{
            System.out.println("error");
        }
    if (age>=18) {
        System.out.println("mayor de edad");
    }
    else if (age<=18) {
        System.out.println("menor de edad");
  }         


    }

}

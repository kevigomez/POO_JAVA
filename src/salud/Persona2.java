package salud;
import java.util.Scanner;

public class Persona2 {
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
    
    System.out.println("digite su sexo");
    sex=lectura.next();
    }
    public void mostrarPersona(){
    System.out.println("datos de la persona, nombre: "+name+", tipo de documento: "+tipeDoc+", edad:"+age+", numero de documento:"+document+", estatura:"+heigth+", peso:"+weigth);  
    }
    public double calcularImc(double h double w){
        heigth = h;
        weigth = w;
        double pesoActual = Math.pow(heigth, 2);
        double pesoEstatura = pesoActual/weigth;
              if (pesoEstatura<20) {
            peso=PESOBAJO;
        }
        else if (pesoEstatura>=20 && pesoEstatura<=25) {
            System.out.println("esta en el peso ideal");
            peso=PESOIDEAL;
        }
        else if (pesoEstatura>25) {
            System.out.println("tiene sobrepeso");
            peso=SOBREPESO;
        }
        else{
            System.out.println("error");
        }
        return peso;
    }
        public void mayoEdad(){
    if (age>=18) {
        System.out.println("mayor de edad");
    }
    else if (age<=18) {
        System.out.println("menor de edad");
  }         

     
    }

}

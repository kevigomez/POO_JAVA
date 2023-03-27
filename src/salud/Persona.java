
package Salud;
import java.util.Scanner;
public class Persona {
    private String tipeDoc,document,name,lastName,sex;
    private double weigth,heigth ;
    private int age;

    public Persona(String string, String string2, String string3, String string4, int i, int j, int k, char c) {
    }

    public Persona(String tipeDoc, String document, String name, String lastName, double weigth , double heigth, int age, String sex) {
        this.tipeDoc = tipeDoc;
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.weigth  = weigth ;
        this.heigth = heigth;
        this.age = age;
        this.sex = sex;
    }

    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Tipo de documento: ");
        tipeDoc = lectura.nextLine();

        System.out.print("documento: ");
        document = lectura.nextLine();

        System.out.print("Nombre: ");
        name = lectura.nextLine();

        System.out.print("Apellido: ");
        lastName = lectura.nextLine();

        System.out.print("peso  (en kg): ");
        weigth  = lectura.nextDouble();

        System.out.print("estatura (en m): ");
        heigth = lectura.nextDouble();

        System.out.print("Edad: ");
        age = lectura.nextInt();

        System.out.print("sex: ");
        sex = lectura.next();
        lectura.close();

    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipeDoc);
        System.out.println("Documento: " + document);
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Peso  (en kg): " + weigth );
        System.out.println("Estatura (en m): " + heigth);
        System.out.println("Edad: " + age);
        System.out.println("sexo: " + sex);
    }

    public String calcularImc() {
        double imc = this.weigth  / (this.heigth * this.heigth);
    
        if (imc < 20) {
            return "PESOBAJO";
        } else if (imc >= 20 && imc <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO ";
        }
    }
    

    public void mayorEdad() {
        if (age >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}

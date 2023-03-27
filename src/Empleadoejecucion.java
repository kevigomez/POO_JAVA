import java.util.Scanner;

import Reto3.Empleado;

public class Empleadoejecucion {
    public static void main(String[] args) {
        try (Scanner lectura = new Scanner(System.in)) {
            System.out.println("Ingrese el tipo de documento (CC, CE, TI, etc.):");
            String tipoDocumento = lectura.nextLine();

            System.out.println("Ingrese el número de documento:");
            String numeroDocumento = lectura.nextLine();

            System.out.println("Ingrese los nombres:");
            String nombres = lectura.nextLine();

            System.out.println("Ingrese los apellidos:");
            String apellidos = lectura.nextLine();

            System.out.println("Ingrese el cargo:");
            String cargo = lectura.nextLine();

            System.out.println("Ingrese el valor por hora:");
            double valorHora = lectura.nextDouble();

            System.out.println("Ingrese las horas trabajadas:");
            double horasTrabajadas = lectura.nextDouble();

            System.out.println("Ingrese el departamento:");
            String departamento = lectura.next();

            Empleado empleado = new Empleado(tipoDocumento, numeroDocumento, nombres, apellidos, cargo, valorHora, horasTrabajadas, departamento);
            empleado.imprimirInformacion();
        }
    }
}
package Reto3;

public class Empleado extends Persona2 {
    private String charge;
    private double hourCost;
    private double hoursWorked;
    private String departament;

    public Empleado(String tipoDocumento, String numeroDocumento, String nombres, String apellidos, String charge, double hourCost, double hoursWorked2, String departament) {
        super(tipoDocumento, numeroDocumento, nombres, apellidos);
        this.charge = charge;
        this.hourCost = hourCost;
        this.hoursWorked = hoursWorked2;
        this.departament = departament;
    }

    public String getcarge() {
        return charge;
    }

    public double getValorHora() {
        return hourCost;
    }

    public double gethoursWorked() {
        return hoursWorked;
    }

    public String getdepartament() {
        return departament;
    }

    public double calcularHonorarios() {
        double total = hourCost * hoursWorked;
        double reteica = total * 0.00966;
        return total - reteica;
    }

    public void imprimirInformacion() {
        System.out.println(gettipeDocument() + " " + getnumberDocument() + " - " + getnames() + " " + getlastNames());
        System.out.println("cargo: " + charge);
        System.out.println("Horas trabajadas: " + hoursWorked);
        System.out.println("Valor por hora: " + hourCost);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }
}
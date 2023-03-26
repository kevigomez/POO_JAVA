import java.util.Scanner;

public class Cuadrado  extends Figura{
    Scanner lectura = new Scanner(System.in);

    @Override
    public double calcularAreaCu() {

        double lado;
        System.out.println("Digite el lado del cuadrado");
        lado= lectura.nextDouble();
        double area=lado*lado;
        System.out.println("El area del cuadrado es "+area);
        return area;

    }

    @Override
    public double calcularAreaTr() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaT'");
    }

    @Override
    public double calcularAreaCi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaCI'");
    }

  
    
    
}

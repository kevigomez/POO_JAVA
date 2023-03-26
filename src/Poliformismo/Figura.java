import java.util.Scanner;

public abstract class Figura {

    public abstract double calcularAreaCu();
    public abstract double calcularAreaCi();
    public abstract double calcularAreaTr();


    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int eleccion,op=1;
        
        while(op==1){
 
            System.out.println("Digite 1 para calcular el area del cuadrado, 2 para el area del circulo,3 para el area del triangulo");
        eleccion= lectura.nextInt();
        if(eleccion==1){
            
          Cuadrado cuadrado = new Cuadrado();
         cuadrado.calcularAreaCu();
     


        }
        if(eleccion==2){
            
            Circulo circulo = new Circulo();
           circulo.calcularAreaCi();
       
  
  
          }
          if(eleccion==3){
            
            Triangulo triangulo = new Triangulo();
            triangulo.calcularAreaTr();
       
  
  
          }
          System.out.println("Desea continuar 1.si 2.no");
          op = lectura.nextInt();

    }
    lectura.close();

}
    

}

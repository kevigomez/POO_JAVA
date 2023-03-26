package Poliformismo;
package Poliformismo;
import java.util.Scanner;
public class Reto5 implements Juego{
    Scanner lectura=new Scanner(System.in);
    private String namePlayer;
    private String eleccion ;
    private int lanzamiento ;
    @Override
    public void iniciar() {
        System.out.println("ingrese el nombre de el jugador");
        namePlayer=lectura.next();
    }

    @Override
    public void jugar() {
        System.out.println(namePlayer+" seleccione  piedra, papel o tijera");
        eleccion=lectura.next();   
    }

    @Override
    public void finalizar() {
         lanzamiento=(int)(Math.random()*3+1);
          if (eleccion.equals("piedra") && lanzamiento == 1) {
        System.out.println("al escoger "+eleccion+" usted empato");
    }
    else if (eleccion.equals("papel") && lanzamiento == 2) {
        System.out.println("al escoger "+eleccion+" usted empato");
    }
    else if (eleccion.equals("tijera") && lanzamiento == 3) {
        System.out.println("al escoger "+eleccion+" usted empato");
    }
    else if (eleccion.equals("piedra") && lanzamiento == 3) {
        System.out.println("al escoger "+eleccion+" la maquina seleciono tijera por tanto usted gano");
    }
    else if (eleccion.equals("papel") && lanzamiento == 1) {
        System.out.println("al escoger "+eleccion+" la maquina seleciono piedra por tanto usted gano");
    }
    else if (eleccion.equals("tijera") && lanzamiento == 2) {
        System.out.println("al escoger "+eleccion+" la maquina seleciono papel por tanto usted gano");
    }
    else if (eleccion.equals("piedra") && lanzamiento == 2) {
        System.out.println("al escoger "+eleccion+" la maquina seleciono papel por tanto usted perdio");
    }
    else if (eleccion.equals("papel") && lanzamiento == 3) {
        System.out.println("al escoger "+eleccion+" la maquina seleciono tijera por tanto usted perdio");
    }
    else if (eleccion.equals("tijera") && lanzamiento == 1) {
        System.out.println("al escoger "+eleccion+" la maquina seleciono piedra por tanto usted perdio");
    }
    else {
        System.out.println("error intente de nuevo");

    }
      
    }

   
    
    
}

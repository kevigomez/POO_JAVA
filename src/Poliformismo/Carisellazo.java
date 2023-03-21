package Poliformismo;

import java.util.Scanner;

public class Carisellazo implements Juego {
    Scanner lectura=new Scanner(System.in);
    private String namePlayer;
    private int eleccion ;
    private int lanzamiento ;

    @Override
    public void iniciar() {
        System.out.println("ingrese el nombre de el jugador");
        namePlayer=lectura.next();

    }

    @Override
    public void jugar() {
        int lanzamiento=(int)(Math.random()*2+1);
        System.out.println(namePlayer+"seleccione 1 para cara 2 para sello");
        eleccion=lectura.nextInt();
        
    }

    @Override
    public void finalizar() {
        if(lanzamiento==1 && eleccion==1){
            System.out.println(namePlayer+" usted a ganado al elegir "+eleccion+" siendo el lanzamiento "+lanzamiento);
        }
        else if(lanzamiento==2 && eleccion==2){
            System.out.println(namePlayer+" usted a ganado al elegir "+eleccion+" siendo el lanzamiento "+lanzamiento);
        }
        else{
            System.out.println(namePlayer+"perdio");
        }
    }
    
}

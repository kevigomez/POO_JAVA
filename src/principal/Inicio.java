package principal;

import salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.pedirDatos();
        persona.calcularImc();
        persona.mostrarPersona();
        
    }
    
}

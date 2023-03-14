package clase1;

public class Ave extends Animal {
    private String envergadura;
    public Ave(){

    }
    public Ave(String nombre, int edad, String envergadura){
            super(nombre,edad);
            this.envergadura=envergadura;
    }
    public String getEnvergadura(){
        return envergadura;

    }
    public void getEnvergadura(String envergadura){
        this.envergadura=envergadura;

    }
    public void mostrarAve() {
        System.out.println("el nombre de el animal es "+getNombre()+" tiene "+getEdad()+" años ");
        
    }

    
}

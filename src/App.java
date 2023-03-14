import clase1.Animal;
import clase1.Movie;
import clase1.Ave;
public class App {
    public static void main(String[] args) throws Exception {
        Animal nombre=new Animal();
        Movie Avatar=new Movie();
        Ave Condorito=new Ave();

        Avatar.setNombre("avatar");
        Avatar.setCategory("accion");
        Avatar.setYear(2010);
        Avatar.setDuration(330);
        Condorito.setNombre("Condorito");
        Condorito.setEdad(50);

    }
}

package clase1;

public class Movie {
            private String name;
            private String category;
            private int year;
            private int duration;
            public Movie(String name, String category, int year,int duration) {
                this.name = name;
                this.category = category;
            }
            public void mostrarMovie(){
                System.out.println("el nombre de la pelicula es "+name+" y es de "+category);
            }
            public static void mostrarMovie(String nombre,String categoria){
                System.out.println("el nombre de la pelicula es "+nombre+" y es de "+categoria);
            }
            public void mostrarMovie(String nombre ){
                System.out.println("el nombre de la pelicula es "+nombre);
            }
            public void setNombre(String name){
                this.name=name;
            }
            public void setCategory(String category){
                this.category=category;
            }
            public void setYear(int year){
                this.year=year;
            }
            public void setDuration(int duration){
                this.duration=duration;
            }
}

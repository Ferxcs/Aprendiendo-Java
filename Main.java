public class Main{
    public static void main(String[] args) {

        System.out.println("Hola, Mundo!");
        System.out.println("Pelicula: Matrix");
     
        //Comentario
        //Tipos de variables

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (notaDeLaPelicula + 7.3 + 9.1) / 3;

        String sinopsis = """
                Matrix es una paradoja 
                La mejor pelicula del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        //vamos a concatenar

        System.out.println(sinopsis);

        //convirtiendo valores 
        int calificacion = (int) (media/2);
        System.out.println(calificacion + " estrellas");
    }
}
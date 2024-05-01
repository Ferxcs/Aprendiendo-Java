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
        
        //probando mas cambios explícitos 
        // byte prueba = (byte) calificacion;
        // System.out.println(prueba + " <- es un tipo byte");

        // System.out.println("El tipo de dato de 'prueba' es: " + ((Object)prueba).getClass().getSimpleName());

        // //probando formatos de texto para no tener que estar concatenandolos.
        // System.out.printf("El tipo de dato de %d es: ", calificacion);

        int numero = 10;
        String tipoDeDato = String.format(((Object)numero).getClass().getSimpleName());
        //System.out.println(tipoDeDato);

        // Utilizando String.format()
        String mensajeFormat = String.format("El tipo de dato de %d es: %s",numero, tipoDeDato);
        System.out.println(mensajeFormat);

        // Utilizando System.out.printf()
        System.out.printf("El tipo de dato de %d es: %s",numero, tipoDeDato);

        //probando...
        // double numero = 20;
        // System.out.println(numero);
    }
}
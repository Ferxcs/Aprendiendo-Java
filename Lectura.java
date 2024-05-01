import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la Película: ");
        String nombrePelicula = sc.nextLine();

        System.out.println("Ingrese la fecha de lanzamiento: ");
        int fechaDeLanzamiento = sc.nextInt();

        System.out.println("Ingrese la calificación de la Película: ");
        float calificacion = sc.nextFloat();

        System.out.printf("Nombre: %s", nombrePelicula);
        System.out.printf("%nFecha de lanzamiento: %d", fechaDeLanzamiento);
        System.out.printf("%nCalificación: %.2f",calificacion);
    }   
}
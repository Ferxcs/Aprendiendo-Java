public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        if (fechaDeLanzamiento >= 2000) {
            System.out.println("Películas más polulares.");
        } else {
            System.out.println("Película retro que aún vale la pena ver.");
        }

        String tipoPlan = "Plus";

        if (incluidoEnElPlan && tipoPlan.equals("Plus")) {
            System.out.println("Disfrute de la Película.");
        } else {
            System.out.println("Película no disponible en su plan actual.");
        }
    }
}

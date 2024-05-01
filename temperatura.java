import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CONVERTIR TEMPERATURAS DE CELCIUS A FAHRENHEIT");
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Ingrese la temperatura en grados celcius: ");
        float celcius = scanner.nextFloat();
        scanner.close();

        //convirtiendo

        float fahrenheit = (float) ((celcius * 1.8) + 32);

        System.out.printf("La temperatura %.2f °C a grados Fahrenheit es: %.2f °F",celcius, fahrenheit);

    }
}

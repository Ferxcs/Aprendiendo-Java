import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Debemos de crear un sistema para un cajero automático con un Menú.

        System.out.println("||BIENVENIDO USUARIO||");
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = sc.nextLine();
        double saldo = 999.99;
        boolean banco = true;

        System.out.printf("***************************%n");
        System.out.printf("Nombre del cliente: %s%n", nombre);
        System.out.printf("Tipo de cuenta: Corriente%n");
        System.out.printf("Saldo disponible: %.2f%n",saldo);
        System.out.printf("***************************%n");
        

        do {
            //Código a ejecutar al menos una vez
             //*******MENÚ*********
            System.out.println("->ESCOJA LA OPCIÓN A REALIZAR<-");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");

            System.out.printf("---> ");
            int opcion = sc.nextInt();

            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 9) { 
                System.out.println("Opción no valida!");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.printf("Su saldo actual es de: %.2f%n",saldo);
                        break;
                    
                    case 2:
                        System.out.printf("Ingrese la cantidad a retirar: ");
                        double retirar = sc.nextDouble();

                        if (retirar <= saldo) {
                            saldo -= retirar;
                            System.out.printf("Monto retirado: %.2f%n",retirar);

                        } else {
                            System.err.printf("Saldo insuficiente%n");
                        }
                        break;
                    
                    case 3:
                        System.out.printf("Ingrese la cantidad a depositar: ");
                        double depositar = sc.nextDouble();
                        saldo += depositar;
                        System.out.printf("Monto depositado: %.2f%n",depositar);
                        break;

                    case 9:
                        System.out.printf("Gracias por usar nuestros servicios.");
                        banco = false;
                        break;
                
                    default:
                        break;
                }
            }


        } while (banco);


    }
    
}

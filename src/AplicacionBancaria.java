import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {

        double saldoDisponile = 1599.99;
        var salir = false;

        System.out.println("**************************************");
        System.out.println("Nombre del Cliente: Tony Stark");
        System.out.println("Tipo de cuenta: Corriente");
        System.out.println("Saldo disponible: " + saldoDisponile);
        System.out.println("**************************************");
        System.out.println();

        while (!salir) {
            System.out.println("""
                    **Escriba el numero de la opcion deseada**
                    1 - Consultar Saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            int opcion = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.println("El saldo actualizado es: " + saldoDisponile);
                }
                case 2 -> {
                    System.out.println("¿Cual es el valor que desea retirar? ");
                    var retira = Double.parseDouble(new Scanner(System.in).nextLine());
                    if (retira <= 0) {
                        System.out.println("no puede retirar 0 pesos ni valores negativos");
                    } else if(retira <= saldoDisponile) {
                        saldoDisponile = saldoDisponile - retira;
                        System.out.println("Tu saldo disponible es de: " +saldoDisponile);
                    } else {
                        System.out.println("Saldo insuficiente");
                        System.out.println("su retiro de " + retira + " es superior a su saldo de " + saldoDisponile + " no se puede efectuar el retiro");
                    }
                }
                case 3 -> {
                    System.out.println("Cual es el valor que desea depositar?");
                    var deposita = Double.parseDouble(new Scanner(System.in).nextLine());
                    if (deposita <= 0) {
                        System.out.println("no puede depositar 0 pesos o valores negativos");
                    } else {
                        saldoDisponile = saldoDisponile + deposita;
                        System.out.println("El saldo actualizado es de: " + saldoDisponile);
                    }
                }
                case 9 -> {
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    salir = true; //salimos del ciclo while
                }
                default -> System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println(); //salto de linea
        }

    }
}

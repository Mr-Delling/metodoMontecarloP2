package aplicacion;
import mates.Matematicas;
import java.util.Scanner;

public class MetodoMontecarloP2 {
    public static void main(String[] args) {
        /*
              Obtención de una aproximación recursiva al número pi
         */
        // Vamos a guardar en la variable tiros el valor introducido como argumentos y si no se introduce ninguno guardaremos el valor introducido pro el termial
        long tiros = 0;
        // Miramos si se ha pasado algun argumento al ejecutar el programa
        if (args.length > 0) {
            try {
                tiros = Long.parseLong(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Error --> El argumento tiene que ser un número entero válido.");
                System.exit(1);
            }
        }else {
            // Si no hay argumentos, pedir el número al usuario para que no nos salte un eror por no haberse pasado ningun argumento
            // Si el nuemro pedido no es entero entonces salrar error y salir del programa
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduce el número de dardos a tirar para estimar PI: ");
                tiros = scanner.nextLong();
            } catch (Exception e){
                System.err.println("Error --> El valor introducido tiene que ser un numero entero");
                System.exit(1);
            }

        }
        // Comprobamos q el usuario no ha introducido numeros negativos
        if (tiros <= 0) {
            System.err.println("Error -->  El numero introducido es 0 o menor q 0 vuelva a ejecutar el programa.");
            System.exit(1);
        }

        // Muestra el resultado
        System.out.println("El número PI es " + Matematicas.generarNumeroPiIterativo(tiros));
    }

}


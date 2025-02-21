package mates;

public class Matematicas {
    /**
     * Genera una aproximació n al número pi mediante el método de
     * Montecarlo. El pará metro ` pasos` indica el número de puntos
     * generado.
     */
    public static double generarNumeroPiIterativo(long pasos){
        if (pasos <= 0){
            System.err.println("Error --> El numero introducido es 0 o menor q 0 vuelva a ejecutar el programa.");
            System.exit(1);
        }
        int dentro = conteoPi(pasos, 0);
        //System.out.println("dentro = " + dentro);
        double pi;
        pi = 4.0 * ((double) dentro / pasos); // (tines que pasar los datos a double sino no es capaz de realizar la operacion)
        // System.out.println("pi = " + pi); (Comprobacion de slida de resultado correcta)
        return pi;
    }

    private static int conteoPi(long pasos, int dentro) {
        if (pasos == 0){
            return dentro;
        }
        double x = Math.random();
        //System.out.println("x = " + x); (coprobar los randome se gereran correctamente)
        double y = Math.random();
        //System.out.println("y = " + y); (coprobar los randome se gereran correctamente)
        if (((x * x) + (y * y)) <= 1){
            dentro ++;
            //System.out.println("dentro = " + dentro); //(comprobar que el contador sume correctamerte)
        }
        // hacemos la llamada recursiba actuelizando los datos de dentro del codigo
        return conteoPi(pasos -1, dentro);
    }
}

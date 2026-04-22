package es.foc;

/**
 * Clase de arranque de la aplicación.
 *
 * <p>Contiene el método principal desde el que se inicia la ejecución
 * del programa. Su función es crear un objeto de la clase
 * {@link Tarea6EDClase} y lanzar el cálculo del descuento
 * con unos valores de ejemplo.</p>
 *
 * <p>Se utiliza como punto de entrada para comprobar el funcionamiento
 * general del programa y verificar que las operaciones se ejecutan
 * correctamente.</p>
 *
 * @author Juan Alonso
 * @version 1.0

 */
public class Main {

    /**
     * Método principal de ejecución del programa.
     *
     * <p>Crea una instancia de la clase {@link Tarea6EDClase}
     * y llama al método encargado de calcular el total final
     * a partir de un precio y una cantidad de productos.</p>
     *
     * @param args argumentos recibidos desde la línea de comandos.
     *             En este programa no se utilizan.
     */
    public static void main(String[] args) {
        Tarea6EDClase carrito = new Tarea6EDClase();
        carrito.aplicarDescuento(100, 5);
    }
}
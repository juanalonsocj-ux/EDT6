package es.foc;
/**
 * Clase que gestiona el cálculo del importe total a pagar aplicando
 * descuentos en función del número de productos.
 * <p>
 * También muestra por consola el resultado final del pedido.
 * </p>
 *
 * @author juan alonso
 * @version 1.0
 */
public class Tarea6EDClase {

    /** Cantidad mínima de productos para aplicar el descuento fijo. */
    private static final int CANTIDAD_DESCUENTO = 3;

    /** Importe de descuento fijo aplicado al precio del producto. */
    private static final double DESCUENTO = 5;

    /** Porcentaje aplicado cuando el número de productos es distinto de cero. */
    private static final double PORCENTAJE_CON_DESCUENTO = 0.8;

    /** Porcentaje aplicado cuando el número de productos es igual a cero. */
    private static final double PORCENTAJE_SIN_DESCUENTO = 0.95;

    /** Mensaje que indica que el pedido ha sido enviado. */
    private static final String MENSAJE_ENVIO = "Enviado";

    /**
     * Constructor por defecto de la clase.
     */
    public Tarea6EDClase() {
    }

    /**
     * Aplica un descuento al precio del producto según el número de productos
     * introducido y muestra el total a pagar.
     *
     * @param precioProducto precio inicial del producto
     * @param numProductos número de productos introducidos
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double totalPagar;

        if (numProductos > CANTIDAD_DESCUENTO) {
            precioProducto -= DESCUENTO;
        }

        if (numProductos != 0) {
            totalPagar = calcularTotal(precioProducto, PORCENTAJE_CON_DESCUENTO);
        } else {
            totalPagar = calcularTotal(precioProducto, PORCENTAJE_SIN_DESCUENTO);
        }

        mostrarResultado(totalPagar);
    }

    /**
     * Calcula el total a pagar aplicando un porcentaje sobre el precio del producto.
     *
     * @param precioProducto precio del producto sobre el que se aplica el porcentaje
     * @param porcentaje porcentaje que se aplica al precio del producto
     * @return total a pagar tras aplicar el porcentaje indicado
     */
    private double calcularTotal(double precioProducto, double porcentaje) {
        return precioProducto * porcentaje;
    }

    /**
     * Muestra por consola el total a pagar y un mensaje de envío.
     *
     * @param totalPagar importe total final del pedido
     */
    private void mostrarResultado(double totalPagar) {
        System.out.println("El total a pagar es:" + totalPagar);
        System.out.println(MENSAJE_ENVIO);
    }
}

package es.foc;

public class Tarea6EDClase {

    private static final int CANTIDAD_DESCUENTO = 3;
    private static final double DESCUENTO = 5;
    private static final double PORCENTAJE_CON_DESCUENTO = 0.8;
    private static final double PORCENTAJE_SIN_DESCUENTO = 0.95;
    private static final String MENSAJE_ENVIO = "Enviado";

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

    private double calcularTotal(double precioProducto, double porcentaje) {
        return precioProducto * porcentaje;
    }

    private void mostrarResultado(double totalPagar) {
        System.out.println("El total a pagar es:" + totalPagar);
        System.out.println(MENSAJE_ENVIO);
    }
}
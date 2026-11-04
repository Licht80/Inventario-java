public class Inventario {
    public static int calcularSubtotal(int precio, int cantidad) {
        validarParametros(precio, cantidad);

        long resultado = (long) precio * cantidad;
        if (resultado > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("El subtotal excede el rango de int.");
        }

        return (int) resultado;
    }

    public static double calcularSubtotal(double precio, int cantidad) {
        validarParametros(precio, cantidad);
        return precio * cantidad;
    }

    private static void validarParametros(int precio, int cantidad) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
    }

    private static void validarParametros(double precio, int cantidad) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
    }

    public static void main(String[] args) {
        int precio = 50;
        int cantidad = 4;
        int valorTotal = calcularSubtotal(precio, cantidad);
        System.out.println("El valor total del inventario es: " + valorTotal);
    }
}
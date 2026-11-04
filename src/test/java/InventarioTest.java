import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventarioTest {
    @Test
    void calculaSubtotalDeCuatroProductos() {
        int resultado = Inventario.calcularSubtotal(50, 4);
        assertEquals(200, resultado);
    }
}

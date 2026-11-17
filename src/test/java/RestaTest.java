import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {

    @Test
    void restaAsignada120Menos46() {
        assertEquals(74, Resta.restar(120, 46));
    }

    @Test
    void restaAdicional10Menos3() {
        assertEquals(7, Resta.restar(10, 3));
    }
}

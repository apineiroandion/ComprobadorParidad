import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testValidador {
    @Test
    public void testEsParTrueResturnTrue() {
        Assertions.assertTrue(Validador.esPar(2));
    }
    @Test
    public void testEsParFalseReturnTrue() {
        Assertions.assertFalse(Validador.esPar(3));
    }
}

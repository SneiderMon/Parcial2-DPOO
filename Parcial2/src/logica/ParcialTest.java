package logica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class ParcialTest {

	
    private Parcial parcial =new Parcial() ;

    @Test
    public void testACero() { assertThrows(IllegalArgumentException.class, () -> parcial.calcularFormulaCuadratica( 0,2, 1));
    }

    @Test
    public void testDiscriminanteNegativo() {
        assertThrows(IllegalArgumentException.class, () -> parcial.calcularFormulaCuadratica(1,1,1));
    }
    @Test
    public void testRaicesReales() { assertEquals("3.0,2.0", parcial.calcularFormulaCuadratica(1,-5,6));
    }
    @Test
    public void testRaizUnica() { assertEquals("1.0,1.0", parcial.calcularFormulaCuadratica(1,-2,1));  }
}
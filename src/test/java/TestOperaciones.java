import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOperaciones {

    @Test
    public void sumarPositivos() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        assertEquals(15, context.procesar(5, 10));
    }

    @Test
    public void ResteMayorAMenor() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        assertEquals(1, context.procesar(21, 20));
    }

    @Test
    public void multiplicacionPositivos() {
        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
        assertEquals(20, context.procesar(5, 4));
    }

    @Test
    public void sumarNegativos() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        assertEquals(-15, context.procesar(-5, -10));
    }
}

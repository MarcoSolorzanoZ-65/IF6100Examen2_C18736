import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOperaciones {

    @Test
    public void sumarPositivos() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        assertEquals(15, context.procesar(5, 10));
        assertNotEquals(16, context.procesar(5, 10));
    }

    @Test
    public void ResteMayorAMenor() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        assertEquals(1, context.procesar(21, 20));
        assertNotEquals(2, context.procesar(21, 20));
    }

    @Test
    public void multiplicacionPositivos() {
        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
        assertEquals(20, context.procesar(5, 4));
        assertNotEquals(21, context.procesar(5, 4));
    }

    @Test
    public void DivisionPositivos() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        assertEquals(5, context.procesar(10, 2));
        assertNotEquals(6, context.procesar(10, 2));
    }

    @Test
    public void sumarNegativos() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        assertEquals(-1, context.procesar(-5, -10));
        assertNotEquals(-15, context.procesar(-5, -10));
    }

    @Test
    public void ResteMenorAMayor() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        assertEquals(-2, context.procesar(20, 21));
        assertNotEquals(-1, context.procesar(20, 21));
    }

    @Test
    public void multiplicacionNegativos() {
        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
        assertEquals(-1, context.procesar(-5, -4));
        assertNotEquals(-20, context.procesar(-5, -4));
    }

    @Test
    public void DivisionPorCero() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        assertEquals(-3, context.procesar(10, 0));
        assertNotEquals(-1, context.procesar(10, 0));
    }
}
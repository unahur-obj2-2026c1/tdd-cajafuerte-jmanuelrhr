package ar.edu.unahur.obj2.tdd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {

    // 1. Instancia de una caja fuerte
    CajaFuerte caja = new CajaFuerte();

    // 2. compruebo si al crearse la caja fuerte esta abierta
    @Test
    public void laCajaFuerteEstaAbiertaAlCrearse() {
        assertTrue(caja.estaAbierta());
    }

    // 3. compruebo si al asignarle un codigo a la caja fuerte esta cerrada
    @Test
    public void laCajaFuerteEstaCerradaAlAsignarleUnCodigo() {
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
    }

    // 4. compruebo si al ingresar el codigo correcto la caja fuerte se abre
    @Test
    public void laCajaFuerteSeAbreAlIngresarElCodigoCorrecto() {
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }

    // 5. compruebo si al ingresar el codigo incorrecto la caja fuerte se mantiene cerrada
    @Test
    public void laCajaFuerteSeMantieneCerradaAlIngresarUnCodigoIncorrecto() {
        caja.cerrar(1234);
        caja.abrir(2345);
        assertFalse(caja.estaAbierta());
    }

    // 6. compruebo que al tratar de reasignarle un codigo a la caja fuerte esta no se puede abrir y permanece cerrada
    @Test
    public void laCajaFuerteNoSePuedeAbrirAlTratarDeReasignarleUnCodigo() {
        CajaFuerte caja2 = new CajaFuerte();

        caja2.cerrar(1234);
        caja2.cerrar(4321);
        caja2.abrir(4321);
        assertFalse(caja2.estaAbierta());
    }
}
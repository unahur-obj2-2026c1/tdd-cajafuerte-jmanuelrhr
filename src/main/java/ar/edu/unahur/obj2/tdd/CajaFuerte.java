package ar.edu.unahur.obj2.tdd;

/*

    Criterios de aceptación:

   1. caja abierta al inicio
      - recien creada la caja debe estar abierta

   2. cierre de la caja con un codigo
      - como la caja esta abierta
        cuando se le asigna un codigo al cerrarla
        entonces esta debe quedar cerrada

   3. apertura de la caja con el codigo correcto
      - como la caja esta cerrada con un codigo
        cuando se le ingresa el codigo correcto 
        coincidiendo con el ultimo codigo 
        asignado al cerrarla, esta debe abrirse
        y quedar abierta

   4. no se abre la caja con el codigo incorrecto
      - como la caja esta cerrada con un codigo
        cuando se le ingresa un codigo incorrecto 
        distinto al ultimo codigo asignado al cerrarla, esta no debe abrirse
        y debe permanecer cerrada

    6. la caja fuerte se bloquea tras 3 intentos fallidos de apertura
      - como la caja esta cerrada con un codigo
        cuando se le ingresa un codigo incorrecto por tercera vez consecutiva, 
        esta debe bloquearse y no debe abrirse aunque se 
        ingrese el codigo correcto posteriormente
        (reiniciar contador de intentos)
   
   */

public class CajaFuerte {

    private Integer codigo = null;

    public Boolean estaAbierta() {
        return codigo == null;
    }

    public void cerrar(Integer codigo) {
        if (this.estaAbierta() && this.estaAbierta()) {
            this.codigo = codigo;
        }
    }

    public void abrir(Integer codigo) {
        if (this.codigo.equals(codigo) && !this.estaAbierta()) {
            this.codigo = null;
        }
    }

}

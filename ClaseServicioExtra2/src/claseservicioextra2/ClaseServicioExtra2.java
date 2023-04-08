
package claseservicioextra2;

import Entidad.NIF;
import Service.NIFService;

public class ClaseServicioExtra2 {

    public static void main(String[] args) {
       NIFService nifservice =new NIFService();
       NIF nif =new NIF();
       
       nifservice.crearNif(nif);
       nifservice.calcularLetra(nif);
       nifservice.mostrar(nif);
    }
    
}

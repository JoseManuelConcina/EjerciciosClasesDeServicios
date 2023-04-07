package paqueteDeServicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Cafetera cafe1 = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera(Cafetera cafe1) {
        int lleno = 100;
        cafe1.setCapacidadMaxima(lleno);
        cafe1.setCapacidaAcual(cafe1.getCapacidadMaxima());
        System.out.println("La cafetera se encuentra : "+cafe1.getCapacidaAcual());
        return cafe1;
    }
    
    public int servirTaza(Cafetera cafe1) {
        int tamañoTaza = 0;
        int restaCantidad = 0;
        System.out.println("Ingrese el tamañode la taza : ");
        tamañoTaza = leer.nextInt();
        if (tamañoTaza <= cafe1.getCapacidaAcual()) {
            System.out.println("Usted se sirvio una taza completa de cafe .");
            restaCantidad = cafe1.getCapacidaAcual() - tamañoTaza;
            cafe1.setCapacidaAcual(restaCantidad);
            System.out.println("El cafe que queda en la cafetera es:" + restaCantidad);
        }
        if (tamañoTaza > cafe1.getCapacidaAcual()) {
            restaCantidad = cafe1.getCapacidaAcual() - tamañoTaza;
            System.out.println("a usted le falto el " + restaCantidad + " para completar su taza");
        }
        return tamañoTaza;
    }
    
    public void vaciarCafetera(Cafetera cafe1) {
        cafe1.setCapacidaAcual(0);
        System.out.println("La cafetera se ha vaciado su cantidad actual es de : "+cafe1.getCapacidaAcual());
    }
    public int agregarCafe(Cafetera cafe1){
        int agregar=0;
        int total=0;
        System.out.println("Ingrese la cantidad de cafe que dea agregar:");
        agregar=leer.nextInt();
        total=cafe1.getCapacidaAcual()+agregar;
        cafe1.setCapacidaAcual(total);
        return total;
    }
}

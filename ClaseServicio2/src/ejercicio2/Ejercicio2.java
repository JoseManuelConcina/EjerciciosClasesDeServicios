package ejercicio2;

import Entidades.Cafetera;
import java.util.Scanner;
import paqueteDeServicio.CafeteraServicio;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs1 = new CafeteraServicio();
        Cafetera cafe1 = new Cafetera();

        int opcion;
        do {
            System.out.println("Ingrese la opcion correcta:");
            System.out.println(" 1- Llenar cafetera.");
            System.out.println(" 2- Servir cafe.");
            System.out.println(" 3- Vaciar la Cafetera");
            System.out.println(" 4- Agregar Cafe. ");
            System.out.println(" 0 - Salir");
             opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cs1.llenarCafetera(cafe1);
                    break;
                case 2:
                   cs1.servirTaza(cafe1);
                    break;
                case 3:
                    cs1.vaciarCafetera(cafe1);
                    break;
                case 4:
                   cs1.agregarCafe(cafe1);
                    break;
               
            }

        } while (opcion != 0);

    }

}

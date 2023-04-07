package clasesservicions;

import Servicios.cuentaBancariaServicio;
import entidad.CuentaBancaria;
import java.util.Scanner;

public class ClasesServicions {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cuentaBancariaServicio cbs1 = new cuentaBancariaServicio();
        CuentaBancaria cb1 = new CuentaBancaria();
        int opcion=0;
        System.out.println("Bienvenido al Banco Privado. ");
        System.out.println("-------------------------------------------");
        cbs1.crearCuenta(cb1);
         do {
        System.out.println(" 1- Ingresar dinero.");
        System.out.println(" 2- Retirar dinero.");
        System.out.println(" 3- Extraccion rapida de dinero.");
        System.out.println(" 4- Ver Saldo Acutual.");
        System.out.println(" 5- ver los datos.");
        System.out.println(" 0 - Salir.");
               
            System.out.println("Ingrese la opcion que desea:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cbs1.ingresar(cb1);
                    break;
                case 2:
                    cbs1.retirar(cb1);
                    break;
                case 3:
                    cbs1.extracionRapida(cb1);
                    break;
                case 4:
                    cbs1.consultarSaldo(cb1);
                    break;
                case 5:
                    cbs1.consultarDatos(cb1);
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta:");

            }
        } while (opcion != 0);
    }

}



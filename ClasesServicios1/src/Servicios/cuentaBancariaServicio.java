package Servicios;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class cuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    CuentaBancaria cb1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta(CuentaBancaria cb1) {

        System.out.println("Ingrese su numero de cuenta");
        cb1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI: ");
        cb1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su Saldo:");
        cb1.setSaldoActual(leer.nextDouble());

        return cb1;
    }

    public double ingresar(CuentaBancaria cb1) {
        System.out.println("Escriba el monto de dinero a ingresar:");
        double ingreso = leer.nextDouble();
        double ingresado = cb1.getSaldoActual() + ingreso;
        System.out.println("El dinero total en su cuenta es de :" + ingresado);
        cb1.setSaldoActual(ingresado);
        return ingresado;
    }

    public double retirar(CuentaBancaria cb1) {
        System.out.println("Escriba el monto de dinero a retirar:");
        double retiro = leer.nextDouble();
        if (retiro < cb1.getSaldoActual()) {
            double retirado = cb1.getSaldoActual() - retiro;
            System.out.println("El dinero total en su cuenta es de :" + retirado);
            cb1.setSaldoActual(retirado);
        } else {
            System.out.println("Su saldo es insuficiente . ");
        }
        return cb1.getSaldoActual();
    }

    public void extracionRapida(CuentaBancaria cb1) {
        double extracion = 0, resto = 0;
        System.out.println("Usted podra retirar solo el 20 % de su saldo: " + ((cb1.getSaldoActual() * 0.20)));
        System.out.println("Ingrese el monto a extraer : ");
        extracion = leer.nextDouble();
        if (extracion <= (cb1.getSaldoActual() * 0.20)) {
            System.out.println("Se aprueba el retiro de : " + extracion);
            resto = cb1.getSaldoActual() - extracion;
            cb1.setSaldoActual(resto);
        } else {
            System.out.println("El monto es mayor a lo autorizado ingrese un monto menor o igual a : " + ((cb1.getSaldoActual() * 0.20)));
        }
    }

    public void consultarSaldo(CuentaBancaria cb1) {
        System.out.println("Su Saldo Actual es de : " + cb1.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cb1) {
        System.out.println("Su Saldo Actual es de : " + cb1.getSaldoActual());
        System.out.println("Su numero de cuenta es : " + cb1.getNumeroCuenta());
        System.out.println("Su numero de DNI es : " + cb1.getDniCliente());
    }
}

package Servicios;

import Entidad.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona p1) {
        if (p1.getEdad() >= 18) {
            System.out.println("La persona " + p1.getNombre() + "es mayor de edad");
        }
        return true;
    }

    public Persona crearPersona() {
        Persona p1 = new Persona();
        p1.setNombre(JOptionPane.showInputDialog("Ingrese el Nombre de la persona:"));
        p1.setDni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona : ")));
        p1.setDni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI de la persona : ")));
        p1.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona : ")));
        p1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura de la persona : ")));

        System.out.print("Ingrese el sexo (H, M, O): ");
        char sexo = leer.next().charAt(0);

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto. Inténtelo de nuevo.");
            System.out.print("Ingrese el sexo (H, M, O): ");
            sexo = leer.next().charAt(0);
        }
        p1.setSexo(sexo);

        return p1;
    }

    public int calcularIMC(Persona p1) {
        double alturaEnMetros = p1.getAltura() / 100.0; // Convertir altura de cm a m
        double imc = p1.getPeso() / (alturaEnMetros * alturaEnMetros);

        if (imc < 20) {
            return -1; // persona está por debajo de su peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // persona está en su peso ideal
        } else {
            return 1; // persona tiene sobrepeso
        }
    }

    public int[] calcularIMCPersonas(Persona[] personas) {
        int[] resultadoIMC = new int[3]; // [0]: por debajo del peso ideal, [1]: en el peso ideal, [2]: con sobrepeso
        for (Persona persona : personas) {
            int resultado = calcularIMC(persona);
            switch (resultado) {
                case -1:
                    resultadoIMC[0]++;
                    break;
                case 0:
                    resultadoIMC[1]++;
                    break;
                default:
                    resultadoIMC[2]++;
                    break;
            }
        }

        return resultadoIMC;
    }

    public double[] calcularPorcentajeIMC(int[] resultadoIMC) {
        double[] porcentajeIMC = new double[3];

        int totalPersonas = resultadoIMC[0] + resultadoIMC[1] + resultadoIMC[2];

        porcentajeIMC[0] = ((double) resultadoIMC[0] / totalPersonas) * 100.0;
        porcentajeIMC[1] = ((double) resultadoIMC[1] / totalPersonas) * 100.0;
        porcentajeIMC[2] = ((double) resultadoIMC[2] / totalPersonas) * 100.0;

        return porcentajeIMC;
    }

    public double calcularPorcentajeMayoresDeEdad(Persona[] personas) {
        int totalPersonas = personas.length;
        int contadorMayoresDeEdad = 0;

        for (Persona persona : personas) {
            if (esMayorDeEdad(persona)) {
                contadorMayoresDeEdad++;
            }
        }

        return ((double) contadorMayoresDeEdad / totalPersonas) * 100.0;
    }
}

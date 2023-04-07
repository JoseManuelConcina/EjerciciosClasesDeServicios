package raicesServivcio;

import entidad.Raices;

public class RaicesServicio {

    double resultado;
    boolean bandera1 = false;
    boolean bandera2 = false;
    double solucionA;
    double solucionB;
    double solucionC;

    public double getDiscriminante(Raices raiz) {
        resultado = (Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()));
        System.out.println("El valor del discriminante es :" + resultado);
        return resultado;
    }

    public boolean tieneRaices(Raices raiz) {
        if (resultado >= 0) {
            bandera1 = true;
            System.out.println("Tiene Raices: " + bandera1);
        }else{
            System.out.println("Tiene Raices: "+bandera1);
        }
        return bandera1;
    }

    public boolean tieneRaiz(Raices raiz) {
        if (resultado == 0) {
            bandera2 = true;
            System.out.println("Tiene Raiz: " + bandera2);
        } else {
            System.out.println("Tiene Raiz: "+bandera2);
            
        }
        return bandera2;
    }

    public void obtenerRaices(boolean tieneRaices, Raices raiz) {
        if (tieneRaices= true) {
            solucionA = (-raiz.getB() + (Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA()));
            solucionB = (-raiz.getB() - (Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA()));
            System.out.println("Los resultados de las dos soluciones son : " + solucionA + " y " + solucionB);
        }
    }

    public void obtenerRaiz(boolean tieneRaiz, Raices raiz) {

        if (tieneRaiz = true) {
            solucionC = (-raiz.getB() + (Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA()));
            System.out.println("El resultado de la unica solucion es : " + solucionC);
        }

    }

    public void calcular(boolean tieneRaices, boolean tieneRaiz) {
        if ((tieneRaices = false) && (tieneRaiz = false)) {
            System.out.println("La ecuacion no posee solucion .");
        } else {
            System.out.println("Los resultados de las dos soluciones son : " + solucionA + " y " + solucionB);
            System.out.println("El resultado de la unica solucion es : " + solucionC);
        }
    }
}

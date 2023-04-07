
package claseservicio3;

import Entidad.Persona;
import Servicios.PersonaServicio;

public class ClaseServicio3 {

    public static void main(String[] args) {
       PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = new Persona("Laura", 30 ,'O', 70, 160, 238445338);
        Persona p4 = new Persona("Tana", 24 ,'M', 87, 155, 244445848);
        
           Persona[] personas = {p1, p2, p3,p4};

        for (int i = 0; i < personas.length; i++) {
            Persona persona = personas[i];

            System.out.println("Persona " + (i + 1) + ": " + persona.getNombre());
            System.out.println("Es mayor de edad: " + ps.esMayorDeEdad(persona));

            int resultadoIMC = ps.calcularIMC(persona);

            switch (resultadoIMC) {
                case -1:
                    System.out.println("Está por debajo de su peso ideal");
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    break;
                default:
                    System.out.println("Tiene sobrepeso");
                    break;
            }

            System.out.println("-----------------------------------");
        }
    }
}

        
        
    
    
    


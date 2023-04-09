package Service;

import Entidad.NIF;
import javax.swing.JOptionPane;

public class NIFService {

    int resto = 0;
    char letra;
    char opcion;

    public void crearNif(NIF nif) {

        nif.setDNI(Long.parseLong(JOptionPane.showInputDialog("Ingrese el DNI de la persona:")));
        resto = (Math.toIntExact(nif.getDNI() % 23));

    }

    public NIF calcularLetra(NIF nif) {

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        for (int i = 0; i < 22; i++) {
            letras[i] = letras[resto];
            letra = letras[resto];

        }

        nif.setLetra(letra);

        return nif;
    }

    public void mostrar(NIF nif) {
        JOptionPane.showMessageDialog(null, "El resto es : " + resto + " y la letra es : " + letra);
        JOptionPane.showMessageDialog(null, "El NIF de la persona es: " + nif.getDNI() + " - " + nif.getLetra());

    }

}

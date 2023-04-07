package claseservivioextra1;

import entidad.Raices;
import raicesServivcio.RaicesServicio;

public class ClaseServivioExtra1 {

    public static void main(String[] args) {
        Raices raiz = new Raices(-3, 2, 1);
        RaicesServicio rs = new RaicesServicio();
        rs.getDiscriminante(raiz);
        System.out.println("----------------------------------------------------");
        rs.tieneRaices(raiz);
        System.out.println("----------------------------------------------------");
        rs.tieneRaiz(raiz);
        System.out.println("----------------------------------------------------");
        rs.obtenerRaices(rs.tieneRaices(raiz), raiz);
        System.out.println("----------------------------------------------------");
        rs.obtenerRaiz(rs.tieneRaiz(raiz), raiz);
        System.out.println("-----------------------------------------------------");
        rs.calcular(rs.tieneRaices(raiz),rs.tieneRaiz(raiz));
   } 

}

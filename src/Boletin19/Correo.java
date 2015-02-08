/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Correo {

    private String contenido;
    private boolean leido = false;

    public Correo() {

    }

    public Correo(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public ArrayList<Correo> listaCorreos = new ArrayList<Correo>();

    public int numeroCorreos() {
        int contador = 0;
        for (Correo i : listaCorreos) {
            contador++;
        }
        System.out.println("Hay " + contador + "correos.");
        return contador;
    }

    public void añadir(Correo c) {
        listaCorreos.add(c);
    }

    public boolean porLeer() {
        int noLeido = 0, siLeido = 0;
        for (Correo i : listaCorreos) {
            if (listaCorreos.contains(i.leido) == true) {
                siLeido++;
            } else {
                noLeido++;
            }
        }
        System.out.println("Quedan " + noLeido + " por leer.");
        return true;
    }

    public String mostrarPrimerNoLeido() {

        for (Correo i : listaCorreos) {
            if (listaCorreos.contains(this.leido) == false) {
                break;
            }
            System.out.println(i.contenido);
        }
        return null;
    }

    public String mostrar(int k) {
        k = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del mensaje que quieres leer."));
        return listaCorreos.get(k).contenido;
    }

    public void eliminar(int k) {
        k = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del mensaje que quieres eliminar."));
        listaCorreos.remove(k);
    }

}

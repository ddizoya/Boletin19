/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin19;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 */
public class Buzon {

    public ArrayList<Correo> listaCorreos = new ArrayList<Correo>();
    
    //Iterator it = listaCorreos.iterator();
     
    
        public void menu() {
        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("\"***** MENU ***** \\n\"\n"
                    + "1 --> Añadir. \n"
                    + "2 --> Eliminar.\n"
                    + "3 --> Mostrar. \n"
                    + "4 --> Primer no leído. \n"
                    + "5 --> Número de correos. \n"
                    + "6 --> Salir "));

            switch (option) {
                case 1:
                    añadir();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    mostrarPrimerNoLeido();
                    break;
                case 5:
                    numeroCorreos();
                    break;
                case 6:
                    porLeer();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
            }
        } while (option != 7);
    }


    public int numeroCorreos() {

        System.out.println("Hay " + listaCorreos.size() + "correos.");
        return listaCorreos.size();
    }

    public void añadir() {
        Correo y = new Correo();
        y.setContenido(JOptionPane.showInputDialog("Introduce el contenido: "));
        String resp = JOptionPane.showInputDialog("¿Leído? S/N ");
        if (resp.equalsIgnoreCase("s"))
            y.setLeido(true);
            else
            y.setLeido(false);
        listaCorreos.add(y);
    }

    public boolean porLeer() {
        int noLeido = 0, siLeido = 0;
        for (Correo i : listaCorreos) {
            if (i.getLeido() == true) {
                siLeido++;
            } else {
                noLeido++;
            }
        }
        System.out.println("Quedan " + noLeido + " por leer.");
        return true;
    }

    public String mostrarPrimerNoLeido() {
        int contador = 0;
        for (Correo i : listaCorreos) {
            
            if (i.getLeido() == false) {
                JOptionPane.showMessageDialog(null,"Mensaje no leído en la posición "+ i.getContenido());
                break;
            } 
            
            System.out.println(i.getContenido());
        }
        return null;
    }

    public String mostrar() {
        int k = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del mensaje que quieres leer."));
        return listaCorreos.get(k).getContenido();
    }

    public void eliminar() {
        int k = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del mensaje que quieres eliminar."));
        listaCorreos.remove(k);
    }
}

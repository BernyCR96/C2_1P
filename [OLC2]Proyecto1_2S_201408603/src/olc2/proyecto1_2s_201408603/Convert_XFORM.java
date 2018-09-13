/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc2.proyecto1_2s_201408603;

import olc2.JAVACC.*;

/**
 *
 * @author Cardona
 */
public class Convert_XFORM {

    public Convert_XFORM() {
    }

    public String Convertidor(Nodo raiz) {
        String cadena = "";
        //System.out.println("cadena: " + cadena_dot);
        for (Nodo hijo : raiz.getListaHojas()) {
            if (hijo != null) {
                switch (hijo.getNombre().trim()) {
                    case "GRUPO_PADRE":
                        cadena += "empieza un grupo " + hijo.getValor() + "\n";
                        for (Nodo hijo_grupo : hijo.getListaHojas()) {
                            switch (hijo_grupo.getNombre().trim()) {
                                case "L_ENCABEZADO":
                                    cadena += "empieza un pregunta" + "\n";
                                    cadena += Convertidor(hijo_grupo);
                                    cadena += "termina preguna " + "\n\n";
                                    break;
                                case "CICLO":
                                    cadena += "empieza un ciclo dentro de grupo" + "\n";
                                    cadena += Convertidor(hijo_grupo);
                                    cadena += "termina ciclo dentro de grupo " + "\n\n";
                                    break;
                            }

                        }
                        cadena += "finaliza grupo" + hijo.getValor() + "\n\n";
                        break;

                    case "L_ENCABEZADO":
                        cadena += "empieza un lista_encabezado " + hijo.getValor() + "\n";
                        for (Nodo hijo_enca : hijo.getListaHojas()) {

                            cadena += hijo_enca.getNombre() + " " + hijo_enca.getValor() + "\n";

                        }
                        cadena += "finaliza lista_encabezado " + hijo.getValor() + "\n\n";
                        break;

                    case "CICLO":
                        cadena += "empieza un ciclo " + hijo.getValor() + "\n";
                        for (Nodo hijo_grupo : hijo.getListaHojas()) {

                            cadena += Convertidor(hijo_grupo);

                        }
                        cadena += "finaliza ciclo" + hijo.getValor() + "\n\n";
                        break;

                    case "L_OPCION":
                        cadena += "empieza un L_opcion " + hijo.getValor() + "\n";
                        for (Nodo hijo_grupo : hijo.getListaHojas()) {

                             cadena += hijo_grupo.getNombre() + " " + hijo_grupo.getValor() + "\n";

                        }
                        cadena += "finaliza L_opcion " + hijo.getValor() + "\n\n";
                        break;
                    case "L_CONFIG":
                        cadena += "empieza un L_config" + hijo.getValor() + "\n";
                        for (Nodo hijo_grupo : hijo.getListaHojas()) {

                             cadena += hijo_grupo.getNombre() + " " + hijo_grupo.getValor() + "\n";

                        }
                        cadena += "finaliza L_config" + hijo.getValor() + "\n\n";

                        break;
                    default:
                        cadena += hijo.getNombre() + " " + hijo.getValor() + "\n";
                        break;
                }

            }

        }

        return cadena;
    }
}

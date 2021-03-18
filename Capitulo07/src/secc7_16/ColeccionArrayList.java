/**
 * ColeccionArrayList.java
 * Creation Date: 17 mar 2021, 20:29:36
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_16;

import java.util.ArrayList;

/**
 * clase arraylist
 */

public class ColeccionArrayList {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    ArrayList<String> elementos = new ArrayList<>();

    elementos.add("rojo");
    elementos.add(0, "amarillo");

    System.out.print("Mostrar contaniedo de la lista ");
    for (int i = 0; i < elementos.size(); i++) {
      System.out.printf(" %s ", elementos.get(i));
    }

    mostrar(elementos, "Mostrar elementos con un foreach");

    elementos.add("verde");
    elementos.add("amarillo");
    mostrar(elementos, "Lista con dos nuevos elementos");

    elementos.remove("amarillo");
    mostrar(elementos, "Eliminar primera instancia de amarillo");

    elementos.remove(1);
    mostrar(elementos, "Eliminar segundo elemento de la lista(verde)");

    System.out.printf("\"rojo\" %s esta en la lista %n ",
      elementos.contains("rojo") ? "" : "no");

    System.out.println("Tamaño " + elementos.size());

  }

  /**
   * Muestra un array list
   * @param elementos
   * @param encabezado
   */
  public static void mostrar(ArrayList<String> elementos, String encabezado) {
    System.out.print(encabezado);

    for (String string : elementos) {
      System.out.printf("%s", string);
    }

    System.out.println();
  }
}

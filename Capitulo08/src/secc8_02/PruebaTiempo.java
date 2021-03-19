/**
 * PruebaTiempo.java
 * Creation Date: 18 mar 2021, 15:17:11
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_02;

/**
 * Prueba de clase tiempo
 */

public class PruebaTiempo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    Tiempo1 tiempo = new Tiempo1();

    mostrarTiempo("Despues de crear el objeto tiempo ", tiempo);
    System.out.println();

    tiempo.setTiempo(13, 27, 6);
    mostrarTiempo("Despues de llamar a setTiempo", tiempo);
    System.out.println();

    try {
      tiempo.setTiempo(99, 99, 99);
    } catch (IllegalArgumentException e) {
      System.out.printf("Exception: %s%n%n", e.getMessage());
    }

    mostrarTiempo("Despues de llamar a setTiempo con valores invalidos", tiempo);
  }

  /**
   * Muestra el tiempo
   * @param encabezado
   * @param t
   */
  private static void mostrarTiempo(String encabezado, Tiempo1 t) {
    System.out.printf("%s%nTiempo universal: %s%nTiempo estandar: %s%n", encabezado,
      t.toStringUniversal(), t.toString());
  }
}

/**
 * EncuestaEstudiantes.java
 * Creation Date: 16 mar 2021, 15:21:21
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_04;

/**
 * analisis de una encuesta
 */

public class EncuestaEstudiantes {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int[] respuesta = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
    int[] frecuencia = new int[6];

    for (int i = 0; i < respuesta.length; i++) {
      try {
        ++frecuencia[respuesta[i]];
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
        System.out.printf(" respuesta[%d] = %d%n%n", i, respuesta[i]);
      }
    }

    System.out.printf("%s%10s%n", "Calificacion", "Frecuencia");
    for (int i = 0; i < frecuencia.length; i++) {
      System.out.printf("%6d%10d%n", i, frecuencia[i]);
    }

  }
}

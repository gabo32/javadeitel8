/**
 * GraficoBarras.java
 * Creation Date: 16 mar 2021, 15:09:22
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
 * Grafico de barras
 */

public class GraficoBarras {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int[] arreglo = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

    System.out.println("Distribucion de calificaciones: ");

    for (int i = 0; i < arreglo.length; i++) {
      if (i == 10) {
        System.out.printf("%5d", 100);
      } else {
        System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
      }

      for (int j = 0; j < arreglo[i]; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}

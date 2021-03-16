/**
 * InicArreglo.java
 * Creation Date: 16 mar 2021, 16:48:11
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_11;

/**
 * Arreglo multidimensional
 */

public class InicArreglo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int[][] arreglo1 = { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] arreglo2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

    System.out.println("Los valores en arreglo1 por filas son: \n");
    imprimirArreglo(arreglo1);

    System.out.println("\nLos valores en arreglo2 son: \n");
    imprimirArreglo(arreglo2);
  }

  /**
   * Imprime arreglo
   * @param arreglo
   */
  public static void imprimirArreglo(int[][] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      for (int j = 0; j < arreglo[i].length; j++) {
        System.out.printf("%d  ", arreglo[i][j]);
      }
      System.out.println();
    }
  }
}

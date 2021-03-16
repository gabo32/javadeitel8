/**
 * InicArreglo2.java
 * Creation Date: 16 mar 2021, 15:02:55
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
 * arreglos
 */

public class InicArreglo2 {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    final int LONGITUD_ARREGLO = 10;
    int[] arreglo = new int[LONGITUD_ARREGLO];

    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = 2 + 2 * i;
    }

    System.out.printf("%s%8s%n", "indice", "valor");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.printf("%5d%8d%n", i, arreglo[i]);
    }
  }
}

/**
 * InicArreglo.java
 * Creation Date: 16 mar 2021, 14:30:43
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
 * Inicializacion de elementos en un arreglo
 */

public class InicArreglo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int[] arreglo = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

    System.out.printf("%s%8s%n", "indice", "valor");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.printf("%5d%8d%n", i, arreglo[i]);
    }
  }
}

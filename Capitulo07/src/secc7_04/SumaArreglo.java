/**
 * SumaArreglo.java
 * Creation Date: 16 mar 2021, 15:06:14
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
 * suma de arreglos
 */

public class SumaArreglo {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int[] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

    int total = 0;

    for (int i = 0; i < arreglo.length; i++) {
      total += arreglo[i];
    }

    System.out.println("Total de elementos de arreglo: " + total);
  }
}

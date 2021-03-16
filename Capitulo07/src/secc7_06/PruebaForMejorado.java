/**
 * PruebaForMejorado.java
 * Creation Date: 16 mar 2021, 15:48:00
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_06;

/**
 * foreach
 */

public class PruebaForMejorado {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int[] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
    int total = 0;

    for (int i : arreglo) {
      total += i;
    }

    System.out.println("Total es: " + total);
  }
}

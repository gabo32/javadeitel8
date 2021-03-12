/**
 * Suma.java
 * Creation Date: 11 mar 2021, 16:30:24
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_5;

/**
 * sumar
 */

public class Suma {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int total = 0;

    for (int numero = 2; numero <= 20; numero += 2) {
      total += numero;
    }

    System.out.printf("La suma es %d ", total);
  }
}

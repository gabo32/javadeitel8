/**
 * PruebaDoWhile.java
 * Creation Date: 11 mar 2021, 16:44:45
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_7;

/**
 * prueba de do while
 */

public class PruebaDoWhile {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int contador = 1;

    do {
      System.out.printf("%d ", contador);
      ++contador;
    } while (contador <= 10);

    System.out.println();
  }
}

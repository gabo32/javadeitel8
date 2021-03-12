/**
 * ContadorWhile.java
 * Creation Date: 11 mar 2021, 16:05:53
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_1;

/**
 * contador
 */

public class ContadorWhile {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int contador = 1;

    while (contador <= 10) {
      System.out.printf("%d ", contador);
      ++contador;
    }
    System.out.println();
  }
}

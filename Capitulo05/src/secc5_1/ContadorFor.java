/**
 * ContadorFor.java
 * Creation Date: 11 mar 2021, 16:08:51
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
 * contador con for
 */

public class ContadorFor {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    for (int contador = 1; contador <= 10; contador++) {
      System.out.printf("%d ", contador);
    }
    System.out.println();
  }
}

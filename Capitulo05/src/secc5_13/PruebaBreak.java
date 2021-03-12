/**
 * PruebaBreak.java
 * Creation Date: 11 mar 2021, 17:19:39
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_13;

/**
 * prueba break
 */

public class PruebaBreak {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int cuenta;
    for (cuenta = 1; cuenta <= 10; cuenta++) {

      if (cuenta == 5) {
        break;
      }

      System.out.printf("%d ", cuenta);
    }

    System.out.printf("%nSalio del ciclo en cuenta = %d%n", cuenta);
  }
}

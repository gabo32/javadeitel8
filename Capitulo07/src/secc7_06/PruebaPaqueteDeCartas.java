/**
 * PruebaPaqueteDeCartas.java
 * Creation Date: 16 mar 2021, 15:43:59
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
 * prueba barajar y repartir
 */

public class PruebaPaqueteDeCartas {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
    miPaqueteDeCartas.barajar();

    for (int i = 1; i <= 52; i++) {
      System.out.printf("%-19s", miPaqueteDeCartas.repartirCarta());
      if (i % 4 == 0) {
        System.out.println();
      }

    }
  }
}

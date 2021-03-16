/**
 * EnterosAleatorios.java
 * Creation Date: 12 mar 2021, 23:13:44
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc6_06;

import java.security.SecureRandom;

/**
 * Generacion de numeros aleatorios
 */

public class EnterosAleatorios {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    SecureRandom numerosAleatorios = new SecureRandom();

    for (int contador = 1; contador <= 20; contador++) {
      int cara = 1 + numerosAleatorios.nextInt(6);

      System.out.printf("%d ", cara);

      if (contador % 5 == 0) {
        System.out.println();
      }
    }
  }
}

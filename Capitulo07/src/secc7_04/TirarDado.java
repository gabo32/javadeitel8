/**
 * TirarDado.java
 * Creation Date: 16 mar 2021, 15:15:34
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_04;

import java.security.SecureRandom;

/**
 * Tira un dado 6 millones de veces
 */

public class TirarDado {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    SecureRandom aleatorios = new SecureRandom();
    int[] frecuencia = new int[7];

    for (int i = 0; i < 6000000; i++) {
      ++frecuencia[1 + aleatorios.nextInt(6)];
    }

    System.out.printf("%s%10s%n", "cara", "frecuencia");

    for (int i = 1; i < frecuencia.length; i++) {
      System.out.printf("%4d%10d%n", i, frecuencia[i]);
    }
  }
}

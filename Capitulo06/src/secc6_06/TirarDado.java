/**
 * TirarDado.java
 * Creation Date: 12 mar 2021, 23:16:36
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
 * tirar un dado 6 millones de veces
 */

public class TirarDado {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    SecureRandom numerosAleatorios = new SecureRandom();

    int frecuencia1 = 0;
    int frecuencia2 = 0;
    int frecuencia3 = 0;
    int frecuencia4 = 0;
    int frecuencia5 = 0;
    int frecuencia6 = 0;

    for (int tiro = 1; tiro <= 60000000; tiro++) {

      int cara = 1 + numerosAleatorios.nextInt(6);

      switch (cara) {
        case 1:
          ++frecuencia1;
          break;
        case 2:
          ++frecuencia2;
          break;
        case 3:
          ++frecuencia3;
          break;
        case 4:
          ++frecuencia4;
          break;
        case 5:
          ++frecuencia5;
          break;
        case 6:
          ++frecuencia6;
          break;
        default:
          break;
      }
    }

    System.out.println("Cara \tFrecuencia");
    System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frecuencia1,
      frecuencia2, frecuencia3, frecuencia4, frecuencia5, frecuencia6);
  }
}

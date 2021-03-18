/**
 * PruebaVarargs.java
 * Creation Date: 17 mar 2021, 19:52:56
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_13;

/**
 * Prueba de argumentos variables
 */

public class PruebaVarargs {

  /**
   * Calcula promedio
   * @param numeros
   * @return
   */
  public static double promedio(double... numeros) {
    double total = 0.0;

    for (double d : numeros) {
      total += d;
    }

    return total / numeros.length;
  }

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    double d1 = 10.0;
    double d2 = 20.0;
    double d3 = 30.0;
    double d4 = 40.0;

    System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n", d1, d2, d3, d4);

    System.out.printf("El promedio de d1 y d2 es %.1f%n", promedio(d1, d2));

    System.out.printf("El promedio de d1, d2 y d3 es %.1f%n", promedio(d1, d2, d3));

    System.out.printf("El promedio de d1, d2, d3 y d4 es %.1f%n",
      promedio(d1, d2, d3, d4));
  }
}

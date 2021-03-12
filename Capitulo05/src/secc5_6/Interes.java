/**
 * Interes.java
 * Creation Date: 11 mar 2021, 16:33:01
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_6;

/**
 * calculo de interes
 */
public class Interes {

  /**
   * Calcula el interes compuesto
   * @param args
   */
  public static void main(String[] args) {
    double monto;
    double principal = 1000.0;
    double tasa = 0.05;

    System.out.printf("%s%20s%n", "Año", "Monto en deposito");

    for (int anio = 1; anio <= 10; ++anio) {
      monto = principal * Math.pow(1.0 + tasa, anio);

      System.out.printf("%4d%,20.2f%n", anio, monto);
    }
  }
}

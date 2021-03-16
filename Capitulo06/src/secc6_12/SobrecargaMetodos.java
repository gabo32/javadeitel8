/**
 * SobrecargaMetodos.java
 * Creation Date: 12 mar 2021, 23:56:41
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc6_12;

/**
 * Sobrecarga de metodos
 */

public class SobrecargaMetodos {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    System.out.printf("El cuadrado del entero 7 es %d%n", cuadrado(7));
    System.out.printf("El cuadrado del double 7.5 es %f%n", cuadrado(7.5));
  }

  /**
   * Cuadrado de un entero
   * @param valorInt
   * @return
   */
  public static int cuadrado(int valorInt) {
    System.out.printf("%nSe llamo a cuadrado con argumento int: %d%n", valorInt);
    return valorInt * valorInt;
  }

  /**
   * Cuadrado de un double
   * @param valorDouble
   * @return
   */
  public static double cuadrado(double valorDouble) {
    System.out.printf("%nSe llamo a cuadrado con argumento double: %f%n", valorDouble);

    return valorDouble * valorDouble;
  }

}

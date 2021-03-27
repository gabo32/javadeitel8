/**
 * DivisionEntreCEroSinException.java
 * Creation Date: 26 mar 2021, 13:43:41
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc11_2;

import java.util.Scanner;

/**
 * genera una exception
 */

public class DivisionEntreCEroSinException {

  /**
   * Divide 2 numeros
   * @param numerador
   * @param denominador
   * @return
   */
  public static int cociente(int numerador, int denominador) {
    return numerador / denominador;
  }

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner explorador = new Scanner(System.in);
    System.out.println("Introduzca un numerador entero: ");
    int numerador = explorador.nextInt();
    System.out.println("Introduzca un denominador entero");
    int denominador = explorador.nextInt();

    int resultado = cociente(numerador, denominador);
    System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
  }
}

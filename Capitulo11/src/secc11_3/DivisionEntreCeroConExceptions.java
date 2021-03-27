/**
 * DivisionEntreCeroConExceptions.java
 * Creation Date: 26 mar 2021, 13:53:27
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc11_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Atrapa exceptions
 */

public class DivisionEntreCeroConExceptions {

  /**
   * Divicion
   * @param numerador
   * @param denominador
   * @return
   * @throws ArithmeticException en caso de division entre cero
   */
  public static int cociente(int numerador, int denominador) throws ArithmeticException {
    return numerador / denominador;
  }

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner explorador = new Scanner(System.in);
    boolean continuarCiclo = true;

    do {
      try {
        System.out.println("Introduzca un numerador entero: ");
        int numerador = explorador.nextInt();
        System.out.println("Introduzca un denominador entero: ");
        int denominador = explorador.nextInt();

        int resultado = cociente(numerador, denominador);
        System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador,
          resultado);
        continuarCiclo = false;
      } catch (InputMismatchException e) {
        System.err.printf("%nException: %s%n", e);
        explorador.nextLine();
        System.out.println("Debe introduccir valores enteros");
      } catch (ArithmeticException e) {
        System.err.printf("%nException: %s%n", e);
        System.out.println("Cero es un denominador invalido");
      }
    } while (continuarCiclo);
  }
}

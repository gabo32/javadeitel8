/**
 * PruebaAssert.java
 * Creation Date: 27 mar 2021, 0:04:50
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc11_11;

import java.util.Scanner;

/**
 * Prueba se assert
 */

public class PruebaAssert {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escriba un numero entre 0 y 10: ");
    int numero = entrada.nextInt();

    assert (numero >= 0 && numero <= 10) : "Numero incorrecto: " + numero;

    System.out.println("Usted escribio " + numero);
  }
}

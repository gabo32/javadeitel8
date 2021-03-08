/**
 * Comparacion.java
 * Creation Date: 8 mar 2021, 15:23:50
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package sec2_15;

import java.util.Scanner;

/**
 * Compara entyeros utilizando instrucciones if
 */

public class Comparacion {

  /**
   * Metodo principal
   * @param args
   */
  @SuppressWarnings("resource")
  public static void main(String... args) {

    // crea un objeto scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner(System.in);

    int numero1;
    int numero2;

    System.out.print("Escriba el primero numero entero: ");
    numero1 = entrada.nextInt();

    System.out.print("Escriba el segundo entero ");
    numero2 = entrada.nextInt();

    if (numero1 == numero2) {
      System.out.printf(" %d == %d ", numero1, numero2);
    }

    if (numero1 != numero2) {
      System.out.printf(" %d != %d ", numero1, numero2);
    }

    if (numero1 < numero2) {
      System.out.printf(" %d < %d ", numero1, numero2);
    }

    if (numero1 > numero2) {
      System.out.printf(" %d > %d ", numero1, numero2);
    }

    if (numero1 <= numero2) {
      System.out.printf(" %d <= %d ", numero1, numero2);
    }

    if (numero1 >= numero2) {
      System.out.printf(" %d >= %d ", numero1, numero2);
    }

    entrada.close();
  }
}

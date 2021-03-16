/**
 * BuscadorMaximo.java
 * Creation Date: 12 mar 2021, 22:40:45
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc6_04;

import java.util.Scanner;

/**
 * clase buscador
 */

public class BuscadorMaximo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);

    System.out
      .println("Escriba tres valores de punto flotante, separados por espacios: ");

    double numero1 = entrada.nextDouble();
    double numero2 = entrada.nextDouble();
    double numero3 = entrada.nextDouble();

    // calculamos el valor maximo
    double resultado = maximo(numero1, numero2, numero3);

    System.out.println("El maximo es: " + resultado);
  }

  /**
   * Calcula el maximo de 3 numeros
   * @param x
   * @param y
   * @param z
   * @return
   */
  public static double maximo(double x, double y, double z) {
    double valorMaximo = x;

    if (y > valorMaximo) {
      valorMaximo = y;
    }

    if (z > valorMaximo) {
      valorMaximo = z;
    }

    return valorMaximo;
  }
}

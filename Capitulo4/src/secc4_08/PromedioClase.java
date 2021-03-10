/**
 * PromedioClase.java
 * Creation Date: 10 mar 2021, 13:14:05
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_08;

import java.util.Scanner;

/**
 * Clase promedio
 */

public class PromedioClase {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);

    int total = 0;

    int contadorCalificaciones = 1;

    while (contadorCalificaciones <= 10) {
      System.out.print("Escriba la calificacion: ");
      int calificacion = entrada.nextInt();

      total += calificacion;

      contadorCalificaciones++;
    }

    int promedio = total / 10;

    System.out.printf("El total de calificaciones es: %d", total);
    System.out.printf("%nEl promedio es %d%n", promedio);

  }
}

/**
 * PromedioClase.java
 * Creation Date: 10 mar 2021, 13:34:23
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_10;

import java.util.Scanner;

/**
 * promedio de calificaciones
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
    int contadorCalificaciones = 0;

    System.out.println("Escriba la calificacion o -1 para terminar: ");
    int calificacion = entrada.nextInt();

    while (calificacion != -1) {
      total = total + calificacion;
      contadorCalificaciones++;

      System.out.print("Escriba la calificion o -1 para terminar: ");
      calificacion = entrada.nextInt();
    }

    if (contadorCalificaciones != 0) {
      double promedio = (double) total / contadorCalificaciones;

      System.out.printf("%nEl total de las %d calidifaciones introducidas es %d%n",
        contadorCalificaciones, total);
      System.out.printf("El promedio de la clase es %.2f%n", promedio);
    } else {
      System.out.println("No se introdujeron calificaciones");
    }
  }
}

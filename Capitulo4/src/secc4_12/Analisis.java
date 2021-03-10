/**
 * Analisis.java
 * Creation Date: 10 mar 2021, 13:50:59
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_12;

import java.util.Scanner;

/**
 * promedio de calificaciones
 */

public class Analisis {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);

    int aprobados = 0;
    int reprobados = 0;
    int contadorEstudiantes = 1;

    while (contadorEstudiantes <= 10) {
      System.out.println("Escriba el resultado (1= aprobado, 2= reprobado): ");
      int resultado = entrada.nextInt();

      if (resultado == 1) {
        aprobados++;
      } else {
        reprobados++;
      }

      contadorEstudiantes++;
    }

    System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

    if (aprobados > 8) {
      System.out.println("Bono para el instructor1");
    }
  }
}

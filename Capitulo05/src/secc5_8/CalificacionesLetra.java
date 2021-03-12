/**
 * CalificacionesLetra.java
 * Creation Date: 11 mar 2021, 16:49:32
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_8;

import java.util.Scanner;

/**
 * calificaciones
 */

public class CalificacionesLetra {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int total = 0;
    int contadorCalif = 0;
    int aCuenta = 0;
    int bCuenta = 0;
    int cCuenta = 0;
    int dCuenta = 0;
    int fCuenta = 0;

    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);

    System.out.printf("%s%n%s%n  %s%n  %s%n",
      "Introduzca las calificaciones en el rango de 0-100",
      "Escriba el indicador de fin de archivo para terminar la entrada: ",
      "En unix/linux/mac escriba <Ctrl> d y oprima intro",
      "El windows escriba <Ctrl> z y oprima intro");

    while (entrada.hasNext()) {
      int calificacion = entrada.nextInt();

      total += calificacion;
      ++contadorCalif;

      switch (calificacion / 10) {
        case 9:
        case 10:
          ++aCuenta;
          break;

        case 8:
          ++bCuenta;
          break;
        case 7:
          ++cCuenta;
          break;
        case 6:
          ++dCuenta;
          break;
        default:
          ++fCuenta;
          break;
      }

      System.out.printf("%nReporte de calificaciones: %n");

      if (contadorCalif != 0) {
        double promedio = (double) total / contadorCalif;

        System.out.printf("El total de las %d calidifcaiones introducidas es %d%n",
          contadorCalif, total);
        System.out.printf("El promedio de la clase es %.2f%n", promedio);
        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
          "Numero de estudiantes que recibiendo calficacion: ", "A: ", aCuenta, "B: ",
          bCuenta, "C: ", cCuenta, "D: ", dCuenta, "f: ", fCuenta);
      } else {
        System.out.println("No se introdujeron califricaciones");
      }
    }
  }
}

/**
 * PruebaLibroCalificaciones.java
 * Creation Date: 17 mar 2021, 19:24:23
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_12;

/**
 * Prueba de calificaciones
 */

public class PruebaLibroCalificaciones {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int[][] arregloCalif =
      { { 87, 96, 70 }, { 68, 87, 90 }, { 94, 100, 90 }, { 100, 81, 82 }, { 83, 65, 85 },
        { 78, 87, 65 }, { 85, 75, 83 }, { 91, 94, 100 }, { 76, 72, 84 }, { 87, 93, 73 } };

    LibroCalificaciones miLibro =
      new LibroCalificaciones("Cs101 Introduccion a java", arregloCalif);
    System.out.printf("Bienvenido al libro de calificaciones para: %n%s%n%n",
      miLibro.getNombreDelCurso());

    miLibro.procesarCalificaciones();
  }
}

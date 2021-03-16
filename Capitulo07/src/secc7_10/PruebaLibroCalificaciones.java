/**
 * PruebaLibroCalificaciones.java
 * Creation Date: 16 mar 2021, 16:41:24
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_10;

/**
 * prueba de calificaciones
 */

public class PruebaLibroCalificaciones {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int[] arregloCalif = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

    LibroCalificaciones miLibro =
      new LibroCalificaciones("Cs101 Introduccion a java", arregloCalif);

    System.out.printf("Bienvenido al libro de calificaciones para %n%s%n%n",
      miLibro.getNombreDelCurso());

    miLibro.procesarCalificaciones();
  }
}

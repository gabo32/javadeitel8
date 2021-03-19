/**
 * PruebaEnum.java
 * Creation Date: 18 mar 2021, 18:43:01
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_09;

import java.util.EnumSet;

/**
 * Prueba enum
 */

public class PruebaEnum {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("Todos los libros");

    for (Libro libro : Libro.values()) {
      System.out.printf("%-10s%-45s%s%n", libro, libro.getTitulo(),
        libro.getAnioCopyright());
    }

    System.out.println("Mostrar un rango de constantes enum\n\n");

    for (Libro libro : EnumSet.range(Libro.JHTP, Libro.CPPHTP)) {
      System.out.printf("%-10s%-45s%s%n", libro, libro.getTitulo(),
        libro.getAnioCopyright());
    }
  }
}

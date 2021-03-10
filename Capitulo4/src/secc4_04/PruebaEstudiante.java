/**
 * PruebaEstudiante.java
 * Creation Date: 10 mar 2021, 13:06:27
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_04;

/**
 * Clase principal para estudiante
 */

public class PruebaEstudiante {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    Estudiante cuenta1 = new Estudiante("Gabo32", 93.5);
    Estudiante cuenta2 = new Estudiante("Hermenegildo", 72.75);

    System.out.printf("La calificacion en letra de %s es: %s%n", cuenta1.getNombre(),
      cuenta1.getCalificacionEstudiante());
    System.out.printf("La calificacion en letra de %s es: %s%n", cuenta2.getNombre(),
      cuenta2.getCalificacionEstudiante());

  }
}

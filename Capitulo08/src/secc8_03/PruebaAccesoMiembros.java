/**
 * PruebaAccesoMiembros.java
 * Creation Date: 18 mar 2021, 15:26:09
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_03;

import secc8_02.Tiempo1;

/**
 * valida que no se puede acceder a mienbros private
 */

public class PruebaAccesoMiembros {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    Tiempo1 tiempo = new Tiempo1();

    // tiempo.hora = 8;//no se puede acceder a esta elemento
    tiempo.toString();
  }
}

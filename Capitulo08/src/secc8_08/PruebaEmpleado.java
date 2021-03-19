/**
 * PruebaEmpleado.java
 * Creation Date: 18 mar 2021, 18:26:55
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_08;

/**
 * Composicion
 */

public class PruebaEmpleado {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    Fecha nacimiento = new Fecha(7, 24, 1949);
    Fecha contratacion = new Fecha(3, 12, 1988);
    Empleado empleado = new Empleado("Bob", "Blue", nacimiento, contratacion);

    System.out.println(empleado);
  }
}

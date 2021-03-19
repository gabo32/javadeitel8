/**
 * PruebaEmpleado.java
 * Creation Date: 18 mar 2021, 19:11:51
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_11;

/**
 * Prueba empleado
 */

public class PruebaEmpleado {

  /**
   * Metodo principal
   * @param args
   */
  @SuppressWarnings("static-access")
  public static void main(String[] args) {

    System.out.printf("Empleados antes de instanciar: %d%n", Empleado.getCuenta());

    Empleado e1 = new Empleado("Susan", "Baker");
    Empleado e2 = new Empleado("Bob", "Blue");

    System.out.println("Empleados despues de instanciar:  \n");
    System.out.printf("mediante e1.getCuenta(): %d%n", e1.getCuenta());
    System.out.printf("mediante e2.getCuenta(): %d%n", e2.getCuenta());
    System.out.printf("mediante Empleado.getCuenta(): %d%n", Empleado.getCuenta());

    System.out.printf("%nEmpleado1: %s %s%nEmpleado2: %s %s%n", e1.getNombre(),
      e1.getApellido(), e2.getNombre(), e2.getApellido());
  }
}

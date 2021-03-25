/**
 * PruebaPolimorfismo.java
 * Creation Date: 23 mar 2021, 12:40:39
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc10_3;

/**
 * prueba de polimorfismo
 */

public class PruebaPolimorfismo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    EmpleadoPorComision empleadoPorComision =
      new EmpleadoPorComision("Sue", "Jones", "222-22-222", 10000, 0.06);

    EmpleadoBaseMasComision empleadoBaseMasComision =
      new EmpleadoBaseMasComision("Bob", "Lewis", "333-33-333", 5000, .04, 300);

    System.out.printf("%s %s: %n%n%s%n%n",
      "Llamada a toString de empleadocomision con referencia de subclase",
      "a un objeto de la superclase", empleadoPorComision.toString());

    System.out.printf("%s %s: %n%n%s%n%n",
      "Llamada a toString de empleadobasemascomicion con referencia de subclase",
      "a un objeto de la superclase", empleadoBaseMasComision.toString());

    EmpleadoPorComision empleadoComision2 = empleadoBaseMasComision;

    System.out.printf("%s %s: %n%n%s%n%n",
      "Llamada a toString de empleadobasemascomicion con referencia de superclase",
      "a un objeto de la superclase", empleadoComision2.toString());
  }
}

/**
 * PruebaInterfazPorPagar.java
 * Creation Date: 25 mar 2021, 14:03:33
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc10_9;

/**
 * Prueba de interfaz
 */

public class PruebaInterfazPorPagar {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    PorPagar[] objetosPorPagar = new PorPagar[4];

    objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.0);
    objetosPorPagar[1] = new Factura("56789", "Llanta", 4, 79.95);
    objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-111", 800);
    objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-888", 1200);

    System.out.println("Facturas y empleados de forma polimorfica");

    for (PorPagar porPagar : objetosPorPagar) {
      System.out.printf("%n%s %n%s: $%,.2f%n", porPagar.toString(), "Pago vencido",
        porPagar.getMontoPago());
    }

  }
}

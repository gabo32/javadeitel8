/**
 * PruebaPolizaAuto.java
 * Creation Date: 11 mar 2021, 17:13:05
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_11;

/**
 * prueba de poliza
 */

public class PruebaPolizaAuto {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    PolizaAuto poliza1 = new PolizaAuto(11111111, "Toyota Camry", "NJ");
    PolizaAuto poliza2 = new PolizaAuto(22222222, "Ford fusion", "ME");

    polizaEnEstadoSinCulpa(poliza1);
    polizaEnEstadoSinCulpa(poliza2);

  }

  /**
   * Mensaje
   * @param poliza
   */
  public static void polizaEnEstadoSinCulpa(PolizaAuto poliza) {
    System.out.println("La poliza de auto: ");
    System.out.printf(" Cuenta #: %d; Auto: %s; Estado %s %s un estado sin culpa %n%n",
      poliza.getNumeroCuenta(), poliza.getMarcaYModelo(), poliza.getEstado(),
      (poliza.esEstadoSinCulpa() ? "Esta en " : "no esta en"));
  }
}

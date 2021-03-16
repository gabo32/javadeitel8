/**
 * Alcance.java
 * Creation Date: 12 mar 2021, 23:49:20
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc6_11;

/**
 * alcance de variables
 */

public class Alcance {

  private static int x = 1;

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int x = 5;

    System.out.printf("la x local en main es %d%n", x);

    usarVariableLocal();
    usarCampo();
    usarVariableLocal();
    usarCampo();

    System.out.printf("%n la x local en main es %d%n", x);
  }

  /**
   * usa variable local
   */
  public static void usarVariableLocal() {
    int x = 25;
    System.out.printf("%nla x local al entrar al metrodo usarVariableLocal es %d%n", x);
    ++x;
    System.out.printf("la x local antes de salir del metodo usarVariableLocal es %d%n",
      x);
  }

  /**
   * Usa campo
   */
  public static void usarCampo() {
    System.out.printf("%nel campo x al entrar al metodo usarCampo es %d%n", x);
    x *= 10;
    System.out.printf("El campo x antes de salir del metodo usarCampo es %d%n", x);
  }
}

/**
 * Incremento.java
 * Creation Date: 10 mar 2021, 13:56:38
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_15;

/**
 * preincremento y posincremento
 */

public class Incremento {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int c = 5;

    System.out.printf("C antes del posincremento: %d%n", c);
    System.out.printf("            posincremento: %d%n", c++);
    System.out.printf("C despues del posincremento: %d%n", c);

    System.out.println();

    c = 5;
    System.out.printf("C antes del preincremento: %d%n", c);
    System.out.printf("            preincremento: %d%n", ++c);
    System.out.printf("C despues del preincremento: %d%n", c);
  }
}

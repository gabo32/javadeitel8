/**
 * PruebaStaticImport.java
 * Creation Date: 18 mar 2021, 19:32:50
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_13;

import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

/**
 * impor static
 */

public class PruebaStaticImport {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
    System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
    System.out.printf("E = %.1f%n", E);
    System.out.printf("PI = %.1f%n", PI);
  }
}

/**
 * UsoDeExcepcionesEncadenadas.java
 * Creation Date: 26 mar 2021, 23:51:17
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc11_8;

/**
 * excepciones encadenadas
 */

public class UsoDeExcepcionesEncadenadas {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    try {
      metodo1();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * metodo 2
   * @throws Exception
   */
  public static void metodo1() throws Exception {

    try {
      metodo2();
    } catch (Exception e) {
      throw new Exception("La excepcion se lanzo en metodo1", e);
    }
  }

  /**
   * Metodo 2
   * @throws Exception
   */
  public static void metodo2() throws Exception {

    try {
      metodo3();
    } catch (Exception e) {
      throw new Exception("La excepcion se lanzo en metodo2", e);
    }
  }

  /**
   * Metodo 3
   * @throws Exception
   */
  public static void metodo3() throws Exception {
    throw new Exception("La excepcion se lanzo en metodo 3");
  }

}

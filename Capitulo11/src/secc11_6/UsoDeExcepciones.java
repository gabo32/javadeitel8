/**
 * UsoDeExcepciones.java
 * Creation Date: 26 mar 2021, 23:21:26
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc11_6;

/**
 * Uso de excepciones
 */

public class UsoDeExcepciones {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    try {
      lanzaException();
    } catch (Exception e) {
      System.err.println("La exception la manejo main");
    }

    noLanzaException();
  }

  /**
   * Lanza exception
   * @throws Exception
   */
  public static void lanzaException() throws Exception {
    try {
      System.out.println("Metodo lanzaexception");
      throw new Exception();
    } catch (Exception e) {
      System.err.println("La exception se manejo en el metodo lanzaexception");
      throw e;
    } finally {
      System.err.println("Se ejecuta finally");
    }
  }

  /**
   * no lanza exception
   */
  public static void noLanzaException() {
    try {
      System.out.println("Metodo no lanza exception");
    } catch (Exception e) {
      System.err.println(e);
    } finally {
      System.err.println("Se ejecuta finally en no lanza exception");
    }

    System.out.println("fin de no lanza exception");
  }
}

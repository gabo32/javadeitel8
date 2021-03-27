/**
 * UsoDeExcepciones.java
 * Creation Date: 26 mar 2021, 23:38:39
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc11_7;

/**
 * Limpieza de la pila
 */

public class UsoDeExcepciones {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    try {
      metodo1();
    } catch (Exception e) {
      System.err.printf("%s%n%n", e.getMessage());
      e.printStackTrace();

      StackTraceElement[] elementosRastreo = e.getStackTrace();
      System.out.println("\nRastreo de la pila de getStackTrace\n");
      System.out.println("Clase\t\t\t\tArchivo\t\t\tlinea\tmetodo");

      for (StackTraceElement stackTraceElement : elementosRastreo) {

        System.out.printf("%s\t", stackTraceElement.getClassName());
        System.out.printf("%s\t", stackTraceElement.getFileName());
        System.out.printf("%s\t", stackTraceElement.getLineNumber());
        System.out.printf("%s%n", stackTraceElement.getMethodName());
      }
    }
  }

  /**
   * Metodo 2
   * @throws Exception
   */
  public static void metodo1() throws Exception {
    metodo2();
  }

  /***
   * Metodo 3
   * @throws Exception
   */
  public static void metodo2() throws Exception {
    metodo3();
  }

  /**
   * Metodo 3
   * @throws Exception
   */
  public static void metodo3() throws Exception {
    throw new Exception("La exception se lanzo en el metodo 3");
  }

}

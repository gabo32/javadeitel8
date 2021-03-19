/**
 * PruebaTiempo2.java
 * Creation Date: 18 mar 2021, 17:54:39
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_05;

/**
 * Prueba de tiempo
 */

public class PruebaTiempo2 {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    Tiempo2 t1 = new Tiempo2();
    Tiempo2 t2 = new Tiempo2(2);
    Tiempo2 t3 = new Tiempo2(21, 34);
    Tiempo2 t4 = new Tiempo2(12, 25, 42);
    Tiempo2 t5 = new Tiempo2(t4);

    System.out.println("Se construyo con ");
    mostrarTiempo("t1: todos los argumentos predeterminados", t1);
    mostrarTiempo("t2: Se especifico hora; minuto y segundo predeterminados", t2);
    mostrarTiempo("t3: Se especifica hora y minuto; segundo predeterminado", t3);
    mostrarTiempo("t4: Se espefician todos", t4);
    mostrarTiempo("t5: se especifico el objeto t4", t5);

    try {
      Tiempo2 t6 = new Tiempo2(27, 74, 99);
      t6.toString();
    } catch (IllegalArgumentException e) {
      System.out.println("Exception al inicializar t6: " + e.getMessage());
    }
  }

  /**
   * Muestrar el tiempo
   * @param encabezado
   * @param t
   */
  private static void mostrarTiempo(String encabezado, Tiempo2 t) {
    System.out.printf("%s%n %s%n %s%n", encabezado, t.toStringUniversal(), t.toString());
  }
}

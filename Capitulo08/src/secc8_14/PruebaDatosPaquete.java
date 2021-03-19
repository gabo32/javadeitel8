/**
 * PruebaDatosPaquete.java
 * Creation Date: 18 mar 2021, 22:43:25
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_14;

/**
 * acceso a nivel de paquete
 */

public class PruebaDatosPaquete {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    DatosPaquete datosPaquete = new DatosPaquete();

    System.out.printf("Despues de instanciar: %n%s%n", datosPaquete);

    datosPaquete.numero = 77;
    datosPaquete.cadena = "Adios";

    System.out.printf("%nDespues de modificar valores: %n%s%n", datosPaquete);
  }
}

class DatosPaquete {
  int numero;
  String cadena;

  public DatosPaquete() {
    numero = 0;
    cadena = "Hola";
  }

  @Override
  public String toString() {
    return String.format("numero: %d, cadena: %s", numero, cadena);
  }
}

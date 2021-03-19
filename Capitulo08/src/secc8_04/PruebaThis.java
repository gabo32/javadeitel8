/**
 * PruebaThis.java
 * Creation Date: 18 mar 2021, 15:28:53
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_04;

/**
 * Prueba de this
 */

public class PruebaThis {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    TiempoSimple tiempo = new TiempoSimple(15, 30, 19);
    System.out.println(tiempo.crearString());
  }
}

class TiempoSimple {
  private int hora;
  private int minuto;
  private int segundo;

  public TiempoSimple(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  public String crearString() {
    return String.format("%24s: %s%n%24s: %s", "this.toStringUniversal()",
      this.toStringUniversal(), "toStringUniversal()", toStringUniversal());
  }

  public String toStringUniversal() {
    return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
  }

}

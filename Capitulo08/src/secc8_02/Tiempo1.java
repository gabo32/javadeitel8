/**
 * Tiempo1.java
 * Creation Date: 18 mar 2021, 15:06:05
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_02;

/**
 * clase tiempo
 */

public class Tiempo1 {

  private int hora;
  private int minuto;
  private int segundo;

  /**
   * Constructor
   * @param hora
   * @param minuto
   * @param segundo
   */

  public void setTiempo(int hora, int minuto, int segundo) {
    if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0
      || segundo >= 60) {
      throw new IllegalArgumentException("hora, minuto y/o segundo estan fuera de rango");
    }

    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  /**
   * Representacion del tiempo
   * @return
   */
  public String toStringUniversal() {
    return String.format("%02d:%02d:%02d", hora, minuto, segundo);
  }

  @Override
  public String toString() {
    return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12),
      minuto, segundo, (hora < 12 ? "AM" : "PM"));
  }
}

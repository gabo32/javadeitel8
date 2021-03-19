/**
 * Tiempo2.java
 * Creation Date: 18 mar 2021, 17:27:26
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
 * sobrecarga de constructores
 */

public class Tiempo2 {

  private int hora;
  private int minuto;
  private int segundo;

  /**
   * Constructor sin parametros
   */
  public Tiempo2() {
    this(0, 0, 0);
  }

  /**
   * Constructor con hora
   * @param hora
   */
  public Tiempo2(int hora) {
    this(hora, 0, 0);
  }

  /**
   * Constructor con hora y minuto
   * @param hora
   * @param minuto
   */
  public Tiempo2(int hora, int minuto) {
    this(hora, minuto, 0);
  }

  /**
   * Constructor con 3 parametros
   * @param hora
   * @param minuto
   * @param segundo
   */
  public Tiempo2(int hora, int minuto, int segundo) {
    if (hora < 0 || hora >= 24) {
      throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
    }

    if (minuto < 0 || minuto >= 60) {
      throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
    }

    if (segundo < 0 || segundo >= 60) {
      throw new IllegalArgumentException("Segundo debe estar entre 0 y 59");
    }

    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  /**
   * Constructor con otro tiempo
   * @param tiempo
   */
  public Tiempo2(Tiempo2 tiempo) {
    this(tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
  }

  /**
   * Set tiempo
   * @param hora
   * @param minuto
   * @param segundo
   */
  public void setTiempo(int hora, int minuto, int segundo) {
    if (hora < 0 || hora >= 24) {
      throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
    }

    if (minuto < 0 || minuto >= 60) {
      throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
    }

    if (segundo < 0 || segundo >= 60) {
      throw new IllegalArgumentException("Segundo debe estar entre 0 y 59");
    }

    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  /**
   * @return the hora
   */
  public int getHora() {
    return hora;
  }

  /**
   * @param hora the hora to set
   */
  public void setHora(int hora) {
    if (hora < 0 || hora >= 24) {
      throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
    }
    this.hora = hora;
  }

  /**
   * @return the minuto
   */
  public int getMinuto() {
    return minuto;
  }

  /**
   * @param minuto the minuto to set
   */
  public void setMinuto(int minuto) {
    if (minuto < 0 || minuto >= 60) {
      throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
    }
    this.minuto = minuto;
  }

  /**
   * @return the segundo
   */
  public int getSegundo() {
    return segundo;
  }

  /**
   * @param segundo the segundo to set
   */
  public void setSegundo(int segundo) {
    if (segundo < 0 || segundo >= 60) {
      throw new IllegalArgumentException("Segundo debe estar entre 0 y 59");
    }
    this.segundo = segundo;
  }

  /**
   * Representacion del tiempo
   * @return
   */
  public String toStringUniversal() {
    return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
  }

  @Override
  public String toString() {
    return String.format("%d:%02d:%02d %s",
      ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12), getMinuto(),
      getSegundo(), (getHora() < 12 ? "AM" : "PM"));
  }

}

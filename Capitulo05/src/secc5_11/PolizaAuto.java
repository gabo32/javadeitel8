/**
 * PolizaAuto.java
 * Creation Date: 11 mar 2021, 17:09:03
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_11;

/**
 * representa poliza
 */

public class PolizaAuto {

  private int numeroCuenta;
  private String marcaYModelo;
  private String estado;

  /**
   * Constructor
   * @param numeroCuenta
   * @param marcaYModelo
   * @param estado
   */
  public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado) {
    super();
    this.numeroCuenta = numeroCuenta;
    this.marcaYModelo = marcaYModelo;
    this.estado = estado;
  }

  /**
   * @return the numeroCuenta
   */
  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  /**
   * @param numeroCuenta the numeroCuenta to set
   */
  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  /**
   * @return the marcaYModelo
   */
  public String getMarcaYModelo() {
    return marcaYModelo;
  }

  /**
   * @param marcaYModelo the marcaYModelo to set
   */
  public void setMarcaYModelo(String marcaYModelo) {
    this.marcaYModelo = marcaYModelo;
  }

  /**
   * @return the estado
   */
  public String getEstado() {
    return estado;
  }

  /**
   * @param estado the estado to set
   */
  public void setEstado(String estado) {
    this.estado = estado;
  }

  /**
   * devuelve si el estado tiene seguro sin culpa
   * @return
   */
  public boolean esEstadoSinCulpa() {
    boolean estadoSinCulpa;

    switch (getEstado()) {
      case "MA":
      case "NJ":
      case "NY":
      case "PA":
        estadoSinCulpa = true;
        break;
      default:
        estadoSinCulpa = false;

        break;
    }

    return estadoSinCulpa;
  }

}

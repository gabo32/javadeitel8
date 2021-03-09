/**
 * Cuenta.java
 * Creation Date: 9 mar 2021, 13:46:06
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc3_2;

/**
 * Clase cuenta
 */

public class Cuenta {

  private String nombre;
  private double saldo;

  /**
   * Constructor que recibe el nombre de la cuenta
   * @param nombre
   * @param saldo
   */
  public Cuenta(String nombre, double saldo) {
    this.nombre = nombre;

    if (saldo > 0.0) {
      this.saldo = saldo;
    }
  }

  /**
   * Deposita dinero
   * @param monto
   */
  public void depositar(double monto) {
    if (monto > 0.0) {
      saldo += saldo + monto;
    }
  }

  /**
   * Devuelve el saldo de la cuenta
   * @return
   */
  public double getSaldo() {
    return this.saldo;
  }

  /**
   * set nombre
   * @param nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * devuelve nombre
   * @return
   */
  public String getNombre() {
    return nombre;
  }

}

/**
 * Empleado.java
 * Creation Date: 23 mar 2021, 13:05:04
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc10_9;

/**
 * Clase base empleado
 */

public abstract class Empleado implements PorPagar {

  private final String primerNombre;
  private final String apellidoPaterno;
  private final String numeroSeguroSocial;

  /**
   * Constructor
   * @param primerNombre
   * @param apellidoPaterno
   * @param numeroSeguroSocial
   */
  public Empleado(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial) {
    super();
    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;
  }

  /**
   * Calcula el sueldo
   * @return
   */
  public abstract double ingresos();

  /**
   * @return the primerNombre
   */
  public String getPrimerNombre() {
    return primerNombre;
  }

  /**
   * @return the apellidoPaterno
   */
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  /**
   * @return the numeroSeguroSocial
   */
  public String getNumeroSeguroSocial() {
    return numeroSeguroSocial;
  }

  /**
   * See the original documentation of the method declaration
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return String.format("%s %s%nnumero de seguro social: %s", getPrimerNombre(),
      getApellidoPaterno(), getNumeroSeguroSocial());
  }

}

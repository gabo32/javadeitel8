/**
 * EmpleadoPorComision.java
 * Creation Date: 22 mar 2021, 19:18:31
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc9_4;

/**
 * EMpleado con comision
 */

public class EmpleadoPorComision extends Object {

  private final String primerNombre;
  private final String apellidoPaterno;
  private final String numeroSeguroSocial;
  private double ventasBrutas;
  private double tarifaComision;

  /**
   * Constructor
   * @param primerNombre
   * @param apellidoPaterno
   * @param numeroSeguroSocial
   * @param ventasBrutas
   * @param tarifaComision
   */
  public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {

    if (ventasBrutas < 0.0) {
      throw new IllegalArgumentException("Las ventas deben ser mayor a cero");
    }

    if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
      throw new IllegalArgumentException("La comision debe estar entre 0 y 1");
    }

    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;
    this.ventasBrutas = ventasBrutas;
    this.tarifaComision = tarifaComision;
  }

  /**
   * Tarifa de comision
   * @return
   */
  public double ingresos() {
    return tarifaComision * ventasBrutas;
  }

  /**
   * @return the ventasBrutas
   */
  public double getVentasBrutas() {
    return ventasBrutas;
  }

  /**
   * @param ventasBrutas the ventasBrutas to set
   */
  public void setVentasBrutas(double ventasBrutas) {
    if (ventasBrutas < 0.0) {
      throw new IllegalArgumentException("las ventas deben ser mayor a cero");
    }
    this.ventasBrutas = ventasBrutas;
  }

  /**
   * @return the tarifaComision
   */
  public double getTarifaComision() {
    return tarifaComision;
  }

  /**
   * @param tarifaComision the tarifaComision to set
   */
  public void setTarifaComision(double tarifaComision) {
    if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
      throw new IllegalArgumentException("La comision debe estar entre 0 y 1");
    }
    this.tarifaComision = tarifaComision;
  }

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

  /*
   * See the original documentation of the method declaration
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("EmpleadoPorComision [primerNombre=");
    builder.append(primerNombre);
    builder.append(", apellidoPaterno=");
    builder.append(apellidoPaterno);
    builder.append(", numeroSeguroSocial=");
    builder.append(numeroSeguroSocial);
    builder.append(", ventasBrutas=");
    builder.append(ventasBrutas);
    builder.append(", tarifaComision=");
    builder.append(tarifaComision);
    builder.append("]");
    return builder.toString();
  }

}

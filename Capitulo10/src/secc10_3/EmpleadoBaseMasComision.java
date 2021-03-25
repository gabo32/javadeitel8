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

package secc10_3;

/**
 * EMpleado con comision
 */

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

  private double salarioBase;

  /**
   * Constructor
   * @param primerNombre
   * @param apellidoPaterno
   * @param numeroSeguroSocial
   * @param ventasBrutas
   * @param tarifaComision
   * @param salarioBase
   */
  public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double ventasBrutas, double tarifaComision,
    double salarioBase) {

    super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas,
      tarifaComision);

    if (salarioBase < 0.0) {
      throw new IllegalArgumentException("El salario base debe ser mayor a 0");
    }

    this.salarioBase = salarioBase;
  }

  /**
   * Tarifa de comision
   * @return
   */
  @Override
  public double ingresos() {
    return salarioBase + (getTarifaComision() * getVentasBrutas());
  }

  /**
   * @return the salarioBase
   */
  public double getSalarioBase() {
    return salarioBase;
  }

  /**
   * @param salarioBase the salarioBase to set
   */
  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  /**
   * See the original documentation of the method declaration
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("EmpleadoBaseMasComision [salarioBase=");
    builder.append(salarioBase);
    builder.append(", getVentasBrutas()=");
    builder.append(getVentasBrutas());
    builder.append(", getTarifaComision()=");
    builder.append(getTarifaComision());
    builder.append(", getPrimerNombre()=");
    builder.append(getPrimerNombre());
    builder.append(", getApellidoPaterno()=");
    builder.append(getApellidoPaterno());
    builder.append(", getNumeroSeguroSocial()=");
    builder.append(getNumeroSeguroSocial());
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append(", getClass()=");
    builder.append(getClass());
    builder.append(", hashCode()=");
    builder.append(hashCode());
    builder.append("]");
    return builder.toString();
  }

}

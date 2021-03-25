/**
 * EmpleadoBaseMasComision.java
 * Creation Date: 23 mar 2021, 13:40:26
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc10_5;

/**
 * Empleado base mas comision
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
   * Ingresos
   */
  @Override
  public double ingresos() {
    return getSalarioBase() + super.ingresos();
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
    if (salarioBase < 0.0) {
      throw new IllegalArgumentException("El salario base debe ser mayor a 0");
    }
    this.salarioBase = salarioBase;
  }

  /**
   * To string
   */
  @Override
  public String toString() {
    return String.format("%s %s; %s: $%,.2f", "Con salario base", super.toString(),
      "salario base", getSalarioBase());
  }
}

/**
 * EmpleadoAsalariado.java
 * Creation Date: 23 mar 2021, 13:10:20
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
 * Empleado asalariado
 */

public class EmpleadoAsalariado extends Empleado {

  private double salarioSemanal;

  /**
   * Constructor
   * @param primerNombre
   * @param apellidoPaterno
   * @param numeroSeguroSocial
   * @param salarioSemanal
   */
  public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double salarioSemanal) {
    super(primerNombre, apellidoPaterno, numeroSeguroSocial);

    if (salarioSemanal < 0.0) {
      throw new IllegalArgumentException("El salario debe ser mayor a cero");
    }
    this.salarioSemanal = salarioSemanal;
  }

  /**
   * See the original documentation of the method declaration
   * @see secc10_5.Empleado#ingresos()
   */
  @Override
  public double ingresos() {
    return getSalarioSemanal();
  }

  /**
   * @return the salarioSemanal
   */
  public double getSalarioSemanal() {
    return salarioSemanal;
  }

  /**
   * @param salarioSemanal the salarioSemanal to set
   */
  public void setSalarioSemanal(double salarioSemanal) {
    if (salarioSemanal < 0.0) {
      throw new IllegalArgumentException("El salario debe ser mayor a cero");
    }
    this.salarioSemanal = salarioSemanal;
  }

  @Override
  public String toString() {
    return String.format("empleado asalariado: %s%n%s: $%,.2f", super.toString(),
      "Salario semanal", getSalarioSemanal());
  }

  @Override
  public double getMontoPago() {
    return getSalarioSemanal();
  }

}

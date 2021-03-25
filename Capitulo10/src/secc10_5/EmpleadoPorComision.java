/**
 * EmpleadoPorComision.java
 * Creation Date: 23 mar 2021, 13:29:50
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
 * Empleado por comision con herencia
 */

public class EmpleadoPorComision extends Empleado {

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
    super(primerNombre, apellidoPaterno, numeroSeguroSocial);

    if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
      throw new IllegalArgumentException("La comision debe estar ente 0 y 1");
    }

    if (ventasBrutas < 0.0) {
      throw new IllegalArgumentException("Las ventas deben ser mayor a cero");
    }

    this.ventasBrutas = ventasBrutas;
    this.tarifaComision = tarifaComision;
  }

  /**
   * Ingresos
   */
  @Override
  public double ingresos() {
    return getTarifaComision() * getVentasBrutas();
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
      throw new IllegalArgumentException("Las ventas deben ser mayor a cero");
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
      throw new IllegalArgumentException("La comision debe estar ente 0 y 1");
    }
    this.tarifaComision = tarifaComision;
  }

  @Override
  public String toString() {
    return String.format("%s: %s%n%s: $%,.2f %s: %.2f", "Empleado por comision",
      super.toString(), "ventas brutas", getVentasBrutas(), "tarfica comision",
      getTarifaComision());
  }
}

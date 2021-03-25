/**
 * EmpleadoPorHoras.java
 * Creation Date: 23 mar 2021, 13:17:33
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
 * Empleado por horas
 */

public class EmpleadoPorHoras extends Empleado {

  private double sueldo;
  private double horas;

  /**
   * Constructor
   * @param primerNombre
   * @param apellidoPaterno
   * @param numeroSeguroSocial
   * @param sueldo
   * @param horas
   */
  public EmpleadoPorHoras(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double sueldo, double horas) {
    super(primerNombre, apellidoPaterno, numeroSeguroSocial);

    if (sueldo < 0.0) {
      throw new IllegalArgumentException("El sueldo debe ser mayor a cero");
    }

    if ((horas < 0.0) || (horas > 168.0)) {
      throw new IllegalArgumentException(
        "las horas trabajadas deben estar entre 0 y 168");
    }
    this.sueldo = sueldo;
    this.horas = horas;
  }

  /**
   * Ingresos
   */
  @Override
  public double ingresos() {

    if (getHoras() <= 40) {
      return getSueldo() * getHoras();
    }

    return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
  }

  /**
   * @return the sueldo
   */
  public double getSueldo() {
    return sueldo;
  }

  /**
   * @param sueldo the sueldo to set
   */
  public void setSueldo(double sueldo) {
    if (sueldo < 0.0) {
      throw new IllegalArgumentException("El sueldo debe ser mayor a cero");
    }
    this.sueldo = sueldo;
  }

  /**
   * @return the horas
   */
  public double getHoras() {
    return horas;
  }

  /**
   * @param horas the horas to set
   */
  public void setHoras(double horas) {
    if ((horas < 0.0) || (horas > 168.0)) {
      throw new IllegalArgumentException(
        "las horas trabajadas deben estar entre 0 y 168");
    }
    this.horas = horas;
  }

  @Override
  public String toString() {
    return String.format("Empleado por horas: %s%n%s: $%,.2f; %s: %,.2f",
      super.toString(), "Sueldo por hora", getSueldo(), "Horas trabajadas", getHoras());
  }
}

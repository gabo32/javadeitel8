/**
 * Empleado.java
 * Creation Date: 18 mar 2021, 18:22:53
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_08;

/**
 * Clase empleado
 */

public class Empleado {

  private String nombre;
  private String apellido;
  private Fecha fechaNacimiento;
  private Fecha fechaContratacion;

  /**
   * Constructor con todos los los parametros
   * @param nombre
   * @param apellido
   * @param fechaNacimiento
   * @param fechaContratacion
   */
  public Empleado(String nombre, String apellido, Fecha fechaNacimiento,
    Fecha fechaContratacion) {
    super();
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.fechaContratacion = fechaContratacion;
  }

  @Override
  public String toString() {
    return String.format("%s, %s Contratado: %s Cumpleaños: %s", apellido, nombre,
      fechaContratacion, fechaNacimiento);
  }

}

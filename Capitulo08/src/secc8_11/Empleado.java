/**
 * Empleado.java
 * Creation Date: 18 mar 2021, 19:06:33
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_11;

/**
 * Empleado con estatic
 */

public class Empleado {

  private static int cuenta = 0;
  private String nombre;
  private String apellido;

  /**
   * Constructor
   * @param nombre
   * @param apellido
   */
  public Empleado(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;

    ++cuenta;
    System.out.printf("Constructor de empleado: %s %s; cuenta = %d%n", nombre, apellido,
      cuenta);
  }

  /**
   * @return the cuenta
   */
  public static int getCuenta() {
    return cuenta;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the apellido
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * @param apellido the apellido to set
   */
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

}

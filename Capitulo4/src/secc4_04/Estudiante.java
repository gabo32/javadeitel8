/**
 * Estudiante.java
 * Creation Date: 10 mar 2021, 13:00:54
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_04;

/**
 * Clase estudiante
 */

public class Estudiante {

  private String nombre;
  private double promedio;

  /**
   * Constructor de Estudiante
   * @param nombre
   * @param promedio
   */
  public Estudiante(String nombre, double promedio) {
    super();
    this.nombre = nombre;

    if (promedio > 0.0 && promedio <= 100.0) {
      this.promedio = promedio;
    }

  }

  /**
   * Devuelve la calificacion del estudiante
   * @return
   */
  public String getCalificacionEstudiante() {
    String calificacionEstudiante = "";

    if (promedio >= 90.0) {
      calificacionEstudiante = "A";
    } else if (promedio >= 80.0) {
      calificacionEstudiante = "B";
    } else if (promedio >= 70.0) {
      calificacionEstudiante = "C";
    } else if (promedio >= 60.0) {
      calificacionEstudiante = "D";
    } else {
      calificacionEstudiante = "F";
    }

    return calificacionEstudiante;
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
   * @return the promedio
   */
  public double getPromedio() {
    return promedio;
  }

  /**
   * @param promedio the promedio to set
   */
  public void setPromedio(double promedio) {
    if (promedio > 0.0 && promedio <= 100.0) {
      this.promedio = promedio;
    }
  }

}

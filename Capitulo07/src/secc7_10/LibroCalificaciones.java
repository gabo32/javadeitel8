/**
 * LibroCalificaciones.java
 * Creation Date: 16 mar 2021, 16:29:03
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_10;

/**
 * libro de calificaciones
 */

public class LibroCalificaciones {

  private String nombreDelCurso;

  private int[] calificaciones;

  /**
   * Constructor
   * @param nombreDelCurso
   * @param calificaciones
   */
  public LibroCalificaciones(String nombreDelCurso, int[] calificaciones) {
    this.nombreDelCurso = nombreDelCurso;
    this.calificaciones = calificaciones;
  }

  /**
   * Procesa todas las calificaciones
   */
  public void procesarCalificaciones() {
    imprimirCalificaciones();
    System.out.printf("%nEl promedio de la clase es %.2f%n", getPromedio());

    System.out.printf(
      "La calificacion mas baja es %d%nLa calificacion mas alta es %d%n%n", getMinima(),
      getMaxima());

    imprimirGraficoBarras();
  }

  /**
   * Devuelve la menor calificaciones
   * @return
   */
  public int getMinima() {
    int califBaja = calificaciones[0];

    for (int i : calificaciones) {
      if (i < califBaja) {
        califBaja = i;
      }
    }

    return califBaja;
  }

  /**
   * Devuelve la calificacion mas alta
   * @return
   */
  public int getMaxima() {
    int califAlta = calificaciones[0];

    for (int i : calificaciones) {
      if (i > califAlta) {
        califAlta = i;
      }
    }

    return califAlta;
  }

  /**
   * devuelve el promedio
   * @return
   */
  public double getPromedio() {
    int total = 0;

    for (int i : calificaciones) {
      total += i;
    }

    return (double) total / calificaciones.length;
  }

  /**
   * Grafico de calificaciones
   */
  public void imprimirGraficoBarras() {
    System.out.println("Distribucion de calificaciones: ");
    int[] frecuencia = new int[11];

    for (int i : calificaciones) {
      ++frecuencia[i / 10];
    }

    for (int i = 0; i < frecuencia.length; i++) {
      if (i == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
      }

      for (int j = 0; j < frecuencia[i]; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  /**
   * Imprime calificaciones
   */
  public void imprimirCalificaciones() {
    System.out.println("Las calificaciones son: \n\n");

    for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
      System.out.printf("Estudiante %2d: %3d%n", estudiante + 1,
        calificaciones[estudiante]);
    }
  }

  /**
   * @return the nombreDelCurso
   */
  public String getNombreDelCurso() {
    return nombreDelCurso;
  }

  /**
   * @param nombreDelCurso the nombreDelCurso to set
   */
  public void setNombreDelCurso(String nombreDelCurso) {
    this.nombreDelCurso = nombreDelCurso;
  }

}

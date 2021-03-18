/**
 * LibroCalificaciones.java
 * Creation Date: 17 mar 2021, 18:54:56
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_12;

/**
 * Libro de calificaciones
 */

public class LibroCalificaciones {

  private String nombreDelCurso;
  private int[][] calificaciones;

  /**
   * Constructor
   * @param nombreDelCurso
   * @param calificaciones
   */
  public LibroCalificaciones(String nombreDelCurso, int[][] calificaciones) {
    this.nombreDelCurso = nombreDelCurso;
    this.calificaciones = calificaciones;
  }

  /**
   * Procesa las calificaciones
   */
  public void procesarCalificaciones() {
    imprimirCalificaciones();

    System.out.printf("%n%s %d%n%s %d%n%n", "La calificacion mas baja en el libro es: ",
      getMinima(), "La calificacion mas alta en el libro es: ", getMaxima());

    imprimirGraficoBarras();
  }

  /**
   * Devuelve la minima calificaciones
   * @return
   */
  public int getMinima() {
    int califBaja = calificaciones[0][0];

    for (int[] califEstudiantes : calificaciones) {
      for (int calificacion : califEstudiantes) {
        if (calificacion < califBaja) {
          califBaja = calificacion;
        }
      }
    }

    return califBaja;
  }

  /**
   * Devuelve la calificacion mayor
   * @return
   */
  public int getMaxima() {
    int califAlta = calificaciones[0][0];

    for (int[] califEstudiantes : calificaciones) {
      for (int calificacion : califEstudiantes) {
        if (calificacion > califAlta) {
          califAlta = calificacion;
        }
      }
    }

    return califAlta;
  }

  /**
   * Devuelve el promedio de calificaciones
   * @param calificaciones
   * @return
   */
  public double getPromedio(int[] calificaciones) {
    int total = 0;

    for (int calificacion : calificaciones) {
      total += calificacion;
    }

    return (double) total / calificaciones.length;
  }

  /**
   * Imprime las calificaciones
   */
  public void imprimirGraficoBarras() {
    System.out.println("Distribucion de calificaciones en general: ");

    int[] frecuencia = new int[11];
    for (int[] califEstudiantes : calificaciones) {
      for (int calificacion : califEstudiantes) {
        ++frecuencia[calificacion / 10];
      }
    }

    for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
      if (cuenta == 10) {
        System.out.printf("%5d ", 100);
      } else {
        System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
      }

      for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  /**
   * Imprime calificaciones
   */
  public void imprimirCalificaciones() {
    System.out.println("Las calificaciones son: %n%n");
    System.out.print("            ");

    for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
      System.out.printf("Prueba %d ", prueba + 1);
    }

    System.out.println("Promedio");

    for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
      System.out.printf("Estudiante %2d ", estudiante + 1);

      for (int prueba : calificaciones[estudiante]) {
        System.out.printf("%8d", prueba);

        double promedio = getPromedio(calificaciones[estudiante]);
        System.out.printf("%9.2f%n", promedio);
      }
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

  /**
   * @return the calificaciones
   */
  public int[][] getCalificaciones() {
    return calificaciones;
  }

  /**
   * @param calificaciones the calificaciones to set
   */
  public void setCalificaciones(int[][] calificaciones) {
    this.calificaciones = calificaciones;
  }

}

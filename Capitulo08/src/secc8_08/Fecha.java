/**
 * Fecha.java
 * Creation Date: 18 mar 2021, 18:10:55
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
 * Clase fecha
 */

public class Fecha {

  private int mes;
  private int dia;
  private int anio;

  private static final int[] diasPorMes =
    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  /**
   * Constructor de fecha
   * @param mes
   * @param dia
   * @param anio
   */
  public Fecha(int mes, int dia, int anio) {
    if (mes <= 0 || mes >= 12) {
      throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
    }

    if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
      throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes");
    }

    if (mes == 2 && dia == 29
      && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
      throw new IllegalArgumentException(
        "dia (" + dia + ") fuera del rango especificado");
    }

    this.mes = mes;
    this.dia = dia;
    this.anio = anio;

    System.out.println("Constructor de objeto fecha para la fecha " + this);
  }

  @Override
  public String toString() {
    return String.format("%d/%d/%d", mes, dia, anio);
  }
}

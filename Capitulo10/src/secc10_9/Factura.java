/**
 * Factura.java
 * Creation Date: 25 mar 2021, 13:24:26
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
 * Clase Factura
 */

public class Factura implements PorPagar {

  private final String numeroPieza;
  private final String descrpcionPieza;
  private int cantidad;
  private double precioPorArticulo;

  /**
   * Constructor
   * @param numeroPieza
   * @param descrpcionPieza
   * @param cantidad
   * @param precioPorArticulo
   */
  public Factura(String numeroPieza, String descrpcionPieza, int cantidad,
    double precioPorArticulo) {

    if (cantidad < 0) {
      throw new IllegalArgumentException("La cantidad debe ser mayor a cero");
    }

    if (precioPorArticulo < 0.0) {
      throw new IllegalArgumentException("El precio debe ser mayor a cero");
    }

    this.numeroPieza = numeroPieza;
    this.descrpcionPieza = descrpcionPieza;
    this.cantidad = cantidad;
    this.precioPorArticulo = precioPorArticulo;
  }

  @Override
  public double getMontoPago() {
    return getCantidad() * getPrecioPorArticulo();
  }

  /**
   * @return the cantidad
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * @param cantidad the cantidad to set
   */
  public void setCantidad(int cantidad) {
    if (cantidad < 0) {
      throw new IllegalArgumentException("La cantidad debe ser mayor a cero");
    }
    this.cantidad = cantidad;
  }

  /**
   * @return the precioPorArticulo
   */
  public double getPrecioPorArticulo() {
    return precioPorArticulo;
  }

  /**
   * @param precioPorArticulo the precioPorArticulo to set
   */
  public void setPrecioPorArticulo(double precioPorArticulo) {
    if (precioPorArticulo < 0.0) {
      throw new IllegalArgumentException("El precio debe ser mayor a cero");
    }
    this.precioPorArticulo = precioPorArticulo;
  }

  /**
   * @return the numeroPieza
   */
  public String getNumeroPieza() {
    return numeroPieza;
  }

  /**
   * @return the descrpcionPieza
   */
  public String getDescrpcionPieza() {
    return descrpcionPieza;
  }

  @Override
  public String toString() {
    return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "factura",
      "numero de pieza", getNumeroPieza(), getDescrpcionPieza(), "cantidad",
      getCantidad(), "precio por articulo", getPrecioPorArticulo());
  }

}

/**
 * PruebaFiguras.java
 * Creation Date: 11 mar 2021, 18:36:54
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * prueba de las figuras
 */

public class PruebaFiguras {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog(
      "Escriba 1 para dibujar rectangulos\nEscriba 2 para dibujar ovalos");

    int opcion = Integer.parseInt(entrada);

    Figuras panel = new Figuras(opcion);

    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(300, 300);
    aplicacion.setVisible(true);

  }
}

/**
 * PruebaDibujo.java
 * Creation Date: 19 mar 2021, 0:45:50
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

/**
 * dibujar lineas
 */

public class PruebaDibujo {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    PanelDibujo panel = new PanelDibujo();
    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(300, 300);
    aplicacion.setVisible(true);
  }
}

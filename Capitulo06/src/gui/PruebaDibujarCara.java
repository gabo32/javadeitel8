/**
 * PruebaDibujarCara.java
 * Creation Date: 13 mar 2021, 0:09:16
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
 * Dibuja una cara
 */

public class PruebaDibujarCara {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {
    DibujarCaraSonriente panel = new DibujarCaraSonriente();
    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(230, 250);
    aplicacion.setVisible(true);
  }
}

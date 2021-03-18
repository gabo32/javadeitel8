/**
 * PruebaDibujoArcoIris.java
 * Creation Date: 17 mar 2021, 20:45:59
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
 * Prueba de arcoiris
 */

public class PruebaDibujoArcoIris {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    DibujoArcoIris panel = new DibujoArcoIris();
    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(400, 250);
    aplicacion.setVisible(true);
  }
}

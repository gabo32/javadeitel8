/**
 * PruebaPanelDibujo.java
 * Creation Date: 10 mar 2021, 14:06:31
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_18;

import javax.swing.JFrame;

/**
 * prueba de dibujo
 */

public class PruebaPanelDibujo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    PanelDibujo panel = new PanelDibujo();

    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    aplicacion.add(panel);
    aplicacion.setSize(250, 250);
    aplicacion.setVisible(true);
  }
}

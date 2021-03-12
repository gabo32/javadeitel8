/**
 * Figuras.java
 * Creation Date: 11 mar 2021, 18:31:43
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * dibujar cascada de figuras con base en la eleccion del usuario
 */

public class Figuras extends JPanel {

  private static final long serialVersionUID = 1L;
  private int opcion;

  /**
   * Constructor que recibe la opcion del usuario
   * @param opcionUsuario
   */
  public Figuras(int opcionUsuario) {
    this.opcion = opcionUsuario;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    for (int i = 0; i < 10; i++) {

      switch (opcion) {
        case 1:
          g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
          break;
        case 2:
          g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
          break;
      }
    }
  }

}

/**
 * PanelDibujo.java
 * Creation Date: 10 mar 2021, 14:04:14
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc4_18;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Dibujos
 */

public class PanelDibujo extends JPanel {

  /**
   * serial
   */
  private static final long serialVersionUID = -317522635236336091L;

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    int i = 0;
    while (i < anchura) {
      g.drawLine(0, i, i, altura);
      i += 10;
    }

    i = 0;
    while (i < altura) {
      g.drawLine(i, 0, anchura, i);
      i += 10;
    }

    i = 0;
    while (i < altura) {
      g.drawLine(0, altura - i, i, 0);
      i += 10;
    }

    i = 0;
    while (i < altura) {
      g.drawLine(i, altura, anchura, altura - i);
      i += 10;
    }
  }
}

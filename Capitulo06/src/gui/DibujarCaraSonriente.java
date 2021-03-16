/**
 * DibujarCaraSonriente.java
 * Creation Date: 13 mar 2021, 0:05:36
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Dibuja una cara sonriente
 */

public class DibujarCaraSonriente extends JPanel {

  private static final long serialVersionUID = 5278938191552379901L;

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.YELLOW);
    g.fillOval(10, 10, 200, 200);

    g.setColor(Color.BLACK);
    g.fillOval(55, 65, 30, 30);
    g.fillOval(135, 65, 30, 30);

    g.fillOval(50, 110, 120, 60);

    g.setColor(Color.yellow);
    g.fillRect(50, 110, 120, 30);
    g.fillOval(50, 120, 120, 40);
  }
}

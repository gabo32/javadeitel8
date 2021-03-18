/**
 * DibujoArcoIris.java
 * Creation Date: 17 mar 2021, 20:38:18
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
 * Dibuja un arco iris
 */

public class DibujoArcoIris extends JPanel {

  private static final long serialVersionUID = 844216968046745147L;
  private static final Color VIOLETA = new Color(128, 0, 128);
  private static final Color INDIGO = new Color(75, 0, 130);

  private Color[] colores = { Color.white, Color.white, VIOLETA, INDIGO, Color.blue,
    Color.green, Color.yellow, Color.orange, Color.red };

  /**
   * Constructor
   */
  public DibujoArcoIris() {
    setBackground(Color.white);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int radio = 20;
    int centroX = getWidth() / 2;
    int centroY = getHeight() - 10;

    for (int contador = colores.length; contador > 0; contador--) {
      g.setColor(colores[contador - 1]);

      g.fillArc(centroX - contador * radio, centroY - contador * radio,
        contador * radio * 2, contador * radio * 2, 0, 180);
    }
  }
}

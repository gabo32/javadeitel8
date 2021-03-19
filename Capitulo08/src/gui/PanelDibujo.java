/**
 * PanelDibujo.java
 * Creation Date: 19 mar 2021, 0:39:26
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
import java.security.SecureRandom;

import javax.swing.JPanel;

/**
 * dibujar lineas
 */

public class PanelDibujo extends JPanel {
  private static final long serialVersionUID = 6998700046728104647L;
  private SecureRandom numerosAleatorios = new SecureRandom();
  private MiLinea[] lineas;

  /**
   * Constructor
   */
  public PanelDibujo() {
    setBackground(Color.white);

    lineas = new MiLinea[5 + numerosAleatorios.nextInt(5)];

    for (int cuenta = 0; cuenta < lineas.length; cuenta++) {
      int x1 = numerosAleatorios.nextInt(300);
      int y1 = numerosAleatorios.nextInt(300);
      int x2 = numerosAleatorios.nextInt(300);
      int y2 = numerosAleatorios.nextInt(300);

      Color color = new Color(numerosAleatorios.nextInt(256),
        numerosAleatorios.nextInt(256), numerosAleatorios.nextInt(256));

      lineas[cuenta] = new MiLinea(x1, y1, x2, y2, color);

    }
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    for (MiLinea miLinea : lineas) {
      miLinea.dibujar(g);
    }
  }
}

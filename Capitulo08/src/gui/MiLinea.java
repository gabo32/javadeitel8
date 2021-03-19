/**
 * MiLinea.java
 * Creation Date: 19 mar 2021, 0:34:52
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

/**
 * Representa una linea
 */

public class MiLinea {

  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private Color color;

  /**
   * Constructor
   * @param x1
   * @param y1
   * @param x2
   * @param y2
   * @param color
   */
  public MiLinea(int x1, int y1, int x2, int y2, Color color) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.color = color;
  }

  /**
   * Dibuja una linea
   * @param g
   */
  public void dibujar(Graphics g) {
    g.setColor(color);
    g.drawLine(x1, y1, x2, y2);
  }

}

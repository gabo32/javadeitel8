/**
 * DemoLabel.java
 * Creation Date: 23 mar 2021, 12:09:10
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package gui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Demo label
 */

public class DemoLabel {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    JLabel etiquetaNorte = new JLabel("Norte");

    ImageIcon etiquetaIcono = new ImageIcon("GUItip.gif");

    JLabel etiquetaCentro = new JLabel(etiquetaIcono);

    JLabel etiquetaSur = new JLabel(etiquetaIcono);
    etiquetaSur.setText("Sur");

    JFrame aplicacion = new JFrame();

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    aplicacion.add(etiquetaNorte, BorderLayout.NORTH);
    aplicacion.add(etiquetaCentro, BorderLayout.CENTER);
    aplicacion.add(etiquetaSur, BorderLayout.SOUTH);

    aplicacion.setSize(300, 300);
    aplicacion.setVisible(true);
  }
}

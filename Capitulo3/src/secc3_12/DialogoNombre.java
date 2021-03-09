/**
 * DialogoNombre.java
 * Creation Date: 9 mar 2021, 15:13:44
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc3_12;

import javax.swing.JOptionPane;

/**
 * Entrada basica con un cuadro de dialogo
 */

public class DialogoNombre {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");

    String mensaje = String.format("Bienvenido, %s, a la programacion en Java!", nombre);

    JOptionPane.showMessageDialog(null, mensaje);
  }
}

/**
 * Carta.java
 * Creation Date: 16 mar 2021, 15:33:16
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_06;

/**
 * Carta de un juego
 */

public class Carta {

  private final String cara;
  private final String palo;

  /**
   * Constructor
   * @param cara
   * @param palo
   */
  public Carta(String cara, String palo) {
    this.cara = cara;
    this.palo = palo;
  }

  @Override
  public String toString() {
    return cara + " de " + palo;
  }
}

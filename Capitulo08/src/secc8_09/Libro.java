/**
 * Libro.java
 * Creation Date: 18 mar 2021, 18:37:39
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_09;

/**
 * Enum libor
 */

public enum Libro {

  /**
   * Enum
   */
  JHTP("Java how to program", "2015"),
  /**
   * Enum
   */
  CHTP("C how to program", "2013"),
  /**
   * Enum
   */
  IW3HTP("Internet & www to program", "2012"),
  /**
   * Enum
   */
  CPPHTP("C++ how to program", "2014"),
  /**
   * Enum
   */
  VBHTP("Visual C# how to program", "2014"),
  /**
   * Enum
   */
  CSHARPHTP("Visual C# how to pgrama", "2014");

  private final String titulo;
  private final String anioCopyright;

  Libro(String titulo, String anioCopyrigth) {
    this.titulo = titulo;
    this.anioCopyright = anioCopyrigth;
  }

  /**
   * @return the titulo
   */
  public String getTitulo() {
    return titulo;
  }

  /**
   * @return the anioCopyright
   */
  public String getAnioCopyright() {
    return anioCopyright;
  }

}

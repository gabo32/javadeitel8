/**
 * PaqueteDeCartas.java
 * Creation Date: 16 mar 2021, 15:34:54
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_06;

import java.security.SecureRandom;

/**
 * paquete de cartas
 */

public class PaqueteDeCartas {

  private Carta[] paquete;
  private int cartaActual;
  private static final int NUMERO_DE_CARTAS = 52;

  private static final SecureRandom numerosAleatorios = new SecureRandom();

  /**
   * constructor
   */
  public PaqueteDeCartas() {

    String[] caras = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO",
      "NUEVE", "DIEZ", "JOKER", "REINA", "REY" };
    String[] palos = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS" };

    paquete = new Carta[NUMERO_DE_CARTAS];
    cartaActual = 0;

    for (int i = 0; i < paquete.length; i++) {
      paquete[i] = new Carta(caras[i % 13], palos[i / 13]);
    }
  }

  /**
   * Barajea las dos cartas
   */
  public void barajar() {
    cartaActual = 0;

    for (int i = 0; i < paquete.length; i++) {
      int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

      Carta tmp = paquete[i];
      paquete[i] = paquete[segunda];
      paquete[segunda] = tmp;
    }
  }

  /**
   * Devuelve una carta
   * @return
   */
  public Carta repartirCarta() {
    if (cartaActual < paquete.length) {
      return paquete[cartaActual++];
    } else {
      return null;
    }
  }
}

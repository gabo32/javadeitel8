/**
 * Craps.java
 * Creation Date: 12 mar 2021, 23:28:01
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc6_10;

import java.security.SecureRandom;

/**
 * Juego craps
 */

public class Craps {

  // crea un generador de numeros aleatorios seguros para usar
  private static final SecureRandom numerosAleatorios = new SecureRandom();

  // enumaracion con constantes que representan el estado del juego
  private enum Estado {
    CONTINUA, GANO, PERDIO
  };

  // constantes que representan tis
  private static final int DOS_UNOS = 2;
  private static final int TRES = 3;
  private static final int SIETE = 7;
  private static final int ONCE = 11;
  private static final int DOCE = 12;

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    int miPunto = 0;
    Estado estadoJuego;

    int sumaDeDados = tirarDados();

    switch (sumaDeDados) {
      case SIETE:
      case ONCE:
        estadoJuego = Estado.GANO;
        break;
      case DOS_UNOS:
      case TRES:
      case DOCE:
        estadoJuego = Estado.PERDIO;
        break;
      default:
        estadoJuego = Estado.CONTINUA;
        miPunto = sumaDeDados;
        System.out.printf("El punto es %d%n ", miPunto);
    }

    while (estadoJuego == Estado.CONTINUA) {
      sumaDeDados = tirarDados();

      if (sumaDeDados == miPunto) {
        estadoJuego = Estado.GANO;
      } else if (sumaDeDados == SIETE) {
        estadoJuego = Estado.PERDIO;
      }

    }

    if (estadoJuego == Estado.GANO) {
      System.out.println("El jugador gana");
    } else {
      System.out.println("El jugador pierde");
    }
  }

  /**
   * Tira 2 datos
   * @return
   */
  public static int tirarDados() {
    int dado1 = 1 + numerosAleatorios.nextInt(6);
    int dado2 = 1 + numerosAleatorios.nextInt(6);

    int suma = dado1 + dado2;

    System.out.printf("El jugador tiro %d + %d = %d%n ", dado1, dado2, suma);

    return suma;
  }
}

/**
 * InicArreglo.java
 * Creation Date: 17 mar 2021, 20:08:18
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_14;

/**
 * uso de parametros en la linea de comandos
 */

public class InicArreglo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    if (args.length != 3) {
      System.out.println("Error: vuelva a escriir el coamando completo");
    } else {
      int longitudArreglo = Integer.parseInt(args[0]);
      int[] arreglo = new int[longitudArreglo];
      int valorInicial = Integer.parseInt(args[1]);
      int incremento = Integer.parseInt(args[2]);

      for (int contador = 0; contador < arreglo.length; contador++) {
        arreglo[contador] = valorInicial + incremento * contador;
      }

      System.out.printf("%s%8s%n", "Indice", "valor");

      for (int contador = 0; contador < arreglo.length; contador++) {
        System.out.printf("%5d%8d%n", contador, arreglo[contador]);
      }
    }
  }
}

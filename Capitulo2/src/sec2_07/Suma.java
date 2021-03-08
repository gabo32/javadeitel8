/**
 * Suma.java
 * Creation Date: 8 mar 2021, 13:59:28
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package sec2_07;

import java.util.Scanner;

/**
 * Suma de 2 enteros
 */
public class Suma {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    // crea objeto Scanner para obtener la entrada de la ventana de comandos
    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);

    int numero1;
    int numero2;
    int suma;

    System.out.print("Escriba el primer entero: ");
    numero1 = entrada.nextInt(); // lee el primer numero

    System.out.print("Escriba el segundo numero entero: ");
    numero2 = entrada.nextInt();

    // sumamos
    suma = numero1 + numero2;

    System.out.printf("La suma es %d%n", suma);
    entrada.close();
  }
}

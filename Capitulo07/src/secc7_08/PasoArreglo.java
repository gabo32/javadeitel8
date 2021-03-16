/**
 * PasoArreglo.java
 * Creation Date: 16 mar 2021, 15:52:26
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_08;

/**
 * paso de arreglos y elementos individuales de un arreglo a los metodos
 */

public class PasoArreglo {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    int[] arreglo = { 1, 2, 3, 4, 5 };

    System.out.println("Efectos de pasar una referencia a un arreglo completo: \n"
      + "Los valores del arreglo original son: \n");

    for (int i : arreglo) {
      System.out.printf("    %d", i);
    }

    modificarArreglo(arreglo);
    System.out.println("\n\nLos valores del arreglo modificado son: \n");
    for (int i : arreglo) {
      System.out.printf("    %d", i);
    }

    System.out.printf("\n\nEfectos de pasar el valor de un elemento del arreglo: \n"
      + "arreglo[3] antes de modificarElemento: %d%n", arreglo[3]);

    modificarElemento(arreglo[3]);
    System.out.printf("\n\nEfectos de pasar el valor de un elemento del arreglo: \n"
      + "arreglo[3] despues de  modificarElemento: %d%n", arreglo[3]);
  }

  /**
   * Modifica un arreglo
   * @param arreglo2
   */
  public static void modificarArreglo(int[] arreglo2) {
    for (int i = 0; i < arreglo2.length; i++) {
      arreglo2[i] *= 2;
    }
  }

  /**
   * Modifica un elemento
   * @param elemento
   */
  public static void modificarElemento(int elemento) {
    elemento *= 2;
    System.out.println("El valor del elemento modificado es: " + elemento);
  }

}

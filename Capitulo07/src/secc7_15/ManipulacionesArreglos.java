/**
 * ManipulacionesArreglos.java
 * Creation Date: 17 mar 2021, 20:16:11
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc7_15;

import java.util.Arrays;

/**
 * Manipulacion de arreglos
 */

public class ManipulacionesArreglos {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    double[] arregloDouble = { 8.4, 9.3, 0.2, 7.9, 3.4 };
    Arrays.sort(arregloDouble);
    System.out.printf("%narregloDouble: ");

    for (double d : arregloDouble) {
      System.out.printf("%.1f", d);
    }

    int[] arregloIntLleno = new int[10];
    Arrays.fill(arregloIntLleno, 7);
    mostrarArreglo(arregloIntLleno, "arreglointlleno");

    int[] arregloInt = { 1, 2, 3, 4, 5, 6 };
    int[] copiaArregloInt = new int[arregloInt.length];
    System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
    mostrarArreglo(arregloInt, "Arregloint");
    mostrarArreglo(copiaArregloInt, "copiaArregloin");

    boolean b = Arrays.equals(arregloInt, copiaArregloInt);
    System.out.printf("%n%narregloint %s copial arregloint%n", (b ? " == " : "!="));

    b = Arrays.equals(arregloInt, arregloIntLleno);
    System.out.printf("%n%narregloint %s arreglo int lleno%n", (b ? " == " : "!="));

    int ubicacion = Arrays.binarySearch(arregloInt, 5);
    if (ubicacion >= 0) {
      System.out.printf("Se encontro 5 en el elemento %d de arregloint", ubicacion);
    } else {
      System.out.println("No se encontro el 5");
    }

    ubicacion = Arrays.binarySearch(arregloInt, 8763);
    if (ubicacion >= 0) {
      System.out.printf("Se encontro 8763 en el elemento %d de arregloint", ubicacion);
    } else {
      System.out.println("No se encontro el 5");
    }
  }

  /**
   * Imrpime un arreglo
   * @param arreglo
   * @param descripcion
   */
  public static void mostrarArreglo(int[] arreglo, String descripcion) {
    System.out.printf("%n%s", descripcion);

    for (int i : arreglo) {
      System.out.printf("%d ", i);
    }
  }

}

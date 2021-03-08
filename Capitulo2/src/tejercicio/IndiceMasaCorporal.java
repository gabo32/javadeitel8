/**
 * IndiceMasaCorporal.java
 * Creation Date: 8 mar 2021, 15:45:09
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package tejercicio;

import java.util.Scanner;

/**
 * Calcula el indice de masa corporal
 */

public class IndiceMasaCorporal {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String... args) {

    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);
    int peso;
    double altura;
    double bmi;

    System.out.print("Introduzca el peso en kg: ");
    peso = entrada.nextInt();

    System.out.print("Introduzca la altura en metros: ");
    altura = entrada.nextDouble();

    bmi = peso / (altura * altura);

    System.out.println("VALORES DE BMI : " + bmi);
    if (bmi < 18.5) {
      System.out.println("Bajo de peso");
    }

    if (bmi >= 18.5 && bmi <= 24.9) {
      System.out.println("Normal");
    }

    if (bmi > 25 && bmi < 29.9) {
      System.out.println("sobrepeso");
    }

    if (bmi >= 30) {
      System.out.println("obesidad");
    }

  }
}

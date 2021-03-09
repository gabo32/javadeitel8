/**
 * PruebaCuenta.java
 * Creation Date: 9 mar 2021, 14:12:04
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc3_2;

import java.util.Scanner;

/**
 * Clase de prueba
 */

public class PruebaCuenta {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    Cuenta cuenta1 = new Cuenta("Gabo1", 50.00);
    Cuenta cuenta2 = new Cuenta("Gabo2", -7.53);

    System.out.printf("El saldo de %s: $%.2f%n", cuenta1.getNombre(), cuenta1.getSaldo());
    System.out.printf("El saldo de %s: $%.2f%n", cuenta2.getNombre(), cuenta2.getSaldo());

    @SuppressWarnings("resource")
    Scanner entrada = new Scanner(System.in);

    System.out.println("Escriba el monto a depostar para la cuenta1: ");
    double montoDeposito = entrada.nextDouble();

    System.out.printf("%n sumando %.2f al saldo de la cuenta1 %n%n ", montoDeposito);
    cuenta1.depositar(montoDeposito);

    System.out.printf("El saldo de %s: $%.2f%n", cuenta1.getNombre(), cuenta1.getSaldo());
    System.out.printf("El saldo de %s: $%.2f%n", cuenta2.getNombre(), cuenta2.getSaldo());

    System.out.println("Escriba el monto a depostar para la cuenta2: ");
    montoDeposito = entrada.nextDouble();

    System.out.printf("%n sumando %.2f al saldo de la cuenta2 %n%n ", montoDeposito);
    cuenta2.depositar(montoDeposito);

    System.out.printf("El saldo de %s: $%.2f%n", cuenta1.getNombre(), cuenta1.getSaldo());
    System.out.printf("El saldo de %s: $%.2f%n", cuenta2.getNombre(), cuenta2.getSaldo());

  }
}

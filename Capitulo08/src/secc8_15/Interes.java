/**
 * Interes.java
 * Creation Date: 19 mar 2021, 0:18:40
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc8_15;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * uso de bigdecimal
 */

public class Interes {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {
    BigDecimal principal = BigDecimal.valueOf(1000.0);
    BigDecimal tasa = BigDecimal.valueOf(0.05);

    System.out.printf("%s%20s%n", "anio", "Monto en deposito");

    for (int anio = 0; anio <= 10; anio++) {
      BigDecimal monto = principal.multiply(tasa.add(BigDecimal.ONE).pow(anio));

      System.out.printf("%4d%20s%n", anio,
        NumberFormat.getCurrencyInstance().format(monto));
    }
  }
}

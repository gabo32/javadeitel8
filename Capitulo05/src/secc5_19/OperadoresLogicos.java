/**
 * OperadoresLogicos.java
 * Creation Date: 11 mar 2021, 17:30:24
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc5_19;

/**
 * Operadores logicos
 */

public class OperadoresLogicos {

  /**
   * metodo principal
   * @param args
   */
  @SuppressWarnings("unused")
  public static void main(String[] args) {

    // tabla de verdad para &&
    System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s %b%n%n", "AND condicional (&&)",
      "false && false", (false && false), "false && true", (false && true),
      "true  && false", (true && false), "true  && true", (true && true));

    // tabla de verdad para ||
    System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s %b%n%n", "OR condicional (||)",
      "false || false", (false || false), "false || true", (false || true),
      "true  || false", (true || false), "true  || true", (true || true));

    // tabla de verdad para &
    System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s %b%n%n", "AND logico (&)",
      "false & false", (false & false), "false & true", (false & true), "true  & false",
      (true & false), "true  & true", (true & true));

    // tabla de verdad para |
    System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s %b%n%n", "OR logico (|)",
      "false | false", (false | false), "false | true", (false | true), "true  | false",
      (true | false), "true  | true", (true | true));

    // tabla de verdad para ||
    System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s %b%n%n", "OR exclusivo (^)",
      "false ^ false", (false ^ false), "false ^ true", (false ^ true), "true  ^ false",
      (true ^ false), "true  ^ true", (true ^ true));

    // tabla de verdad para ||
    System.out.printf("%s%n%s: %b%n%s: %b%n%n", "NOt logico (!)", "!false", (!false),
      "!true", (!true));

  }
}

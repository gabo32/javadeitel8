/**
 * PruebaSistemaNomina.java
 * Creation Date: 23 mar 2021, 13:44:46
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc10_5;

/**
 * Sistema de nomina
 */

public class PruebaSistemaNomina {

  /**
   * metodo principal
   * @param args
   */
  public static void main(String[] args) {

    EmpleadoAsalariado empleadoAsalariado =
      new EmpleadoAsalariado("John", "Smith", "111-11-111", 800.00);
    EmpleadoPorHoras empleadoPorHoras =
      new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
    EmpleadoPorComision empleadoPorComision =
      new EmpleadoPorComision("Sue", "jones", "333-333-3333", 10000, .06);
    EmpleadoBaseMasComision empleadoBaseMasComision =
      new EmpleadoBaseMasComision("Bob", "lewis", "444-44-4444", 5000, .04, 300);

    System.out.println("Empleados procesados por separado");

    System.out.printf("%n%s%n%s: $%,.2f%n%n", empleadoAsalariado, "ingresos",
      empleadoAsalariado.ingresos());
    System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorHoras, "ingresos",
      empleadoPorHoras.ingresos());
    System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorComision, "ingresos",
      empleadoPorComision.ingresos());
    System.out.printf("%s%n%s: $%,.2f%n%n", empleadoBaseMasComision, "ingresos",
      empleadoBaseMasComision.ingresos());

    Empleado[] empleados = new Empleado[4];
    empleados[0] = empleadoAsalariado;
    empleados[1] = empleadoPorHoras;
    empleados[2] = empleadoPorComision;
    empleados[3] = empleadoBaseMasComision;

    System.out.println("Empleados procesados en forma polimorfica \n\n");

    for (Empleado empleadoActual : empleados) {
      System.out.println(empleadoActual);

      if (empleadoActual instanceof EmpleadoBaseMasComision) {
        EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
        empleado.setSalarioBase(1.10 * empleado.getSalarioBase());

        System.out.println(
          "El nuevo salario base con 10% de aumento es " + empleado.getSalarioBase());
      }

      System.out.printf("Ingresos $%,.2f%n%n", empleadoActual.ingresos());
    }

    for (int i = 0; i < empleados.length; i++) {
      System.out.printf("El empleado %d es un %s%n", i,
        empleados[i].getClass().getName());
    }
  }
}

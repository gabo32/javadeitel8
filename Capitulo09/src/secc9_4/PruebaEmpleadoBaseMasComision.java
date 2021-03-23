/**
 * PruebaEmpleadoPorComision.java
 * Creation Date: 22 mar 2021, 23:16:15
 *
 * Copyright (C) 2019,2021 The {COMPANY_NAME} and/or its affiliates.
 * All rights reserved. {COMPANY_NAME}/CONFIDENTIAL.
 * Use of this software is subject to the license terms.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package secc9_4;

/**
 * Prueba de la clase empleado
 */

public class PruebaEmpleadoBaseMasComision {

  /**
   * Metodo principal
   * @param args
   */
  public static void main(String[] args) {

    EmpleadoBaseMasComision empleado =
      new EmpleadoBaseMasComision("Bob", "Lewis", "333-33-333", 5000, 0.04, 300);

    System.out.println("Informacion del empleado obtenida por los metodos set: ");
    System.out.printf("%n%s %s%n", "El primer nombre es: ", empleado.getPrimerNombre());
    System.out.printf("%n%s %s%n", "El apellido es: ", empleado.getApellidoPaterno());
    System.out.printf("%n%s %s%n", "El numero de seguro social es: ",
      empleado.getNumeroSeguroSocial());
    System.out.printf("%n%s %.2f%n", "Las ventas brutas son: ",
      empleado.getVentasBrutas());
    System.out.printf("%n%s %.2f%n", "La tafica de comision es: ",
      empleado.getTarifaComision());
    System.out.printf("%n%s %.2f%n", "Salario base es: ", empleado.getSalarioBase());

    empleado.setVentasBrutas(500);
    empleado.setTarifaComision(.1);

    System.out.printf("%n%s:%n%n%s%n", "Infromacion actualizada del empleado", empleado);
  }
}

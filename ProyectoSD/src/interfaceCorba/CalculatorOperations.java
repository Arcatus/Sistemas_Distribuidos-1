
package interfaceCorba;

/**
* interfaceCorba/CalculatorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interfaz.idl
* martes 27 de febrero de 2018 08:33:19 PM CST
*/

public interface CalculatorOperations 
{
  float add (float nb1, float nb2);
  float div (float nb1, float nb2) throws interfaceCorba.DivisionPorCero;
} // interface CalculatorOperations

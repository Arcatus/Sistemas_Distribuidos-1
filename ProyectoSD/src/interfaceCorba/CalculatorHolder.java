
package interfaceCorba;

/**
* interfaceCorba/CalculatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interfaz.idl
* martes 27 de febrero de 2018 08:33:19 PM CST
*/

public final class CalculatorHolder implements org.omg.CORBA.portable.Streamable
{
  public interfaceCorba.Calculator value = null;

  public CalculatorHolder ()
  {
  }

  public CalculatorHolder (interfaceCorba.Calculator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = interfaceCorba.CalculatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    interfaceCorba.CalculatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return interfaceCorba.CalculatorHelper.type ();
  }

}

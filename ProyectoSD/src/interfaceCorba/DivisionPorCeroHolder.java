package interfaceCorba;
/**
* interfaceCorba/DivisionPorCeroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interfaz.idl
* martes 27 de febrero de 2018 08:33:19 PM CST
*/

public final class DivisionPorCeroHolder implements org.omg.CORBA.portable.Streamable
{
  public interfaceCorba.DivisionPorCero value = null;

  public DivisionPorCeroHolder ()
  {
  }

  public DivisionPorCeroHolder (interfaceCorba.DivisionPorCero initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = interfaceCorba.DivisionPorCeroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    interfaceCorba.DivisionPorCeroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return interfaceCorba.DivisionPorCeroHelper.type ();
  }

}
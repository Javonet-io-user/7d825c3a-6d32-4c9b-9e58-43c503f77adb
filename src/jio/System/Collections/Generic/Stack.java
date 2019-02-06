package jio.System.Collections.Generic;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;

public class Stack<T>
    implements jio.System.Collections.Generic.IEnumerable<T>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.ICollection,
        IReadOnlyCollection<T>,
        Iterable<T> {
  protected NObject javonetHandle;

  @Override
  public Iterator<T> iterator() {
    return (Iterator<T>) this.GetEnumerator();
  }
  /** GenericConstructor */

  public Stack(Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.Stack`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Stack(java.lang.Integer capacity, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.Stack`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Stack(jio.System.Collections.Generic.IEnumerable<T> collection, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.Stack`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Stack(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Object GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object get_SyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

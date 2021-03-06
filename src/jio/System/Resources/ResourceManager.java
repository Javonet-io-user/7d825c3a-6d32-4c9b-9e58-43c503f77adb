package jio.System.Resources;

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
import jio.System.Resources.*;
import jio.System.Reflection.*;
import jio.System.*;

public class ResourceManager {
  public NObject javonetHandle;

  public ResourceManager(java.lang.String baseName, Assembly assembly) {
    try {
      javonetHandle = Javonet.New("System.Resources.ResourceManager", baseName, assembly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ResourceManager(
      java.lang.String baseName, Assembly assembly, jio.System.Type usingResourceSet) {
    try {
      javonetHandle =
          Javonet.New("System.Resources.ResourceManager", baseName, assembly, usingResourceSet);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ResourceManager(jio.System.Type resourceSource) {
    try {
      javonetHandle = Javonet.New("System.Resources.ResourceManager", resourceSource);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ResourceManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

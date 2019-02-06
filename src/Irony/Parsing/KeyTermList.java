package Irony.Parsing;

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
import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class KeyTermList extends List<KeyTerm>
    implements jio.System.Collections.Generic.IList<KeyTerm>,
        jio.System.Collections.Generic.ICollection<KeyTerm>,
        jio.System.Collections.Generic.IEnumerable<KeyTerm>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<KeyTerm>,
        IReadOnlyCollection<KeyTerm> {
  protected NObject javonetHandle;

  public KeyTermList() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.KeyTermList");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyTermList(NObject handle) {
    super(handle);
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

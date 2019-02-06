package combit.ListLabel24.DesignerExtensions;

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
import combit.ListLabel24.DesignerExtensions.*;
import jio.System.*;

public interface ILlStream {
  public java.lang.Integer Read(
      java.lang.Integer pv, java.lang.Integer cb, AtomicReference<java.lang.Integer> pcbRead);

  public java.lang.Integer Write(
      java.lang.Integer pv, java.lang.Integer cb, AtomicReference<java.lang.Integer> pcbWritten);

  public java.lang.Integer Seek(
      java.lang.Long dlibMove,
      java.lang.Integer dwOrigin,
      AtomicReference<java.lang.Long> plibNewPosition);
}

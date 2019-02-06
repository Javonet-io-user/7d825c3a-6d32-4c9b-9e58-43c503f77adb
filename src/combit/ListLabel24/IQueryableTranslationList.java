package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public interface IQueryableTranslationList
    extends ITranslationList,
        jio.System.Collections.Generic.IEnumerable<java.lang.Integer>,
        jio.System.Collections.IEnumerable {
  public java.lang.Boolean Contains(java.lang.String itemName);

  public java.lang.String GetItemDisplayName(
      java.lang.String itemName, java.lang.Boolean returnItemIfNotFound, java.lang.Integer LCID);

  public java.lang.String GetItemDisplayName(
      java.lang.String itemName, java.lang.Boolean returnItemIfNotFound);

  public java.lang.String GetItemDisplayName(java.lang.String itemName);
}

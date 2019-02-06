package combit.ListLabel24.Repository;

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
import combit.ListLabel24.Repository.*;
import jio.System.*;

public interface ILlRepository {
  public java.lang.Integer DefineItems(
      java.lang.Integer debugSink, ILLRepositoryItemSink itemsList);

  public java.lang.Integer Load(
      java.lang.Integer debugSink, java.lang.String id, java.lang.Integer destinationStream);

  public java.lang.Integer Save(
      java.lang.Integer debugSink,
      java.lang.String id,
      java.lang.String type,
      java.lang.String userDefinedID,
      java.lang.Integer nativeStream,
      java.lang.String itemDescriptor);

  public java.lang.Integer Delete(java.lang.Integer debugSink, java.lang.String id);

  public java.lang.Integer GetInfo(
      java.lang.Integer debugSink, java.lang.String id, RepositoryItemInfo infoType, Object Info);

  public java.lang.Integer AbortLoad(java.lang.Integer debugSink, java.lang.String id);

  public java.lang.Integer Lock(java.lang.Integer debugSink, java.lang.String id);

  public java.lang.Integer Unlock(java.lang.Integer debugSink, java.lang.String id);
}

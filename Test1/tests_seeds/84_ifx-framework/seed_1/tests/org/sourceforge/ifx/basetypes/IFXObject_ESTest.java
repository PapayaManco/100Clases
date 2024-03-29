/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 10 02:34:11 GMT 2024
 */

package org.sourceforge.ifx.basetypes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sourceforge.ifx.basetypes.IFXBase64Binary;
import org.sourceforge.ifx.basetypes.IFXDecimal;
import org.sourceforge.ifx.basetypes.IFXHexBinary;
import org.sourceforge.ifx.basetypes.IFXObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IFXObject_ESTest extends IFXObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IFXObject iFXObject0 = new IFXObject();
      IFXObject iFXObject1 = new IFXObject();
      boolean boolean0 = iFXObject0.equals(iFXObject1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IFXHexBinary iFXHexBinary0 = new IFXHexBinary();
      // Undeclared exception!
      try { 
        iFXHexBinary0.equals(iFXHexBinary0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IFXObject iFXObject0 = new IFXObject();
      IFXDecimal iFXDecimal0 = new IFXDecimal();
      boolean boolean0 = iFXObject0.equals(iFXDecimal0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IFXBase64Binary iFXBase64Binary0 = new IFXBase64Binary();
      iFXBase64Binary0.setString("");
      String string0 = iFXBase64Binary0.toString();
      assertEquals("org.sourceforge.ifx.basetypes.IFXBase64Binary = {\n  Bytes = [\n\n  ]\n  String = Exception! java.lang.ClassCastException: class java.lang.String cannot be cast to class org.sourceforge.ifx.basetypes.IFXObject (java.lang.String is in module java.base of loader 'bootstrap'; org.sourceforge.ifx.basetypes.IFXObject is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @6d86a9ef)\n}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IFXBase64Binary iFXBase64Binary0 = new IFXBase64Binary();
      iFXBase64Binary0.setString("yyyy-MM-dd'T'HH:mm:ss");
      String string0 = iFXBase64Binary0.toString();
      assertEquals("org.sourceforge.ifx.basetypes.IFXBase64Binary = {\n  Bytes = [\n    [0]:Exception! java.lang.ClassCastException: class java.lang.Byte cannot be cast to class org.sourceforge.ifx.basetypes.IFXObject (java.lang.Byte is in module java.base of loader 'bootstrap'; org.sourceforge.ifx.basetypes.IFXObject is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @6d86a9ef)\n  }", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IFXBase64Binary iFXBase64Binary0 = new IFXBase64Binary();
      String string0 = iFXBase64Binary0.toString();
      assertEquals("org.sourceforge.ifx.basetypes.IFXBase64Binary = {\n  Bytes = NULL\n  String = Exception! java.lang.reflect.InvocationTargetException\n}", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IFXObject iFXObject0 = new IFXObject();
      Object object0 = new Object();
      boolean boolean0 = iFXObject0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IFXObject iFXObject0 = new IFXObject();
      String string0 = iFXObject0.toString();
      assertEquals("org.sourceforge.ifx.basetypes.IFXObject = {\n}", string0);
  }
}

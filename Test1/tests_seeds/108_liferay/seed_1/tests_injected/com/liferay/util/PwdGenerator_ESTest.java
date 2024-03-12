/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 10:26:20 GMT 2024
 */

package com.liferay.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.util.PwdGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PwdGenerator_ESTest extends PwdGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = PwdGenerator.getSecurePassword("9m@", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = PwdGenerator.getPassword("=x'FJu/", 1223, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = PwdGenerator.getPassword("com.liferay.util.PwdGenerator", 0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = PwdGenerator.getPassword("com.liferay.portal.kernel.log.Jdk14LogFactoryImpl", 4);
      assertEquals("clar", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = PwdGenerator.getPassword("CV]Dbahs(Ob}`Wo`7", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = PwdGenerator.getPassword(117);
      assertEquals("06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVbhnt06CIOVb", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      PwdGenerator.getSecurePassword("06CIOVbh", 1640531527, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword("", 718, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword((String) null, 20, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword("06CIOVbh", (-460), true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      PwdGenerator.getSecurePassword("06CIOVbh", 32767);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword((String) null, (-497));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword("com.liferay.portal.kernel.log.Jdk14LogFactoryImpl", (-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword((-122713351));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Random.setNextRandom((-2147483647));
      // Undeclared exception!
      try { 
        PwdGenerator.getPinNumber();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getPassword("", 1068, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getPassword("", 1247);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getPassword((String) null, 85);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getPassword("\u0000", (-2436));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      PwdGenerator.getPassword(1640531527);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Random.setNextRandom(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        PwdGenerator.getPassword();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 4;
      PwdGenerator.getSecurePassword(int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = PwdGenerator.getSecurePassword(5057);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = PwdGenerator.getSecurePassword("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 92, true);
      assertEquals("ACFHKNPSUXACFHKNPSUXACFHKNPSUXACFHKNPSUXACFHKNPSUXACFHKNPSUXACFHKNPSUXACFHKNPSUXACFHKNPSUXAC", string0);
      
      String string1 = PwdGenerator.getPassword();
      assertEquals("06CIOVbh", string1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PwdGenerator.getSecurePassword("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 5057);
      // Undeclared exception!
      PwdGenerator.getSecurePassword(5057);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword("lKF(", (-1422), false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getPassword((-2319));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = PwdGenerator.getPinNumber();
      assertEquals("0123", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      PwdGenerator.getPassword("06CIOVbh", 32767);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PwdGenerator.getPassword();
      // Undeclared exception!
      try { 
        PwdGenerator.getPassword("06CIOVbh", (-345), true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        PwdGenerator.getSecurePassword("", 668);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PwdGenerator pwdGenerator0 = new PwdGenerator();
      assertEquals("abcdefghijklmnopqrstuvwxyz", pwdGenerator0.getKEY3KEYINJECTED());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      PwdGenerator.getPassword("O~Vd>&@:Wft4n9\"a)e", 1640531527, true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = PwdGenerator.getSecurePassword();
      assertEquals("06CIOVbh", string0);
  }
}

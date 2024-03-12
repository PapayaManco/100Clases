/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 11:26:42 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Capture_ESTest extends Capture_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Capture capture0 = new Capture();
      // Undeclared exception!
      try { 
        capture0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Capture", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Capture capture0 = new Capture();
      // Undeclared exception!
      try { 
        capture0.DV_Capture();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Capture", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Capture capture0 = new Capture();
      // Undeclared exception!
      try { 
        capture0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Capture", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Capture capture0 = new Capture(140, (-240), (GUI) null);
  }
}

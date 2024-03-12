/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 07:56:28 GMT 2024
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Search;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Search_ESTest extends Search_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "{nT$T!nq44)";
      stringArray0[1] = "";
      Search.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = Search.formatPattern("The formatted pattern is:\n");
      assertEquals("*[Tt][Hh][Ee]*[Ff][Oo][Rr][Mm][Aa][Tt][Tt][Ee][Dd]*[Pp][Aa][Tt][Tt][Ee][Rr][Nn]*[Ii][Ss]:*", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Search.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Search.formatPattern((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Search.formatPattern("");
      assertEquals("*", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Search.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = Search.formatPattern("*");
      assertNotNull(string0);
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Search search0 = new Search();
  }
}

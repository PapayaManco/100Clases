/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 11:07:41 GMT 2024
 */

package de.beiri22.stringincrementor.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.beiri22.stringincrementor.helper.IndexedString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IndexedString_ESTest extends IndexedString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("Pdo%u*(?GFH>, Gh");
      char[] charArray0 = new char[7];
      charArray0[0] = '?';
      charArray0[1] = '';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("Pdo%u*(?GFH>, Gh");
      char[] charArray0 = new char[1];
      charArray0[0] = '(';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("Hdy");
      // Undeclared exception!
      try { 
        indexedString0.indexOf((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.beiri22.stringincrementor.helper.IndexedString", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("[@/x/!");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        indexedString0.indexOf(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("de.beiri22.stringincrementor.helper.IndexedString", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("de.beiri22.stringincrementor.helper.IndexedString");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IndexedString indexedString0 = null;
      try {
        indexedString0 = new IndexedString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("Pdo%u*(?GFH>, Gh");
      char[] charArray0 = new char[5];
      charArray0[0] = '(';
      charArray0[1] = '?';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("PdJ%u*(?GH>, Gh");
      char[] charArray0 = new char[8];
      charArray0[0] = '?';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("#-%j{b;,");
      char[] charArray0 = new char[13];
      charArray0[0] = 'b';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("Pdo%u*(?GFH>, Gh");
      char[] charArray0 = new char[1];
      charArray0[0] = 'P';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals(0, int0);
  }
}

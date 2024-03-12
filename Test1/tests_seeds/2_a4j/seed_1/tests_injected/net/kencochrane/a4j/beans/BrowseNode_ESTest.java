/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 10:51:39 GMT 2024
 */

package net.kencochrane.a4j.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import net.kencochrane.a4j.beans.BrowseNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BrowseNode_ESTest extends BrowseNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      BrowseNode browseNode1 = new BrowseNode();
      browseNode1.addSubNode(browseNode0);
      browseNode1.printNode();
      assertNotSame(browseNode1, browseNode0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      BrowseNode browseNode1 = new BrowseNode();
      arrayList0.add((Object) browseNode0);
      browseNode1.setSubNodes(arrayList0);
      browseNode0.setBrowseId("");
      BrowseNode browseNode2 = browseNode1.getSubNode("");
      assertNotNull(browseNode2);
      assertNotSame(browseNode2, browseNode1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      BrowseNode browseNode1 = new BrowseNode();
      arrayList0.add((Object) browseNode0);
      browseNode1.setSubNodes(arrayList0);
      // Undeclared exception!
      try { 
        browseNode1.getSubNode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.kencochrane.a4j.beans.BrowseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setSubNodes((ArrayList) null);
      ArrayList arrayList0 = browseNode0.getSubNodes();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setParentNodes((ArrayList) null);
      ArrayList arrayList0 = browseNode0.getParentNodes();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) browseNode0);
      browseNode0.setParentNodes(arrayList0);
      ArrayList arrayList1 = browseNode0.getParentNodes();
      assertFalse(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setMode("--");
      String string0 = browseNode0.getMode();
      assertEquals("--", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setMode("");
      String string0 = browseNode0.getMode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setBrowseName("null - null -- null");
      String string0 = browseNode0.getBrowseName();
      assertEquals("null - null -- null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setBrowseName("");
      String string0 = browseNode0.getBrowseName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setBrowseId("null - null -- null");
      String string0 = browseNode0.getBrowseId();
      assertEquals("null - null -- null", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setBrowseId("");
      String string0 = browseNode0.getBrowseId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.addSubNode((BrowseNode) null);
      // Undeclared exception!
      try { 
        browseNode0.printNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.kencochrane.a4j.beans.BrowseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      browseNode0.setSubNodes(arrayList0);
      // Undeclared exception!
      try { 
        browseNode0.printNode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class net.kencochrane.a4j.beans.BrowseNode (java.lang.Object is in module java.base of loader 'bootstrap'; net.kencochrane.a4j.beans.BrowseNode is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @383dc638)
         //
         verifyException("net.kencochrane.a4j.beans.BrowseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "");
      browseNode0.setSubNodes(arrayList0);
      // Undeclared exception!
      try { 
        browseNode0.getSubNode("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class net.kencochrane.a4j.beans.BrowseNode (java.lang.String is in module java.base of loader 'bootstrap'; net.kencochrane.a4j.beans.BrowseNode is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @383dc638)
         //
         verifyException("net.kencochrane.a4j.beans.BrowseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setSubNodes((ArrayList) null);
      // Undeclared exception!
      try { 
        browseNode0.addSubNode(browseNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.kencochrane.a4j.beans.BrowseNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      String string0 = browseNode0.getBrowseId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      String string0 = browseNode0.getBrowseName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.printNode();
      assertNull(browseNode0.getBrowseName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setSubNodes((ArrayList) null);
      browseNode0.printNode();
      assertNull(browseNode0.getMode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      BrowseNode browseNode1 = browseNode0.getSubNode("");
      assertNull(browseNode1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setSubNodes((ArrayList) null);
      BrowseNode browseNode1 = browseNode0.getSubNode("");
      assertNull(browseNode1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      ArrayList arrayList0 = browseNode0.getParentNodes();
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.setBrowseId("");
      browseNode0.addSubNode(browseNode0);
      BrowseNode browseNode1 = browseNode0.getSubNode(" -- \n");
      assertNull(browseNode1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      ArrayList arrayList0 = browseNode0.getSubNodes();
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      String string0 = browseNode0.toString();
      assertEquals("null - null -- null", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      browseNode0.addSubNode(browseNode0);
      ArrayList arrayList0 = browseNode0.getSubNodes();
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BrowseNode browseNode0 = new BrowseNode();
      String string0 = browseNode0.getMode();
      assertNull(string0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 11:42:41 GMT 2024
 */

package org.exolab.jms.tranlog;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import javax.transaction.xa.Xid;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.exolab.jms.tranlog.ExternalXid;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExternalXid_ESTest extends ExternalXid_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ExternalXid externalXid0 = new ExternalXid(2902, byteArray0, byteArray0);
      ExternalXid externalXid1 = new ExternalXid(517, byteArray0, byteArray0);
      boolean boolean0 = externalXid0.equals(externalXid1);
      assertEquals(517, externalXid1.getFormatId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ExternalXid externalXid0 = new ExternalXid(1687, byteArray0, byteArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      externalXid0.writeExternal(objectOutputStream0);
      assertEquals(1687, externalXid0.getFormatId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.oro.io.Perl5FilenameFilter");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        externalXid0.writeExternal(objectOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.exolab.jms.tranlog.ExternalXid", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      byte[] byteArray0 = externalXid0.getGlobalTransactionId();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ExternalXid externalXid0 = new ExternalXid(0, byteArray0, byteArray0);
      byte[] byteArray1 = externalXid0.getGlobalTransactionId();
      assertEquals(0, externalXid0.getFormatId());
      assertEquals(9, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      ExternalXid externalXid1 = new ExternalXid(externalXid0);
      byte[] byteArray0 = externalXid1.getGlobalTransactionId();
      assertEquals(0, externalXid1.getFormatId());
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ExternalXid externalXid0 = new ExternalXid(0, byteArray0, byteArray0);
      int int0 = externalXid0.getFormatId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ExternalXid externalXid0 = new ExternalXid(1024, byteArray0, byteArray0);
      int int0 = externalXid0.getFormatId();
      assertEquals(1024, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ExternalXid externalXid0 = new ExternalXid((-2326), byteArray0, byteArray0);
      int int0 = externalXid0.getFormatId();
      assertEquals((-2326), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      byte[] byteArray0 = externalXid0.getBranchQualifier();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ExternalXid externalXid0 = new ExternalXid(2902, byteArray0, byteArray0);
      byte[] byteArray1 = externalXid0.getBranchQualifier();
      assertEquals(1, byteArray1.length);
      assertEquals(2902, externalXid0.getFormatId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      ExternalXid externalXid1 = new ExternalXid(externalXid0);
      byte[] byteArray0 = externalXid1.getBranchQualifier();
      assertEquals(0, externalXid1.getFormatId());
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      // Undeclared exception!
      try { 
        externalXid0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.exolab.jms.tranlog.ExternalXid", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExternalXid externalXid0 = null;
      try {
        externalXid0 = new ExternalXid((Xid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.exolab.jms.tranlog.ExternalXid", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid(1100, (byte[]) null, (byte[]) null);
      String string0 = externalXid0.toString();
      assertEquals("xid://0000044c--", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      ExternalXid externalXid1 = new ExternalXid(externalXid0);
      // Undeclared exception!
      try { 
        externalXid0.equals(externalXid1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.exolab.jms.tranlog.ExternalXid", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      ExternalXid externalXid1 = new ExternalXid(externalXid0);
      boolean boolean0 = externalXid1.equals(externalXid0);
      assertEquals(0, externalXid1.getFormatId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      byte[] byteArray0 = new byte[8];
      ExternalXid externalXid1 = new ExternalXid(2656, (byte[]) null, byteArray0);
      boolean boolean0 = externalXid0.equals(externalXid1);
      assertFalse(boolean0);
      assertEquals(2656, externalXid1.getFormatId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      boolean boolean0 = externalXid0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid((-146), (byte[]) null, (byte[]) null);
      boolean boolean0 = externalXid0.equals(externalXid0);
      assertTrue(boolean0);
      assertEquals((-146), externalXid0.getFormatId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ExternalXid externalXid0 = new ExternalXid(0, byteArray0, byteArray0);
      ExternalXid externalXid1 = new ExternalXid(externalXid0);
      boolean boolean0 = externalXid1.equals(externalXid0);
      assertEquals(0, externalXid1.getFormatId());
      assertTrue(externalXid0.equals((Object)externalXid1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid();
      String string0 = externalXid0.toString();
      assertEquals("xid://00000000--", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ExternalXid externalXid0 = new ExternalXid(0, byteArray0, byteArray0);
      externalXid0.toString();
      String string0 = externalXid0.toString();
      assertEquals("xid://00000000-000000000000000000-000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid(1100, (byte[]) null, (byte[]) null);
      ExternalXid externalXid1 = new ExternalXid(externalXid0);
      boolean boolean0 = externalXid0.equals(externalXid1);
      assertFalse(boolean0);
      assertEquals(1100, externalXid0.getFormatId());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExternalXid externalXid0 = new ExternalXid((-146), (byte[]) null, (byte[]) null);
      externalXid0.hashCode();
      assertEquals((-146), externalXid0.getFormatId());
  }
}
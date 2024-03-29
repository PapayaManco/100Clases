/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 10 02:54:58 GMT 2024
 */

package org.quickserver.util.xmlreader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.Socket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.quickserver.util.xmlreader.AccessConstraintConfig;
import org.quickserver.util.xmlreader.IpFilterConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AccessConstraintConfig_ESTest extends AccessConstraintConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      ipFilterConfig0.setEnable(true);
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      IpFilterConfig ipFilterConfig1 = accessConstraintConfig0.getIpFilterConfig();
      assertFalse(ipFilterConfig1.getAllowAccess());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      ipFilterConfig0.setAllowAccess(true);
      IpFilterConfig ipFilterConfig1 = accessConstraintConfig0.getIpFilterConfig();
      assertFalse(ipFilterConfig1.getEnable());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = accessConstraintConfig0.getIpFilterConfig();
      assertNull(ipFilterConfig0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      MockSocket mockSocket0 = new MockSocket();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      ipFilterConfig0.setEnable(true);
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      // Undeclared exception!
      try { 
        accessConstraintConfig0.checkAccept(mockSocket0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      MockSocket mockSocket0 = new MockSocket();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      accessConstraintConfig0.checkAccept(mockSocket0);
      assertFalse(mockSocket0.isClosed());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      MockSocket mockSocket0 = new MockSocket();
      accessConstraintConfig0.checkAccept(mockSocket0);
      assertFalse(mockSocket0.isInputShutdown());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      accessConstraintConfig0.checkAccept((Socket) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      String string0 = accessConstraintConfig0.toXML((String) null);
      assertEquals("<access-constraint>\n</access-constraint>\n", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      String string0 = accessConstraintConfig0.toXML("");
      assertEquals("<access-constraint>\n\t<ip-filter>\n\t\t<enable>false</enable>\n\t\t<allow-access>false</allow-access>\n\t\t<ip-collection>\n\t\t</ip-collection>\n\t</ip-filter>\n</access-constraint>\n", string0);
  }
}

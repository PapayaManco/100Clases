/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 09 23:38:58 GMT 2024
 */

package com.liferay.portal.security.pacl.checker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.security.pacl.permission.PortalHookPermission;
import com.liferay.portal.security.pacl.ActivePACLPolicy;
import com.liferay.portal.security.pacl.InactivePACLPolicy;
import com.liferay.portal.security.pacl.checker.PortalHookChecker;
import java.security.AllPermission;
import java.util.Properties;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PortalHookChecker_ESTest extends PortalHookChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getPlatformClassLoader();
      BouncyCastleProvider bouncyCastleProvider0 = new BouncyCastleProvider();
      ActivePACLPolicy activePACLPolicy0 = null;
      try {
        activePACLPolicy0 = new ActivePACLPolicy("t(9P", classLoader0, bouncyCastleProvider0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Properties properties0 = new Properties();
      ActivePACLPolicy activePACLPolicy0 = null;
      try {
        activePACLPolicy0 = new ActivePACLPolicy("B0e", classLoader0, properties0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getPlatformClassLoader();
      BouncyCastleProvider bouncyCastleProvider0 = new BouncyCastleProvider();
      InactivePACLPolicy inactivePACLPolicy0 = null;
      try {
        inactivePACLPolicy0 = new InactivePACLPolicy("Nh*YqE~8>M.D", classLoader0, bouncyCastleProvider0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Properties properties0 = new Properties();
      InactivePACLPolicy inactivePACLPolicy0 = null;
      try {
        inactivePACLPolicy0 = new InactivePACLPolicy("bsOlz!EOEKwYY]kmU9Y", classLoader0, properties0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      Properties properties0 = new Properties();
      ActivePACLPolicy activePACLPolicy0 = null;
      try {
        activePACLPolicy0 = new ActivePACLPolicy((String) null, classLoader0, properties0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getPlatformClassLoader();
      Properties properties0 = new Properties();
      ActivePACLPolicy activePACLPolicy0 = null;
      try {
        activePACLPolicy0 = new ActivePACLPolicy("<h**['=1^gJt_*", classLoader0, properties0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      BouncyCastleProvider bouncyCastleProvider0 = new BouncyCastleProvider();
      InactivePACLPolicy inactivePACLPolicy0 = null;
      try {
        inactivePACLPolicy0 = new InactivePACLPolicy(">%5-u\"$G)?{", classLoader0, bouncyCastleProvider0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      AllPermission allPermission0 = new AllPermission();
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(allPermission0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.security.AllPermission cannot be cast to class com.liferay.portal.kernel.security.pacl.permission.PortalHookPermission (java.security.AllPermission is in module java.base of loader 'bootstrap'; com.liferay.portal.kernel.security.pacl.permission.PortalHookPermission is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @e873b33)
         //
         verifyException("com.liferay.portal.security.pacl.checker.PortalHookChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("strutsActionPath", classLoader0, "strutsActionPath");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getPortalClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("servletFilters", classLoader0, "servletFilters");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
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
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("service", classLoader0, "service");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getPlatformClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("hasPortalPropertiesKey", classLoader0, "hasPortalPropertiesKey");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("languagePropertiesLocale", classLoader0, (Object) null);
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.PortalHookChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getPortalClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("hasIndexer", classLoader0, "=Bg~");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getPortalClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("customJspDir", classLoader0, portalHookChecker0);
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("J<L;2AWYM>oR9lIo|#", classLoader0, "J<L;2AWYM>oR9lIo|#");
      portalHookChecker0.checkPermission(portalHookPermission0);
      assertEquals("", portalHookPermission0.getActions());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      // Undeclared exception!
      try { 
        portalHookChecker0.afterPropertiesSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }
}
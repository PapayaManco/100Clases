/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 05:17:25 GMT 2024
 */

package org.firebirdsql.gds.impl.jni;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class isc_stmt_handle_impl_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects og/110_firebird"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(isc_stmt_handle_impl_ESTest_scaffolding.class.getClassLoader() ,
      "org.firebirdsql.gds.IscTrHandle",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.XSQLDA",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.jni.isc_tr_handle_impl",
      "org.firebirdsql.gds.IscDbHandle",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(isc_stmt_handle_impl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.gds.XSQLDA",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.jni.isc_blob_handle_impl",
      "org.firebirdsql.gds.impl.jni.isc_tr_handle_impl",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.firebirdsql.gds.GDSExceptionHelper",
      "org.firebirdsql.gds.GDSExceptionHelper$GDSMessage",
      "org.firebirdsql.gds.impl.GDSServerVersion",
      "org.firebirdsql.encodings.EncodingFactory",
      "org.firebirdsql.encodings.Encoding_NotOneByte",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.XSQLVAR$datetime",
      "org.firebirdsql.gds.impl.GDSServerVersionException",
      "org.firebirdsql.encodings.CharacterTranslator"
    );
  }
}

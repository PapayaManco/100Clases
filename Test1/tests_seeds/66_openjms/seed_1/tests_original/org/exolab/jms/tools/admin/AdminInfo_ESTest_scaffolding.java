/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 06:28:08 GMT 2024
 */

package org.exolab.jms.tools.admin;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AdminInfo_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.exolab.jms.tools.admin.AdminInfo"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "CL"); 
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects og/66_openjms"); 
    java.lang.System.setProperty("user.home", "/Users/njimenez"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AdminInfo_ESTest_scaffolding.class.getClassLoader() ,
      "org.exolab.jms.tools.admin.OpenJMSConsumer",
      "org.exolab.jms.tools.admin.OpenJMSUser$2",
      "org.exolab.jms.tools.admin.OpenJMSTopic$1",
      "org.exolab.jms.tools.admin.OpenJMSNode",
      "org.exolab.jms.tools.admin.OpenJMSUser$1",
      "org.exolab.jms.tools.admin.OpenJMSTopic$2",
      "org.exolab.jms.tools.admin.OpenJMSTopicFolder",
      "org.exolab.jms.tools.admin.OpenJMSQueue$1",
      "org.exolab.jms.tools.admin.OpenJMSUser",
      "org.exolab.jms.tools.admin.AbstractAdminConnection",
      "org.exolab.jms.tools.admin.OpenJMSConsumer$1",
      "org.exolab.jms.tools.admin.OpenJMSConsumer$2",
      "org.exolab.jms.tools.admin.OpenJMSTopic",
      "org.exolab.jms.tools.admin.OpenJMSObject",
      "org.exolab.jms.tools.admin.AdminInfo",
      "org.exolab.jms.tools.admin.OpenJMSTopicFolder$1",
      "org.exolab.jms.tools.admin.OpenJMSQueue"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AdminInfo_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.exolab.jms.tools.admin.AdminInfo",
      "org.exolab.jms.tools.admin.AbstractAdminConnection",
      "org.exolab.jms.tools.admin.OpenJMSObject",
      "org.exolab.jms.tools.admin.OpenJMSConsumer",
      "org.exolab.jms.tools.admin.OpenJMSConsumer$1",
      "org.exolab.jms.tools.admin.OpenJMSConsumer$2",
      "org.exolab.jms.tools.admin.OpenJMSQueueFolder",
      "org.exolab.jms.tools.admin.OpenJMSQueueFolder$1",
      "org.exolab.jms.tools.admin.OpenJMSTopic",
      "org.exolab.jms.tools.admin.OpenJMSTopic$1",
      "org.exolab.jms.tools.admin.OpenJMSTopic$2",
      "org.exolab.jms.tools.admin.OpenJMSUser",
      "org.exolab.jms.tools.admin.OpenJMSUser$1",
      "org.exolab.jms.tools.admin.OpenJMSUser$2",
      "org.exolab.jms.tools.admin.OpenJMSQueue",
      "org.exolab.jms.tools.admin.OpenJMSQueue$1",
      "org.exolab.jms.tools.admin.OpenJMSConsumerFolder",
      "org.exolab.jms.tools.admin.OpenJMSConsumerFolder$1",
      "org.exolab.jms.tools.admin.OpenJMSTopicFolder",
      "org.exolab.jms.tools.admin.OpenJMSTopicFolder$1"
    );
  }
}

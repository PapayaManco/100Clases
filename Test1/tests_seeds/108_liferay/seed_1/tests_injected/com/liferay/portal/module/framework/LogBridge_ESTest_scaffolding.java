/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 09:53:44 GMT 2024
 */

package com.liferay.portal.module.framework;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LogBridge_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.portal.module.framework.LogBridge"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects/108_liferay"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LogBridge_ESTest_scaffolding.class.getClassLoader() ,
      "org.osgi.framework.InvalidSyntaxException",
      "org.osgi.util.tracker.AbstractTracked",
      "org.osgi.framework.BundleActivator",
      "com.liferay.portal.module.framework.LogBridge",
      "org.osgi.util.tracker.ServiceTrackerCustomizer",
      "org.osgi.framework.AllServiceListener",
      "org.osgi.util.tracker.ServiceTracker$Tracked",
      "org.osgi.framework.BundleContext",
      "org.osgi.framework.ServiceListener",
      "org.osgi.util.tracker.ServiceTracker$AllTracked",
      "org.osgi.service.log.LogEntry",
      "org.eclipse.equinox.log.internal.ExtendedLogEntryImpl",
      "org.osgi.service.log.LogListener",
      "org.osgi.framework.BundleReference",
      "org.osgi.util.tracker.ServiceTracker",
      "org.eclipse.equinox.log.ExtendedLogEntry",
      "org.osgi.service.log.LogReaderService",
      "org.osgi.framework.Bundle",
      "org.osgi.framework.ServiceReference"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LogBridge_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.liferay.portal.module.framework.LogBridge",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.transaction.annotation.Isolation",
      "org.eclipse.osgi.launch.Equinox",
      "com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission",
      "org.testng.xml.XmlSuite$1",
      "org.testng.xml.XmlSuite",
      "org.testng.collections.Lists",
      "org.testng.collections.Maps",
      "org.testng.xml.XmlTest",
      "org.osgi.util.tracker.ServiceTracker",
      "org.testng.xml.XmlClass",
      "org.testng.internal.ClassHelper",
      "org.testng.internal.Utils$1",
      "org.testng.internal.Utils",
      "org.testng.TestRunner",
      "org.testng.TestNGException",
      "org.eclipse.equinox.log.internal.ExtendedLogReaderServiceImpl",
      "org.eclipse.equinox.log.internal.ExtendedLogEntryImpl",
      "org.testng.log4testng.Logger",
      "org.testng.TestNG",
      "org.testng.junit.JUnitUtils$JUnitTestMethod",
      "org.testng.junit.JUnitTestClass",
      "org.testng.junit.JUnit3TestClass",
      "org.testng.internal.BaseTestMethod$1",
      "org.testng.internal.BaseTestMethod",
      "org.testng.junit.JUnitTestMethod",
      "org.testng.junit.JUnit3TestMethod",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.thread.ThreadUtil",
      "org.testng.internal.thread.AtomicIntegerAdapter",
      "org.testng.junit.JUnitUtils$JUnitTestClass",
      "org.testng.internal.ClonedMethod",
      "org.testng.junit.JUnit4TestClass",
      "org.testng.junit.JUnit4TestMethod",
      "org.eclipse.equinox.log.internal.EventAdminLogListener",
      "com.caucho.config.Names",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.internal.annotations.TestOrConfiguration",
      "org.testng.internal.annotations.TestAnnotation",
      "com.caucho.inject.NamedLiteral",
      "org.testng.internal.Configuration",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.internal.annotations.JDK15TagFactory$1",
      "org.testng.internal.annotations.JDK15TagFactory$2",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.SuiteRunner",
      "org.testng.TestListenerAdapter",
      "org.testng.SuiteRunState",
      "org.testng.internal.Attributes",
      "org.testng.SuiteRunner$DefaultTestRunnerFactory",
      "org.testng.SuiteRunner$1",
      "org.testng.internal.annotations.Sets",
      "org.testng.TestRunner$ConfigurationListener",
      "org.testng.internal.TestNGProperty",
      "org.testng.internal.Constants",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.collections.ListMultiMap",
      "org.testng.internal.Dynamic",
      "bsh.Interpreter",
      "org.testng.internal.Bsh",
      "org.testng.internal.ResultMap",
      "org.testng.internal.RunInfo",
      "org.testng.PreserveOrderMethodInterceptor",
      "org.testng.internal.Invoker$CanRunFromClassPredicate",
      "org.testng.internal.Invoker$SameClassNamePredicate",
      "org.testng.internal.Invoker",
      "org.testng.internal.MethodSelectorDescriptor",
      "org.testng.internal.ClassInfoMap",
      "org.testng.internal.BaseClassFinder",
      "org.testng.internal.TestNGClassFinder",
      "org.testng.internal.ObjectFactoryImpl",
      "org.testng.internal.TestNGMethodFinder",
      "org.testng.internal.MethodGroupsHelper",
      "org.testng.internal.MethodHelper",
      "org.testng.internal.Graph",
      "org.testng.ClassMethodMap",
      "org.testng.internal.ConfigurationGroupMethods",
      "org.testng.reporters.XMLStringBuffer",
      "org.testng.xml.XmlUtils",
      "org.testng.reporters.XMLUtils",
      "org.testng.reporters.Tag",
      "org.testng.collections.CollectionUtils",
      "org.testng.xml.XmlDefine",
      "org.testng.xml.XmlMethodSelectors",
      "org.testng.internal.NoOpTestClass",
      "org.testng.junit.JUnitUtils",
      "com.caucho.config.AdminLiteral",
      "org.testng.xml.XmlGroups",
      "org.testng.internal.TestNGMethod$1",
      "org.testng.internal.TestNGMethod",
      "jcifs.http.Handler",
      "jcifs.https.Handler",
      "org.testng.xml.XmlMethodSelector",
      "org.testng.xml.XmlScript",
      "org.testng.xml.XmlPackage"
    );
  }
}

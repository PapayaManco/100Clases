/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 09:36:07 GMT 2024
 */

package com.liferay.portal.executor;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PortalExecutorFactoryImpl_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.portal.executor.PortalExecutorFactoryImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects/108_liferay"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PortalExecutorFactoryImpl_ESTest_scaffolding.class.getClassLoader() ,
      "com.liferay.portal.kernel.concurrent.ThreadPoolHandlerAdapter",
      "com.liferay.portal.kernel.executor.PortalExecutorFactory",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$Entry",
      "com.liferay.portal.security.pacl.PACLClassLoaderUtil",
      "com.liferay.portal.kernel.concurrent.ThreadPoolHandler",
      "com.liferay.portal.kernel.concurrent.AbortPolicy",
      "com.liferay.portal.kernel.concurrent.RejectedExecutionHandler",
      "com.liferay.portal.security.lang.PortalSecurityManagerThreadLocal",
      "com.liferay.portal.kernel.log.Log",
      "com.liferay.portal.kernel.util.AutoResetThreadLocal",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.kernel.util.NamedThreadFactory",
      "com.liferay.portal.kernel.util.PortalClassLoaderUtil",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal",
      "com.liferay.portal.kernel.util.InitialThreadLocal",
      "com.liferay.portal.kernel.log.LogFactory",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMapThreadLocal",
      "com.liferay.portal.kernel.concurrent.ThreadPoolExecutor",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMap",
      "com.liferay.portal.executor.PortalExecutorFactoryImpl"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.ThreadGroup", false, PortalExecutorFactoryImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PortalExecutorFactoryImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.liferay.portal.executor.PortalExecutorFactoryImpl",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMapThreadLocal",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.kernel.util.InitialThreadLocal",
      "com.liferay.portal.kernel.util.AutoResetThreadLocal",
      "com.liferay.portal.security.lang.PortalSecurityManagerThreadLocal",
      "com.liferay.portal.kernel.util.PortalClassLoaderUtil",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.transaction.annotation.Isolation",
      "com.liferay.portal.kernel.concurrent.ThreadPoolHandlerAdapter",
      "com.liferay.portal.kernel.concurrent.DiscardWithCancelPolicy",
      "com.liferay.portal.kernel.concurrent.ClearThreadLocalThreadPoolHandler",
      "com.liferay.portal.kernel.concurrent.ThreadPoolExecutor",
      "com.liferay.portal.kernel.concurrent.AbortPolicy",
      "com.liferay.portal.kernel.concurrent.CallerRunsPolicy",
      "com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission",
      "com.liferay.portal.kernel.util.ServerDetector",
      "org.jgroups.util.DefaultThreadFactory",
      "org.jgroups.util.LazyThreadFactory",
      "com.liferay.portal.kernel.concurrent.DiscardOldestPolicy",
      "com.liferay.portal.kernel.util.NamedThreadFactory",
      "com.liferay.portal.security.pacl.PACLClassLoaderUtil",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMap",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$Entry",
      "org.jruby.threading.DaemonThreadFactory",
      "jcifs.http.Handler",
      "org.jgroups.util.StackType",
      "org.jgroups.util.Util",
      "com.liferay.portal.kernel.concurrent.DiscardPolicy",
      "com.caucho.server.resin.ResinURLStreamHandlerFactory",
      "com.caucho.server.resin.ResinURLStreamHandler",
      "jcifs.https.Handler",
      "com.liferay.portal.kernel.concurrent.TaskQueue",
      "com.liferay.portal.kernel.concurrent.TaskQueue$Node",
      "com.liferay.portal.kernel.concurrent.ThreadPoolExecutor$WorkerTask",
      "jcifs.smb.Handler",
      "org.apache.naming.resources.DirContextURLStreamHandlerFactory"
    );
  }
}

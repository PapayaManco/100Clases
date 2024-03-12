/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 10 01:40:08 GMT 2024
 */

package macaw.presentationLayer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MacawStateEditor_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "macaw.presentationLayer.MacawStateEditor"; 
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
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects og/69_lhamacaw"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MacawStateEditor_ESTest_scaffolding.class.getClassLoader() ,
      "macaw.presentationLayer.MacawStateEditor",
      "macaw.util.Displayable",
      "macaw.system.UserInterfaceFactory",
      "macaw.system.StartupOptions",
      "macaw.util.DisplayableListItemAdder",
      "macaw.businessLayer.AvailabilityState",
      "macaw.util.DisplayableListItemEditor",
      "macaw.system.Log",
      "macaw.util.DisplayableListItemViewer",
      "macaw.system.SessionProperties",
      "macaw.util.DisplayableListItemDeleter",
      "macaw.businessLayer.MacawListChoice",
      "macaw.presentationLayer.AvailabilityStateEditor"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MacawStateEditor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "macaw.presentationLayer.MacawStateEditor",
      "macaw.system.MacawMessages",
      "macaw.system.MacawErrorType",
      "macaw.system.SessionProperties",
      "macaw.system.Log",
      "macaw.system.UserInterfaceFactory",
      "macaw.system.StartupOptions",
      "macaw.presentationLayer.CategoryStateEditor",
      "macaw.presentationLayer.AvailabilityStateEditor",
      "macaw.presentationLayer.CleaningStateEditor",
      "macaw.businessLayer.VariableSummary",
      "macaw.businessLayer.User",
      "macaw.util.DisplayableList",
      "macaw.persistenceLayer.demo.DemonstrationCurationService",
      "macaw.persistenceLayer.demo.DemonstrationRetrievalService",
      "macaw.persistenceLayer.demo.InMemoryChangeEventManager",
      "macaw.persistenceLayer.demo.InMemoryUserManager",
      "macaw.persistenceLayer.demo.InMemoryCurationConceptManager",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermManager",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentsManager",
      "macaw.persistenceLayer.demo.InMemoryListChoiceManager",
      "macaw.persistenceLayer.demo.InMemoryVariableManager",
      "macaw.persistenceLayer.demo.InMemoryValueLabelManager",
      "macaw.persistenceLayer.demo.InMemoryVariableFilter",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentFilter",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermFilter",
      "macaw.util.ValidationUtility",
      "macaw.system.MacawException",
      "macaw.system.MacawError",
      "macaw.persistenceLayer.DummyDataProvider",
      "macaw.businessLayer.MacawListChoice",
      "macaw.businessLayer.Category",
      "macaw.util.SearchUtility",
      "macaw.system.MacawChangeEvent",
      "macaw.system.ChangeEventType",
      "macaw.businessLayer.CleaningState",
      "macaw.businessLayer.AvailabilityState",
      "macaw.businessLayer.AliasFilePath",
      "macaw.businessLayer.Variable",
      "macaw.businessLayer.DerivedVariable",
      "macaw.persistenceLayer.ChangeEventGenerator",
      "macaw.businessLayer.SupportingDocument",
      "macaw.businessLayer.RawVariable",
      "macaw.businessLayer.OntologyTerm",
      "macaw.businessLayer.ValueLabel",
      "macaw.businessLayer.ValueLabel$EditingOperationType",
      "macaw.persistenceLayer.production.ProductionCurationService",
      "macaw.persistenceLayer.production.SQLChangeEventManager",
      "macaw.persistenceLayer.production.SQLConnectionManager",
      "macaw.persistenceLayer.production.SQLCurationConceptManager",
      "macaw.persistenceLayer.production.SQLUserManager",
      "macaw.persistenceLayer.production.SQLSupportingDocumentsManager",
      "macaw.persistenceLayer.production.SQLListChoiceManager",
      "macaw.persistenceLayer.production.SQLValueLabelManager",
      "macaw.persistenceLayer.production.SQLOntologyTermManager",
      "macaw.persistenceLayer.production.SQLFilterQueries",
      "macaw.persistenceLayer.production.SQLVariableManager",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.jdbc.StringUtils",
      "com.mysql.jdbc.Messages",
      "com.mysql.jdbc.Util",
      "com.mysql.jdbc.log.StandardLogger",
      "com.mysql.jdbc.ConnectionProperties$ConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties",
      "com.mysql.jdbc.log.NullLogger",
      "com.mysql.jdbc.Connection",
      "com.mysql.jdbc.ConnectionProperties$BooleanConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$IntegerConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$MemorySizeConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$StringConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$LongConnectionProperty",
      "com.mysql.jdbc.StandardSocketFactory",
      "com.mysql.jdbc.VersionedStringProperty",
      "com.mysql.jdbc.CharsetMapping"
    );
  }
}

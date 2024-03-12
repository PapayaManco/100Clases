/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 02:44:14 GMT 2024
 */

package net.sourceforge.squirrel_sql.client.session.parser.kernel;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Parser_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sourceforge.squirrel_sql.client.session.parser.kernel.Parser"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects og/102_squirrel-sql"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Parser_ESTest_scaffolding.class.getClassLoader() ,
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLColumn",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.SQLCompletion$ChildComparator",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.SQLSchema",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerFactory",
      "org.apache.log4j.helpers.PatternConverter",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.SQLCompletion",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.Logger",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLStatementContext",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.LogLog",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner$Buffer",
      "org.apache.log4j.Category",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.ParserListener",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.SQLSchema$Table",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.ParserLogger",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.or.DefaultRenderer",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLSelectStatementListener",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "org.apache.log4j.PropertyWatchdog",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Parser",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLStatement",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLTable",
      "org.apache.log4j.PropertyConfigurator",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner",
      "org.apache.log4j.helpers.Loader",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "net.sourceforge.squirrel_sql.fw.util.log.ILogger",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.Appender",
      "org.apache.log4j.helpers.FileWatchdog",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Token",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.ErrorStream",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLSelectStatement",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerListener",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Completion",
      "org.apache.log4j.spi.RendererSupport",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner$FBuffer",
      "org.apache.log4j.Priority",
      "net.sourceforge.squirrel_sql.fw.util.Utilities$1",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLModifyingStatement",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner$SBuffer",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Parser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Parser",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner$Buffer",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner$SBuffer",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.ErrorStream",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.SQLCompletion",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLStatement",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLModifyingStatement",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLTable",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.ParserLogger",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Token",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLColumn",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.Scanner$FBuffer",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLWhere",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.SQLCompletion$ChildComparator",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.completions.SQLSelectStatement"
    );
  }
}
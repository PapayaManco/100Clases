/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 08:02:53 GMT 2024
 */

package net.sourceforge.squirrel_sql.client.gui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HtmlViewerPanel_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanel"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects/102_squirrel-sql"); 
    java.lang.System.setProperty("user.home", "/Users/njimenez"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "CL"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HtmlViewerPanel_ESTest_scaffolding.class.getClassLoader() ,
      "net.sourceforge.squirrel_sql.fw.gui.action.BaseAction",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanelListenerEvent",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerFactory",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "org.apache.log4j.AppenderSkeleton",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$SelectAllAction",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.Logger",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "org.jboss.net.protocol.file.Handler",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.apache.log4j.helpers.PatternParser",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$CopyAction",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.LogLog",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$CutAction",
      "org.apache.log4j.Category",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "net.sourceforge.squirrel_sql.client.gui.IHtmlViewerPanelListener",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.or.DefaultRenderer",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanel$2",
      "net.sourceforge.squirrel_sql.fw.gui.BasePopupMenu",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanel$1",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanel",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "org.jboss.net.protocol.file.FileURLConnection",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "org.apache.log4j.Hierarchy",
      "net.sourceforge.squirrel_sql.fw.util.log.ILogger",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$PasteAction",
      "org.apache.log4j.Appender",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerListener",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.ErrorHandler",
      "net.sourceforge.squirrel_sql.fw.gui.CursorChanger",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "org.apache.log4j.spi.RendererSupport",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "org.apache.log4j.Priority",
      "net.sourceforge.squirrel_sql.fw.util.Utilities$1",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("net.sourceforge.squirrel_sql.client.gui.IHtmlViewerPanelListener", false, HtmlViewerPanel_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HtmlViewerPanel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
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
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanel",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanel$1",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanel$2",
      "net.sourceforge.squirrel_sql.fw.gui.BasePopupMenu",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu",
      "net.sourceforge.squirrel_sql.fw.gui.action.BaseAction",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$CutAction",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$CopyAction",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$PasteAction",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu$SelectAllAction",
      "net.sourceforge.squirrel_sql.fw.gui.CursorChanger",
      "org.jboss.net.protocol.resource.Handler",
      "org.jboss.net.protocol.DelegatingURLConnection",
      "org.jboss.net.protocol.resource.ResourceURLConnection",
      "org.jboss.net.protocol.njar.Handler",
      "net.sourceforge.squirrel_sql.client.gui.HtmlViewerPanelListenerEvent",
      "org.jboss.net.protocol.file.Handler",
      "org.jboss.net.protocol.file.FileURLConnection",
      "org.jboss.net.protocol.URLStreamHandlerFactory",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.springframework.util.CustomizableThreadCreator",
      "org.springframework.scheduling.concurrent.CustomizableThreadFactory",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.date.SerialDate",
      "org.jfree.date.SpreadsheetDate",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.time.Second",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.springframework.util.ClassUtils",
      "org.springframework.util.Assert",
      "org.springframework.util.StringUtils",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.DomainOrder"
    );
  }
}

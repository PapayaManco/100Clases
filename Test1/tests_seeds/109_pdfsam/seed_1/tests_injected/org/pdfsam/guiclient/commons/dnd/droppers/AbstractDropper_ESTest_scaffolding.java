/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 10 16:04:14 GMT 2024
 */

package org.pdfsam.guiclient.commons.dnd.droppers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractDropper_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.pdfsam.guiclient.commons.dnd.droppers.AbstractDropper"; 
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
    java.lang.System.setProperty("user.home", "/Users/njimenez"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects/109_pdfsam"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "CL"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractDropper_ESTest_scaffolding.class.getClassLoader() ,
      "org.pdfsam.guiclient.exceptions.ConfigurationException",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.XmlConfigStrategy",
      "org.apache.log4j.PropertyWatchdog",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.DefaultXmlStrategy",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.or.RendererMap",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.AbstractXmlConfigStrategy",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Logger",
      "org.dom4j.DocumentException",
      "org.pdfsam.console.business.ConsoleServicesFacade",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.pdfsam.guiclient.configuration.Configuration",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.BackwardCompatibilityXmlStrategy",
      "org.apache.log4j.Level",
      "org.pdfsam.guiclient.commons.dnd.droppers.JVisualMultiSelectionDropper",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.pdfsam.guiclient.configuration.services.ConfigurationService",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "org.pdfsam.guiclient.configuration.services.xml.XmlConfigurationService",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.pdfsam.guiclient.business.ClosableTabbedPanelAdder",
      "org.apache.log4j.spi.RepositorySelector",
      "org.pdfsam.guiclient.commons.dnd.droppers.AbstractDropper",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.log4j.Priority",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.pdfsam.guiclient.configuration.services.ConfigurationServiceLocator",
      "org.pdfsam.guiclient.configuration.services.GuiConfigurationService",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.helpers.OptionConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractDropper_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
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
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.pdfsam.guiclient.commons.dnd.droppers.AbstractDropper",
      "org.pdfsam.guiclient.commons.dnd.DnDSupportUtility",
      "org.pdfsam.guiclient.configuration.Configuration",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane$CloseableMetalTabbedPaneUI",
      "org.pdfsam.guiclient.business.ClosableTabbedPanelAdder",
      "org.pdfsam.guiclient.commons.dnd.droppers.JVisualMultiSelectionDropper",
      "org.pdfsam.guiclient.commons.panels.JPdfSelectionPanel",
      "org.pdfsam.guiclient.commons.components.JPdfSelectionTable",
      "org.pdfsam.guiclient.configuration.services.ConfigurationServiceLocator",
      "org.pdfsam.guiclient.configuration.services.xml.XmlConfigurationService",
      "org.pdfsam.guiclient.commons.business.loaders.PdfLoader",
      "org.pdfsam.guiclient.commons.business.loaders.PdfLoaderExecutor",
      "org.pdfsam.guiclient.commons.models.AbstractPdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.models.SimplePdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.models.SortablePdfSelectionTableModel",
      "org.pdfsam.guiclient.plugins.interfaces.AbstractPlugablePanel",
      "org.pdfsam.plugin.docinfo.GUI.DocInfoMainGUI",
      "org.pdfsam.guiclient.commons.dnd.droppers.JPdfSelectionTableDropper",
      "org.dom4j.DocumentFactory",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.dom4j.bean.BeanMetaData",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.QName",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.dom4j.Namespace",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.tree.DefaultElement",
      "org.dom4j.bean.BeanElement",
      "org.dom4j.bean.BeanAttributeList",
      "org.dom4j.tree.AbstractAttribute",
      "org.dom4j.bean.BeanAttribute",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane$CloseTabIcon",
      "org.pdfsam.guiclient.utils.filters.AbstractFileFilter",
      "org.pdfsam.guiclient.utils.filters.PdfFilter",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.IntHashtable",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.pdfsam.guiclient.commons.business.loaders.callable.AddPdfDocument",
      "org.dom4j.util.UserDataElement",
      "org.dom4j.tree.DefaultNamespace",
      "org.dom4j.dom.DOMNamespace",
      "org.dom4j.util.IndexedElement",
      "org.dom4j.xpath.DefaultXPath",
      "org.jaxen.BaseXPath",
      "org.jaxen.dom4j.Dom4jXPath",
      "org.jaxen.DefaultNavigator",
      "org.jaxen.dom4j.DocumentNavigator",
      "org.jaxen.dom4j.DocumentNavigator$Singleton",
      "org.jaxen.saxpath.helpers.XPathReaderFactory",
      "org.jaxen.saxpath.helpers.DefaultXPathHandler",
      "org.jaxen.saxpath.base.XPathReader",
      "org.jaxen.JaxenHandler",
      "org.jaxen.expr.DefaultXPathFactory",
      "org.jaxen.saxpath.base.XPathLexer",
      "org.jaxen.saxpath.base.Verifier",
      "org.jaxen.saxpath.base.Token",
      "org.jaxen.expr.DefaultExpr",
      "org.jaxen.expr.DefaultLocationPath",
      "org.jaxen.expr.DefaultRelativeLocationPath",
      "org.jaxen.expr.iter.IterableAxis",
      "org.jaxen.expr.iter.IterableChildAxis",
      "org.jaxen.expr.DefaultStep",
      "org.jaxen.expr.DefaultNameStep",
      "org.jaxen.expr.PredicateSet",
      "org.jaxen.expr.DefaultPathExpr",
      "org.jaxen.saxpath.base.TokenTypes",
      "org.jaxen.saxpath.SAXPathException",
      "org.jaxen.saxpath.XPathSyntaxException",
      "org.jaxen.JaxenException",
      "org.jaxen.XPathSyntaxException",
      "org.dom4j.InvalidXPathException",
      "org.dom4j.dom.DOMDocumentFactory",
      "org.dom4j.dom.DOMElement",
      "org.dom4j.tree.NamespaceStack",
      "org.dom4j.tree.BackedList",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "org.dom4j.xpath.XPathPattern",
      "org.jaxen.Context",
      "org.jaxen.ContextSupport",
      "org.jaxen.SimpleNamespaceContext",
      "org.jaxen.SimpleFunctionContext",
      "org.jaxen.function.BooleanFunction",
      "org.jaxen.QualifiedName",
      "org.jaxen.function.CeilingFunction",
      "org.jaxen.function.ConcatFunction",
      "org.jaxen.function.ContainsFunction",
      "org.jaxen.function.CountFunction",
      "org.jaxen.function.FalseFunction",
      "org.jaxen.function.FloorFunction",
      "org.jaxen.function.IdFunction",
      "org.jaxen.function.LangFunction",
      "org.jaxen.function.LastFunction",
      "org.jaxen.function.LocalNameFunction",
      "org.jaxen.function.NameFunction",
      "org.jaxen.function.NamespaceUriFunction",
      "org.jaxen.function.NormalizeSpaceFunction",
      "org.jaxen.function.NotFunction",
      "org.jaxen.function.NumberFunction",
      "org.jaxen.function.PositionFunction",
      "org.jaxen.function.RoundFunction",
      "org.jaxen.function.StartsWithFunction",
      "org.jaxen.function.StringFunction",
      "org.jaxen.function.StringLengthFunction",
      "org.jaxen.function.SubstringAfterFunction",
      "org.jaxen.function.SubstringBeforeFunction",
      "org.jaxen.function.SubstringFunction",
      "org.jaxen.function.SumFunction",
      "org.jaxen.function.TrueFunction",
      "org.jaxen.function.TranslateFunction",
      "org.jaxen.function.xslt.DocumentFunction",
      "org.jaxen.function.ext.EvaluateFunction",
      "org.jaxen.function.ext.LocaleFunctionSupport",
      "org.jaxen.function.ext.LowerFunction",
      "org.jaxen.function.ext.UpperFunction",
      "org.jaxen.function.ext.EndsWithFunction",
      "org.jaxen.XPathFunctionContext",
      "org.jaxen.SimpleVariableContext",
      "org.jaxen.pattern.PatternParser",
      "org.dom4j.dom.DOMNodeHelper$EmptyNodeList",
      "org.dom4j.dom.DOMNodeHelper",
      "org.jaxen.expr.DefaultXPathExpr",
      "org.dom4j.xpath.DefaultNamespaceContext",
      "org.jaxen.util.SingletonList",
      "org.jaxen.UnresolvableException",
      "org.dom4j.XPathException",
      "org.pdfsam.guiclient.commons.business.listeners.CleanClosedTabbedPanelListener",
      "org.dom4j.tree.ContentListFacade",
      "org.dom4j.io.OutputFormat",
      "org.dom4j.io.XMLWriter",
      "org.dom4j.tree.AbstractProcessingInstruction",
      "org.dom4j.tree.FlyweightProcessingInstruction",
      "org.dom4j.tree.DefaultProcessingInstruction",
      "org.dom4j.dom.DOMProcessingInstruction",
      "org.dom4j.tree.BaseElement",
      "org.dom4j.util.NonLazyElement",
      "org.dom4j.tree.AbstractCharacterData",
      "org.dom4j.tree.AbstractText",
      "org.dom4j.tree.FlyweightText",
      "org.dom4j.tree.DefaultText",
      "org.pdfsam.guiclient.commons.business.loaders.callable.ReloadPdfDocument",
      "org.dom4j.tree.AbstractEntity",
      "org.dom4j.tree.FlyweightEntity",
      "org.dom4j.tree.DefaultEntity",
      "org.dom4j.dom.DOMEntityReference",
      "org.jaxen.expr.DefaultBinaryExpr",
      "org.jaxen.expr.DefaultArithExpr",
      "org.jaxen.expr.DefaultMultiplicativeExpr",
      "org.jaxen.expr.DefaultMultiplyExpr",
      "org.jaxen.expr.DefaultTruthExpr",
      "org.jaxen.expr.DefaultRelationalExpr",
      "org.jaxen.expr.DefaultGreaterThanExpr",
      "org.jaxen.JaxenConstants",
      "org.dom4j.datatype.DatatypeElement",
      "org.dom4j.tree.AbstractComment",
      "org.dom4j.tree.FlyweightComment",
      "org.dom4j.tree.DefaultComment",
      "org.dom4j.IllegalAddException",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.tree.DefaultDocument",
      "org.dom4j.tree.AbstractCDATA",
      "org.dom4j.tree.FlyweightCDATA",
      "org.dom4j.tree.DefaultCDATA",
      "org.dom4j.tree.FlyweightAttribute",
      "org.dom4j.tree.DefaultAttribute",
      "org.dom4j.dom.DOMText",
      "org.dom4j.util.UserDataAttribute",
      "org.jaxen.expr.DefaultAbsoluteLocationPath",
      "org.dom4j.dom.DOMCDATA"
    );
  }
}
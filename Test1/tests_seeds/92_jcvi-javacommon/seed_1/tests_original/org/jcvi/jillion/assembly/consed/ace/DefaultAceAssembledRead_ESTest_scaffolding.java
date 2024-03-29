/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 07:36:29 GMT 2024
 */

package org.jcvi.jillion.assembly.consed.ace;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DefaultAceAssembledRead_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead"; 
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
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects og/92_jcvi-javacommon"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultAceAssembledRead_ESTest_scaffolding.class.getClassLoader() ,
      "org.jcvi.jillion.core.Range$EmptyIntRange",
      "org.jcvi.jillion.core.Range$ByteRange",
      "org.jcvi.jillion.core.Range$ShortRange",
      "org.jcvi.jillion.core.residue.Residue",
      "org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead$IllegalReAbacus",
      "org.jcvi.jillion.core.Range$Builder",
      "org.jcvi.jillion.internal.core.util.Caches$AbstractReferencedCache",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceCache",
      "org.jcvi.jillion.assembly.AssembledReadBuilder",
      "org.jcvi.jillion.core.Range$EmptyByteRange",
      "org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$NewValues",
      "org.jcvi.jillion.core.util.MapUtil",
      "org.jcvi.jillion.core.residue.nt.Nucleotide",
      "org.jcvi.jillion.core.residue.ResidueSequenceBuilder",
      "org.jcvi.jillion.internal.core.io.RandomAccessFileInputStream",
      "org.jcvi.jillion.core.Range$EmptyShortRange",
      "org.jcvi.jillion.assembly.consed.ace.AceAssembledRead",
      "org.jcvi.jillion.core.Range$LongStartIntLengthRange",
      "org.jcvi.jillion.core.residue.nt.ReferenceMappedNucleotideSequence",
      "org.jcvi.jillion.core.Range$UnsignedIntStartIntLengthRange",
      "org.jcvi.jillion.assembly.consed.ace.PhdInfo",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$CodecDecider",
      "org.jcvi.jillion.core.Range$IntRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartShortLengthRange",
      "org.jcvi.jillion.internal.core.util.Caches",
      "org.jcvi.jillion.core.Range$UnsignedShortStartLongLengthRange",
      "org.jcvi.jillion.internal.core.GlyphCodec",
      "org.jcvi.jillion.assembly.ReadInfo",
      "org.jcvi.jillion.internal.assembly.DefaultAssembledRead",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder",
      "org.jcvi.jillion.core.io.IOUtil",
      "org.jcvi.jillion.core.Range",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequence",
      "org.jcvi.jillion.core.residue.nt.NucleotideCodec",
      "org.jcvi.jillion.core.Rangeable",
      "org.jcvi.jillion.core.Direction",
      "org.jcvi.jillion.core.Range$UnsignedByteStartShortLengthRange",
      "org.jcvi.jillion.internal.assembly.DefaultAssembledRead$Builder",
      "org.jcvi.jillion.core.Range$UnsignedByteStartIntLengthRange",
      "org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead$Builder",
      "org.jcvi.jillion.core.util.Builder",
      "org.jcvi.jillion.core.Range$UnsignedShortStartIntLengthRange",
      "org.jcvi.jillion.core.residue.ResidueSequence",
      "org.jcvi.jillion.core.Range$CoordinateSystem",
      "org.jcvi.jillion.core.Range$UnsignedIntStartLongLengthRange",
      "org.jcvi.jillion.core.Range$LongRange",
      "org.jcvi.jillion.assembly.consed.ace.AceAssembledReadBuilder",
      "org.jcvi.jillion.core.SequenceBuilder",
      "org.jcvi.jillion.internal.assembly.DefaultAssembledRead$IllegalReAbacus",
      "org.jcvi.jillion.assembly.AssembledRead",
      "org.jcvi.jillion.core.Range$EmptyLongRange",
      "org.jcvi.jillion.core.Sequence"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.jcvi.jillion.core.residue.nt.NucleotideSequence", false, DefaultAceAssembledRead_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultAceAssembledRead_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead",
      "org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead$Builder",
      "org.jcvi.jillion.assembly.consed.ace.PhdInfo",
      "org.jcvi.jillion.internal.core.util.Caches",
      "org.jcvi.jillion.internal.core.util.Caches$AbstractReferencedCache",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceCache",
      "org.jcvi.jillion.core.util.MapUtil",
      "org.jcvi.jillion.core.Range",
      "org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead$IllegalReAbacus",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$NewValues",
      "org.jcvi.jillion.core.residue.nt.NucleotideSequenceBuilder$CodecDecider",
      "org.jcvi.jillion.core.Range$Builder",
      "org.jcvi.jillion.core.Range$UnsignedShortStartShortLengthRange",
      "org.jcvi.jillion.core.io.IOUtil",
      "org.jcvi.jillion.internal.assembly.DefaultAssembledRead",
      "org.jcvi.jillion.internal.assembly.DefaultAssembledRead$Builder",
      "org.jcvi.jillion.core.Range$ShortRange",
      "org.jcvi.jillion.core.Range$ByteRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartShortLengthRange",
      "org.jcvi.jillion.core.Range$RangeIterator",
      "org.jcvi.jillion.core.Range$EmptyByteRange",
      "org.jcvi.jillion.core.Range$EmptyLongRange",
      "org.jcvi.jillion.core.Range$LongStartIntLengthRange",
      "org.jcvi.jillion.core.Ranges",
      "org.jcvi.jillion.core.Range$Comparators",
      "org.jcvi.jillion.internal.core.util.JillionUtil",
      "org.jcvi.jillion.core.Range$LongRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartIntLengthRange",
      "org.jcvi.jillion.core.Range$IntRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartIntLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedIntStartIntLengthRange",
      "org.jcvi.jillion.core.Range$EmptyShortRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartLongLengthRange",
      "org.jcvi.jillion.core.Range$EmptyIntRange",
      "org.jcvi.jillion.core.Range$CoordinateSystem",
      "org.jcvi.jillion.core.residue.nt.Nucleotide"
    );
  }
}

/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 03:13:31 GMT 2024
 */

package org.bouncycastle.asn1.pkcs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CertificationRequestInfo_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.bouncycastle.asn1.pkcs.CertificationRequestInfo"; 
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
    java.lang.System.setProperty("user.dir", "/Users/njimenez/Documents/Magister/100Clases/Test1/projects og/104_vuze"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zt/9k543zcs7kb243_mzg2jl49w0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CertificationRequestInfo_ESTest_scaffolding.class.getClassLoader() ,
      "org.bouncycastle.asn1.DERString",
      "org.bouncycastle.asn1.ASN1Sequence",
      "org.bouncycastle.asn1.x509.SubjectPublicKeyInfo",
      "org.bouncycastle.asn1.ASN1Set",
      "org.bouncycastle.asn1.DERObject",
      "org.bouncycastle.asn1.ASN1TaggedObjectParser",
      "org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers",
      "org.bouncycastle.asn1.DEREncodable",
      "org.bouncycastle.asn1.ASN1SequenceParser",
      "org.bouncycastle.asn1.DERBitString",
      "org.bouncycastle.asn1.DERTaggedObject",
      "org.bouncycastle.asn1.DERNull",
      "org.bouncycastle.asn1.BERSet",
      "org.bouncycastle.asn1.BERTaggedObject",
      "org.bouncycastle.asn1.DERGeneralizedTime",
      "org.bouncycastle.asn1.BERSequence",
      "org.bouncycastle.asn1.DEREncodableVector",
      "org.bouncycastle.asn1.ASN1Object",
      "org.bouncycastle.asn1.ASN1SetParser",
      "org.bouncycastle.asn1.DERObjectIdentifier",
      "org.bouncycastle.asn1.ASN1TaggedObject",
      "org.bouncycastle.asn1.DERIA5String",
      "org.bouncycastle.asn1.DERUTF8String",
      "org.bouncycastle.asn1.ASN1Encodable",
      "org.bouncycastle.asn1.DERConstructedSequence",
      "org.bouncycastle.asn1.ASN1OutputStream",
      "org.bouncycastle.asn1.ASN1Choice",
      "org.bouncycastle.asn1.ASN1EncodableVector",
      "org.bouncycastle.asn1.x509.X509Name",
      "org.bouncycastle.asn1.x509.X509NameEntryConverter",
      "org.bouncycastle.asn1.DERSequence",
      "org.bouncycastle.asn1.DERInteger",
      "org.bouncycastle.asn1.DERSet",
      "org.bouncycastle.asn1.BERConstructedSequence",
      "org.bouncycastle.asn1.DERPrintableString",
      "org.bouncycastle.asn1.x509.X509DefaultEntryConverter",
      "org.bouncycastle.asn1.BEROutputStream",
      "org.bouncycastle.asn1.pkcs.CertificationRequestInfo",
      "org.bouncycastle.asn1.OIDTokenizer",
      "org.bouncycastle.asn1.x509.AlgorithmIdentifier",
      "org.bouncycastle.asn1.DERTags",
      "org.bouncycastle.asn1.ASN1Null",
      "org.bouncycastle.asn1.DEROutputStream"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CertificationRequestInfo_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.bouncycastle.asn1.pkcs.CertificationRequestInfo",
      "org.bouncycastle.asn1.ASN1Encodable",
      "org.bouncycastle.asn1.DERObject",
      "org.bouncycastle.asn1.ASN1Object",
      "org.bouncycastle.asn1.DERObjectIdentifier",
      "org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers",
      "org.bouncycastle.asn1.x509.X509Name",
      "org.bouncycastle.asn1.ASN1Sequence",
      "org.bouncycastle.asn1.DERSequence",
      "org.bouncycastle.asn1.DERInteger",
      "org.bouncycastle.asn1.BERSequence",
      "org.bouncycastle.asn1.ASN1Sequence$1",
      "org.bouncycastle.asn1.x509.SubjectPublicKeyInfo",
      "org.bouncycastle.asn1.x509.X509NameEntryConverter",
      "org.bouncycastle.asn1.x509.X509DefaultEntryConverter",
      "org.bouncycastle.asn1.x509.AlgorithmIdentifier",
      "org.bouncycastle.asn1.x509.X509NameTokenizer",
      "org.bouncycastle.asn1.DERBitString",
      "org.bouncycastle.asn1.DEROutputStream",
      "org.bouncycastle.asn1.ASN1InputStream$1",
      "org.bouncycastle.asn1.ASN1InputStream",
      "org.bouncycastle.asn1.ASN1Null",
      "org.bouncycastle.asn1.DERNull",
      "org.bouncycastle.asn1.ASN1Set",
      "org.bouncycastle.asn1.DERSet",
      "org.bouncycastle.asn1.ASN1TaggedObject",
      "org.bouncycastle.asn1.DERTaggedObject",
      "org.bouncycastle.asn1.BERTaggedObject",
      "org.bouncycastle.asn1.DERConstructedSequence",
      "org.bouncycastle.asn1.DERBoolean",
      "org.bouncycastle.asn1.DEREncodableVector",
      "org.bouncycastle.asn1.BERSet",
      "org.bouncycastle.asn1.BERConstructedSequence",
      "org.bouncycastle.asn1.ASN1EncodableVector",
      "org.bouncycastle.asn1.DERApplicationSpecific",
      "org.bouncycastle.asn1.DERGeneralizedTime",
      "org.bouncycastle.asn1.ASN1OutputStream",
      "org.bouncycastle.asn1.DERUniversalString",
      "org.bouncycastle.util.Strings",
      "org.bouncycastle.asn1.DERConstructedSet",
      "org.bouncycastle.asn1.OIDTokenizer",
      "org.bouncycastle.asn1.DERBMPString",
      "org.bouncycastle.asn1.DERNumericString",
      "org.bouncycastle.asn1.ASN1Set$1",
      "org.bouncycastle.asn1.DERT61String",
      "org.bouncycastle.asn1.ASN1OctetString",
      "org.bouncycastle.asn1.DEROctetString",
      "org.bouncycastle.asn1.DERUTCTime",
      "org.bouncycastle.asn1.DERUTF8String",
      "org.bouncycastle.asn1.BERConstructedOctetString",
      "org.bouncycastle.asn1.DERIA5String",
      "org.bouncycastle.asn1.DERVisibleString",
      "org.bouncycastle.asn1.DERUnknownTag",
      "org.bouncycastle.asn1.DERPrintableString",
      "org.bouncycastle.asn1.LimitedInputStream",
      "org.bouncycastle.asn1.DefiniteLengthInputStream",
      "org.bouncycastle.asn1.DEREnumerated",
      "org.bouncycastle.asn1.DERGeneralString",
      "org.bouncycastle.util.encoders.HexTranslator",
      "org.bouncycastle.util.encoders.Hex",
      "org.bouncycastle.asn1.BERNull"
    );
  }
}

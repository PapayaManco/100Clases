/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 10 01:40:08 GMT 2024
 */

package macaw.presentationLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import macaw.presentationLayer.AvailabilityStateEditor;
import macaw.system.SessionProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MacawStateEditor_ESTest extends MacawStateEditor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      AvailabilityStateEditor availabilityStateEditor0 = null;
      try {
        availabilityStateEditor0 = new AvailabilityStateEditor(sessionProperties0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}

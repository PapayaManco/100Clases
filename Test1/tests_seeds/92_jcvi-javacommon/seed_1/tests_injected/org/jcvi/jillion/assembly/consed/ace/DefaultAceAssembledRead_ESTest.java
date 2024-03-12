/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 12:40:14 GMT 2024
 */

package org.jcvi.jillion.assembly.consed.ace;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jcvi.jillion.assembly.consed.ace.AceAssembledReadBuilder;
import org.jcvi.jillion.assembly.consed.ace.DefaultAceAssembledRead;
import org.jcvi.jillion.assembly.consed.ace.PhdInfo;
import org.jcvi.jillion.core.Direction;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.core.residue.nt.Nucleotide;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultAceAssembledRead_ESTest extends DefaultAceAssembledRead_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence1).getLength();
      Direction direction0 = Direction.FORWARD;
      Range range0 = Range.of(524L, 524L);
      MockDate mockDate0 = new MockDate(1, (-2106), 0);
      PhdInfo phdInfo0 = new PhdInfo("AO3=3tr2C", "AO3=3tr2C", mockDate0);
      // Undeclared exception!
      try { 
        DefaultAceAssembledRead.createBuilder(nucleotideSequence0, "AO3=3tr2C", nucleotideSequence1, (-2106), direction0, range0, phdInfo0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // read goes before the reference
         //
         verifyException("org.jcvi.jillion.internal.assembly.DefaultAssembledRead$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Direction direction0 = Direction.REVERSE;
      Range range0 = Range.of((long) 0);
      MockDate mockDate0 = new MockDate(3787L);
      PhdInfo phdInfo0 = new PhdInfo("", "", mockDate0);
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(nucleotideSequence0).getLength();
      AceAssembledReadBuilder aceAssembledReadBuilder0 = DefaultAceAssembledRead.createBuilder(nucleotideSequence0, "Y@5vcI(o48Vw-UV", nucleotideSequence0, 0, direction0, range0, phdInfo0, 0);
      assertEquals(0, aceAssembledReadBuilder0.getUngappedFullLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      DefaultAceAssembledRead.IllegalReAbacus defaultAceAssembledRead_IllegalReAbacus0 = new DefaultAceAssembledRead.IllegalReAbacus(linkedList0, linkedList0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Direction direction0 = Direction.REVERSE;
      Range range0 = Range.of((long) 3);
      // Undeclared exception!
      try { 
        DefaultAceAssembledRead.createBuilder((NucleotideSequence) null, "file can not be null", (NucleotideSequence) null, 3, direction0, range0, (PhdInfo) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.internal.assembly.DefaultAssembledRead$Builder", e);
      }
  }
}
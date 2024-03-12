/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 10 02:39:19 GMT 2024
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.PieChartRenderer;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PieChartRenderer_ESTest extends PieChartRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((CoordSystem) null, objectChartDataModel0);
      Rectangle rectangle0 = new Rectangle(2147473663, 2147473660, 2449, 0);
      pieChartRenderer0.setBounds(rectangle0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(graphics2D0).getRenderingHint(any(java.awt.RenderingHints.Key.class));
      // Undeclared exception!
      pieChartRenderer0.renderChart(graphics2D0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer(objectChartDataModel0);
      // Undeclared exception!
      try { 
        pieChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.PieChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((CoordSystem) null, objectChartDataModel0);
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0, ", ", ", ");
      Rectangle rectangle0 = coordSystem0.getBounds();
      pieChartRenderer0.setBounds(rectangle0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(pieChartRenderer0).when(graphics2D0).getRenderingHint(any(java.awt.RenderingHints.Key.class));
      // Undeclared exception!
      pieChartRenderer0.renderChart(graphics2D0);
  }
}
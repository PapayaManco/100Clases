/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 06:28:08 GMT 2024
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.util.Stack;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.FixedHeightLayoutCache;
import javax.swing.tree.TreeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.exolab.jms.tools.admin.AdminInfo;
import org.exolab.jms.tools.admin.OpenJMSConsumer;
import org.exolab.jms.tools.admin.OpenJMSQueue;
import org.exolab.jms.tools.admin.OpenJMSTopic;
import org.exolab.jms.tools.admin.OpenJMSTopicFolder;
import org.exolab.jms.tools.admin.OpenJMSUser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdminInfo_ESTest extends AdminInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      Stack<OpenJMSTopic> stack0 = new Stack<OpenJMSTopic>();
      JTree jTree0 = new JTree(stack0);
      Component component0 = adminInfo0.getTreeCellRendererComponent(jTree0, stack0, false, false, true, 2274, true);
      assertFalse(component0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      FixedHeightLayoutCache fixedHeightLayoutCache0 = new FixedHeightLayoutCache();
      JTree jTree0 = new JTree((TreeModel) null);
      JPanel jPanel0 = (JPanel)adminInfo0.getTreeCellRendererComponent(jTree0, fixedHeightLayoutCache0, false, true, true, (-872), false);
      assertFalse(jPanel0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      // Undeclared exception!
      try { 
        adminInfo0.getTreeCellRendererComponent((JTree) null, (Object) null, false, false, false, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      OpenJMSTopicFolder openJMSTopicFolder0 = new OpenJMSTopicFolder((JTree) null);
      JTree jTree0 = new JTree(openJMSTopicFolder0);
      Component component0 = adminInfo0.getTreeCellRendererComponent(jTree0, openJMSTopicFolder0, true, true, true, 0, true);
      assertFalse(component0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      DefaultMutableTreeNode defaultMutableTreeNode0 = new DefaultMutableTreeNode();
      JTree jTree0 = new JTree(defaultMutableTreeNode0, true);
      OpenJMSUser openJMSUser0 = new OpenJMSUser((String) null, jTree0);
      Component component0 = adminInfo0.getTreeCellRendererComponent(jTree0, openJMSUser0, true, true, true, 0, true);
      assertTrue(component0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      JTree jTree0 = new JTree();
      OpenJMSTopic openJMSTopic0 = new OpenJMSTopic("", jTree0);
      JPanel jPanel0 = (JPanel)adminInfo0.getTreeCellRendererComponent(jTree0, openJMSTopic0, true, true, true, 1, true);
      assertFalse(jPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      JTree jTree0 = new JTree();
      OpenJMSQueue openJMSQueue0 = new OpenJMSQueue((String) null, jTree0);
      JPanel jPanel0 = (JPanel)adminInfo0.getTreeCellRendererComponent(jTree0, openJMSQueue0, true, true, true, 0, true);
      assertFalse(jPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AdminInfo adminInfo0 = new AdminInfo();
      JTree jTree0 = new JTree();
      OpenJMSConsumer openJMSConsumer0 = new OpenJMSConsumer("3D*=tI#zR0^", jTree0);
      JPanel jPanel0 = (JPanel)adminInfo0.getTreeCellRendererComponent(jTree0, openJMSConsumer0, true, true, true, 1, true);
      assertFalse(jPanel0.isFocusTraversalPolicySet());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 12:23:06 GMT 2024
 */

package com.lts.util.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.util.DefaultSharedQueue;
import com.lts.util.scheduler.NewScheduler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NewScheduler_ESTest extends NewScheduler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      newScheduler0.initialize();
      assertEquals(2000L, newScheduler0.getCYCLE_TIMEKEYINJECTED());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      newScheduler0.deliverEvents();
      assertEquals(2000L, newScheduler0.getCYCLE_TIMEKEYINJECTED());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      long long0 = newScheduler0.getNextSleepTime();
      assertEquals(2000L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      // Undeclared exception!
      try { 
        newScheduler0.processException((Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.util.scheduler.NewScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      newScheduler0.notifyAt(defaultSharedQueue0, 287L);
      newScheduler0.cancel(defaultSharedQueue0);
      assertNull(newScheduler0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      newScheduler0.cancel(defaultSharedQueue0);
      assertEquals(2000L, newScheduler0.getCYCLE_TIMEKEYINJECTED());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewScheduler.startSystem();
      NewScheduler newScheduler0 = NewScheduler.ourInstance;
      newScheduler0.process();
      assertNull(newScheduler0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewScheduler.getInstance();
      NewScheduler.startSystem();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewScheduler.getInstance();
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      assertNull(newScheduler0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      assertNotNull(newScheduler0);
      
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent((-987L), defaultSharedQueue0, newScheduler0);
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent1 = new NewScheduler.ScheduledEvent((-1392409281915L), defaultSharedQueue0, newScheduler_ScheduledEvent0);
      int int0 = newScheduler_ScheduledEvent0.compareTo(newScheduler_ScheduledEvent1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      Object object0 = new Object();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent((-2951L), defaultSharedQueue0, object0);
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent1 = new NewScheduler.ScheduledEvent((-882L), defaultSharedQueue0, newScheduler_ScheduledEvent0);
      int int0 = newScheduler_ScheduledEvent0.compareTo(newScheduler_ScheduledEvent1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      assertNotNull(newScheduler0);
      
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent((-987L), defaultSharedQueue0, newScheduler0);
      int int0 = newScheduler_ScheduledEvent0.compareTo(newScheduler_ScheduledEvent0);
      assertEquals(0, int0);
      assertEquals((-987L), newScheduler_ScheduledEvent0.scheduledTime);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      InterruptedException interruptedException0 = new InterruptedException("t");
      newScheduler0.processInterrupt(interruptedException0);
      assertEquals(2000L, newScheduler0.getCYCLE_TIMEKEYINJECTED());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      InterruptedException interruptedException0 = new InterruptedException("t");
      MockException mockException0 = new MockException(interruptedException0);
      newScheduler0.processException(mockException0);
      assertEquals(2000L, NewScheduler.CYCLE_TIME);
  }
}

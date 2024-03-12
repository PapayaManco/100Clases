/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 10 02:24:10 GMT 2024
 */

package com.lts.util.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.util.DefaultSharedQueue;
import com.lts.util.SharedQueue;
import com.lts.util.scheduler.NewScheduler;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NewScheduler_ESTest extends NewScheduler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NewScheduler.startSystem();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent((-2657L), (SharedQueue) null, (Object) null);
      newScheduler_ScheduledEvent0.queue = null;
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent1 = new NewScheduler.ScheduledEvent((-2657L), (SharedQueue) null, newScheduler_ScheduledEvent0);
      newScheduler_ScheduledEvent0.queue = null;
      newScheduler_ScheduledEvent1.scheduledTime = 2393L;
      Object object0 = new Object();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent2 = new NewScheduler.ScheduledEvent(2393L, (SharedQueue) null, object0);
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      defaultSharedQueue0.put((Object) null);
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent3 = new NewScheduler.ScheduledEvent(2542L, (SharedQueue) null, defaultSharedQueue0);
      newScheduler_ScheduledEvent3.compareTo(newScheduler_ScheduledEvent1);
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      newScheduler0.deliverEvents();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      NewScheduler.startSystem();
      InterruptedException interruptedException0 = new InterruptedException();
      newScheduler0.noMethod();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[9];
      String string0 = "com.lts.util.scheduler.NewScheduler";
      String string1 = "Running";
      String string2 = "%}-xkPW%45xGJ;uB";
      StackTraceElement stackTraceElement0 = new StackTraceElement("com.lts.util.scheduler.NewScheduler", "Running", "%}-xkPW%45xGJ;uB", "", "", "com.lts.util.scheduler.NewScheduler", 8);
      stackTraceElementArray0[0] = stackTraceElement0;
      String string3 = "";
      String string4 = null;
      StackTraceElement stackTraceElement1 = null;
      try {
        stackTraceElement1 = new StackTraceElement("com.lts.util.scheduler.NewScheduler", "com.lts.util.scheduler.NewScheduler", "", (String) null, "", "Running", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Declaring class is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      NewScheduler.startSystem();
      newScheduler0.getNextSleepTime();
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      // Undeclared exception!
      try { 
        defaultSharedQueue0.performNotify();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      newScheduler0.initialize();
      InterruptedException interruptedException0 = new InterruptedException();
      newScheduler0.processInterrupt(interruptedException0);
      SharedQueue sharedQueue0 = null;
      newScheduler0.cancel((SharedQueue) null);
      newScheduler0.cancel((SharedQueue) null);
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent(2000L, (SharedQueue) null, (Object) null);
      long long0 = 0L;
      // Undeclared exception!
      try { 
        interruptedException0.addSuppressed((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot suppress a null exception.
         //
         verifyException("java.lang.Throwable", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      newScheduler0.initialize();
      newScheduler0.getNextSleepTime();
      InterruptedException interruptedException0 = new InterruptedException();
      newScheduler0.processInterrupt(interruptedException0);
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      defaultSharedQueue0.getReport();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[1];
      StackTraceElement stackTraceElement0 = new StackTraceElement("===] Shared Queue Report [===\n\nQueue contents:\n", "com.lts.util.scheduler.NewScheduler$ScheduledEvent", "", "com.lts.util.scheduler.NewScheduler", "com.lts.util.scheduler.NewScheduler", "com.lts.util.scheduler.NewScheduler$ScheduledEvent", (-1117));
      stackTraceElement0.getModuleName();
      stackTraceElementArray0[0] = stackTraceElement0;
      interruptedException0.setStackTrace(stackTraceElementArray0);
      newScheduler0.deliverEvents();
      newScheduler0.cancel(defaultSharedQueue0);
      // Undeclared exception!
      try { 
        defaultSharedQueue0.performNotify();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      MockException mockException0 = new MockException();
      newScheduler0.stop();
      mockException0.getCause();
      mockException0.getStackTrace();
      newScheduler0.processException(mockException0);
      newScheduler0.process();
      assertNull(newScheduler0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      Map<SharedQueue, NewScheduler.ScheduledEvent> map0 = newScheduler0.myQueueToNext;
      newScheduler0.myQueueToNext = map0;
      newScheduler0.process();
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      // Undeclared exception!
      try { 
        defaultSharedQueue0.performWait();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      newScheduler0.deliverEvents();
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      newScheduler0.cancel(defaultSharedQueue0);
      newScheduler0.noMethod();
      defaultSharedQueue0.getReport();
      // Undeclared exception!
      try { 
        defaultSharedQueue0.performWait();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      newScheduler0.deliverEvents();
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      // Undeclared exception!
      try { 
        defaultSharedQueue0.performWait();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      newScheduler0.deliverEvents();
      MockException mockException0 = new MockException();
      mockException0.getStackTrace();
      newScheduler0.processException(mockException0);
      long long0 = newScheduler0.getNextSleepTime();
      assertEquals(2000L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      NewScheduler.ourInstance = newScheduler0;
      newScheduler0.myName = "pl(bjOv3qsmO&2}G<";
      newScheduler0.threadStartThread();
      newScheduler0.initialize();
      newScheduler0.start();
      NewScheduler.getInstance();
      InterruptedException interruptedException0 = new InterruptedException();
      NewScheduler.ourInstance.processException(interruptedException0);
      interruptedException0.getLocalizedMessage();
      interruptedException0.initCause((Throwable) null);
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("pl(bjOv3qsmO&2}G<", "pl(bjOv3qsmO&2}G<");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // pl(bjOv3qsmO&2}G<
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NewScheduler.startSystem();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent((-2657L), (SharedQueue) null, (Object) null);
      newScheduler_ScheduledEvent0.queue = null;
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent1 = new NewScheduler.ScheduledEvent((-2657L), (SharedQueue) null, newScheduler_ScheduledEvent0);
      newScheduler_ScheduledEvent0.queue = null;
      newScheduler_ScheduledEvent1.scheduledTime = 2393L;
      newScheduler_ScheduledEvent0.compareTo(newScheduler_ScheduledEvent1);
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      newScheduler0.getNextSleepTime();
      newScheduler0.cancel((SharedQueue) null);
      newScheduler0.initialize();
      // Undeclared exception!
      try { 
        newScheduler0.notifyAt((SharedQueue) null, 2000L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.util.scheduler.NewScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent(2000L, (SharedQueue) null, defaultSharedQueue0);
      newScheduler_ScheduledEvent0.compareTo(newScheduler_ScheduledEvent0);
      NewScheduler newScheduler1 = NewScheduler.getInstance();
      newScheduler1.getNextSleepTime();
      newScheduler0.initialize();
      DefaultSharedQueue defaultSharedQueue1 = new DefaultSharedQueue();
      newScheduler0.notifyAt(defaultSharedQueue1, 2000L);
      NewScheduler newScheduler2 = new NewScheduler();
      newScheduler2.process();
      assertFalse(newScheduler2.equals((Object)newScheduler1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NewScheduler.getInstance();
      Object object0 = new Object();
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent0 = new NewScheduler.ScheduledEvent(2834L, (SharedQueue) null, object0);
      NewScheduler.ScheduledEvent newScheduler_ScheduledEvent1 = new NewScheduler.ScheduledEvent(2000L, (SharedQueue) null, newScheduler_ScheduledEvent0);
      // Undeclared exception!
      try { 
        newScheduler_ScheduledEvent1.compareTo((NewScheduler.ScheduledEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.util.scheduler.NewScheduler$ScheduledEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      MockException mockException0 = new MockException("impossible state!");
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[8];
      StackTraceElement stackTraceElement0 = new StackTraceElement("", "impossible state!", "impossible state!", "X.H`>[]Yb)__", "impossible state!", "Wait", (-2450));
      stackTraceElementArray0[0] = stackTraceElement0;
      StackTraceElement stackTraceElement1 = new StackTraceElement("X.H`>[]Yb)__", "", "", "", "impossible state!", "Wait", 505);
      stackTraceElementArray0[1] = stackTraceElement1;
      StackTraceElement stackTraceElement2 = new StackTraceElement("", "", "", (-832));
      stackTraceElementArray0[2] = stackTraceElement2;
      StackTraceElement stackTraceElement3 = new StackTraceElement("", "impossible state!", "", "impossible state!", "X.H`>[]Yb)__", "+reYqG7I]O9D:,e+Y[", 505);
      stackTraceElementArray0[3] = stackTraceElement3;
      StackTraceElement stackTraceElement4 = new StackTraceElement("X.H`>[]Yb)__", "impossible state!", "X.H`>[]Yb)__", 505);
      stackTraceElementArray0[4] = stackTraceElement4;
      StackTraceElement stackTraceElement5 = new StackTraceElement("", "impossible state!", "impossible state!", "Initialized", "A\"98pTFjPPtu\"ZwG(d", "", (-2450));
      stackTraceElementArray0[5] = stackTraceElement5;
      StackTraceElement stackTraceElement6 = new StackTraceElement("", "impossible state!", "", 0);
      stackTraceElementArray0[6] = stackTraceElement6;
      StackTraceElement stackTraceElement7 = new StackTraceElement("+reYqG7I]O9D:,e+Y[", "+reYqG7I]O9D:,e+Y[", "Wait", 505);
      stackTraceElementArray0[7] = stackTraceElement7;
      mockException0.setStackTrace(stackTraceElementArray0);
      newScheduler0.processException(mockException0);
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      newScheduler0.notifyAt(defaultSharedQueue0, (-4630L));
      assertNull(newScheduler0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NewScheduler newScheduler0 = NewScheduler.getInstance();
      InterruptedException interruptedException0 = new InterruptedException();
      // Undeclared exception!
      try { 
        newScheduler0.threadInterrupt(interruptedException0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // <evosuite> called while in state Starting
         //
         verifyException("com.lts.util.scheduler.ControllableThread", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      newScheduler0.initialize("kq?*CJ[m3R");
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      defaultSharedQueue0.put(newScheduler0);
      defaultSharedQueue0.next(2000L);
      // Undeclared exception!
      try { 
        defaultSharedQueue0.performWait();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NewScheduler newScheduler0 = new NewScheduler();
      MockException mockException0 = new MockException();
      mockException0.getCause();
      mockException0.getStackTrace();
      newScheduler0.processException(mockException0);
      assertNull(newScheduler0.getName());
  }
}

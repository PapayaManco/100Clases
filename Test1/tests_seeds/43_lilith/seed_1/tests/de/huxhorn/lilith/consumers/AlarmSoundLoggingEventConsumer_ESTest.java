/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 10 00:54:52 GMT 2024
 */

package de.huxhorn.lilith.consumers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.huxhorn.lilith.consumers.AlarmSoundLoggingEventConsumer;
import de.huxhorn.lilith.data.eventsource.EventIdentifier;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.eventsource.SourceIdentifier;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.sulky.sounds.Sounds;
import de.huxhorn.sulky.sounds.jlayer.JLayerSounds;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AlarmSoundLoggingEventConsumer_ESTest extends AlarmSoundLoggingEventConsumer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      JLayerSounds jLayerSounds0 = new JLayerSounds();
      alarmSoundLoggingEventConsumer0.setSounds(jLayerSounds0);
      jLayerSounds0.setMute(true);
      Sounds sounds0 = alarmSoundLoggingEventConsumer0.getSounds();
      assertSame(sounds0, jLayerSounds0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      JLayerSounds jLayerSounds0 = new JLayerSounds();
      alarmSoundLoggingEventConsumer0.setSounds(jLayerSounds0);
      Sounds sounds0 = alarmSoundLoggingEventConsumer0.getSounds();
      assertFalse(sounds0.isMute());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      JLayerSounds jLayerSounds0 = new JLayerSounds();
      alarmSoundLoggingEventConsumer0.setSounds(jLayerSounds0);
      LinkedList<EventWrapper<LoggingEvent>> linkedList0 = new LinkedList<EventWrapper<LoggingEvent>>();
      EventIdentifier eventIdentifier0 = new EventIdentifier();
      LoggingEvent loggingEvent0 = new LoggingEvent();
      LoggingEvent.Level loggingEvent_Level0 = LoggingEvent.Level.ERROR;
      loggingEvent0.setLevel(loggingEvent_Level0);
      EventWrapper<LoggingEvent> eventWrapper0 = new EventWrapper<LoggingEvent>(eventIdentifier0, loggingEvent0);
      linkedList0.addFirst(eventWrapper0);
      alarmSoundLoggingEventConsumer0.consume(linkedList0);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      JLayerSounds jLayerSounds0 = new JLayerSounds();
      alarmSoundLoggingEventConsumer0.setSounds(jLayerSounds0);
      LinkedList<EventWrapper<LoggingEvent>> linkedList0 = new LinkedList<EventWrapper<LoggingEvent>>();
      EventWrapper<LoggingEvent> eventWrapper0 = new EventWrapper<LoggingEvent>();
      linkedList0.push(eventWrapper0);
      alarmSoundLoggingEventConsumer0.consume(linkedList0);
      assertTrue(linkedList0.contains(eventWrapper0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      JLayerSounds jLayerSounds0 = new JLayerSounds();
      alarmSoundLoggingEventConsumer0.setSounds(jLayerSounds0);
      SourceIdentifier sourceIdentifier0 = new SourceIdentifier("de.huxhorn.lilith.consumers.AlarmSoundLoggingEventConsumer", "de.huxhorn.lilith.consumers.AlarmSoundLoggingEventConsumer");
      LoggingEvent loggingEvent0 = new LoggingEvent();
      EventWrapper<LoggingEvent> eventWrapper0 = new EventWrapper<LoggingEvent>(sourceIdentifier0, 1128L, loggingEvent0);
      List<EventWrapper<LoggingEvent>> list0 = List.of(eventWrapper0, eventWrapper0, eventWrapper0, eventWrapper0, eventWrapper0);
      alarmSoundLoggingEventConsumer0.consume(list0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      LinkedList<EventWrapper<LoggingEvent>> linkedList0 = new LinkedList<EventWrapper<LoggingEvent>>();
      alarmSoundLoggingEventConsumer0.consume(linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JLayerSounds jLayerSounds0 = new JLayerSounds();
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      alarmSoundLoggingEventConsumer0.setSounds(jLayerSounds0);
      // Undeclared exception!
      try { 
        alarmSoundLoggingEventConsumer0.consume((List<EventWrapper<LoggingEvent>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.huxhorn.lilith.consumers.AlarmSoundLoggingEventConsumer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AlarmSoundLoggingEventConsumer alarmSoundLoggingEventConsumer0 = new AlarmSoundLoggingEventConsumer();
      Sounds sounds0 = alarmSoundLoggingEventConsumer0.getSounds();
      assertNull(sounds0);
  }
}

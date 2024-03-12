/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 10:01:50 GMT 2024
 */

package com.liferay.portal.service.persistence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.service.persistence.TeamFinderImpl;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.collection.PersistentMap;
import org.hibernate.engine.SessionImplementor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TeamFinderImpl_ESTest extends TeamFinderImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try { 
        teamFinderImpl0.countByG_N_D((-1L), "", "A'On).o(KU=Y)2x4?s", linkedHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.service.persistence.impl.BasePersistenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      String string0 = teamFinderImpl0.getWhere("COUNT_VALUE");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      String string0 = teamFinderImpl0.getJoin("com.liferay.portal.service.persistence.TeamFinder.countByG_N_D");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put((String) null, teamFinderImpl0);
      // Undeclared exception!
      try { 
        teamFinderImpl0.getWhere(linkedHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put("usersUserGroups", teamFinderImpl0);
      // Undeclared exception!
      try { 
        teamFinderImpl0.getWhere(linkedHashMap0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.util.dao.orm.CustomSQLUtil
         //
         verifyException("com.liferay.portal.service.persistence.TeamFinderImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      Hashtable<TeamFinderImpl, TeamFinderImpl> hashtable0 = new Hashtable<TeamFinderImpl, TeamFinderImpl>();
      PersistentMap persistentMap0 = new PersistentMap(sessionImplementor0, hashtable0);
      hashtable0.put(teamFinderImpl0, teamFinderImpl0);
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>(persistentMap0);
      // Undeclared exception!
      try { 
        teamFinderImpl0.getWhere(linkedHashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.liferay.portal.service.persistence.TeamFinderImpl cannot be cast to class java.lang.String (com.liferay.portal.service.persistence.TeamFinderImpl is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4e31de3a; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("com.liferay.portal.service.persistence.TeamFinderImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      // Undeclared exception!
      try { 
        teamFinderImpl0.getWhere((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put((String) null, teamFinderImpl0);
      // Undeclared exception!
      try { 
        teamFinderImpl0.getJoin(linkedHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      // Undeclared exception!
      try { 
        teamFinderImpl0.getJoin((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      // Undeclared exception!
      try { 
        teamFinderImpl0.getJoin("usersTeams");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.util.dao.orm.CustomSQLUtil
         //
         verifyException("com.liferay.portal.service.persistence.TeamFinderImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put("class-name", "class-name");
      teamFinderImpl0.setJoin((QueryPos) null, linkedHashMap0);
      assertEquals(" ORDER BY ", teamFinderImpl0.getORDER_BY_CLAUSEKEYINJECTED());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      teamFinderImpl0.setJoin((QueryPos) null, (LinkedHashMap<String, Object>) null);
      assertEquals(" <= ? AND ", teamFinderImpl0.getWHERE_LESSER_THAN_HAS_NEXTKEYINJECTED());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      // Undeclared exception!
      try { 
        teamFinderImpl0.getWhere("usersTeams");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.util.dao.orm.CustomSQLUtil
         //
         verifyException("com.liferay.portal.service.persistence.TeamFinderImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put("%m[$^gx", (Object) null);
      String string0 = teamFinderImpl0.getWhere(linkedHashMap0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      String string0 = teamFinderImpl0.getWhere(linkedHashMap0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      String string0 = teamFinderImpl0.getWhere((LinkedHashMap<String, Object>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Object object0 = new Object();
      linkedHashMap0.put("usersTeams", object0);
      // Undeclared exception!
      try { 
        teamFinderImpl0.getJoin(linkedHashMap0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.util.dao.orm.CustomSQLUtil
         //
         verifyException("com.liferay.portal.service.persistence.TeamFinderImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put("usersUserGroups", teamFinderImpl0);
      // Undeclared exception!
      try { 
        teamFinderImpl0.getJoin(linkedHashMap0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.util.dao.orm.CustomSQLUtil
         //
         verifyException("com.liferay.portal.service.persistence.TeamFinderImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put("%m[$^gx", (Object) null);
      String string0 = teamFinderImpl0.getJoin(linkedHashMap0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      String string0 = teamFinderImpl0.getJoin(linkedHashMap0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      String string0 = teamFinderImpl0.getJoin((LinkedHashMap<String, Object>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TeamFinderImpl teamFinderImpl0 = new TeamFinderImpl();
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try { 
        teamFinderImpl0.findByG_N_D((-942L), "l+", "", (LinkedHashMap<String, Object>) null, (-1549), (-1940111922), baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.service.persistence.impl.BasePersistenceImpl", e);
      }
  }
}
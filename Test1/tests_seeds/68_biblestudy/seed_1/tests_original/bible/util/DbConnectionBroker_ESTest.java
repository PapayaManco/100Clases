/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 06:36:21 GMT 2024
 */

package bible.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bible.util.DbConnectionAttributes;
import bible.util.DbConnectionBroker;
import java.sql.SQLException;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DbConnectionBroker_ESTest extends DbConnectionBroker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes(22);
      dbConnectionBroker0.release(dbConnectionAttributes0);
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes(0);
      dbConnectionBroker0.disconnect(dbConnectionAttributes0);
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      // Undeclared exception!
      try { 
        dbConnectionBroker0.release((DbConnectionAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bible.util.DbConnectionBroker", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes(736);
      // Undeclared exception!
      try { 
        dbConnectionBroker0.release(dbConnectionAttributes0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 736 out of bounds for length 30
         //
         verifyException("bible.util.DbConnectionBroker", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      // Undeclared exception!
      try { 
        dbConnectionBroker0.disconnect((DbConnectionAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bible.util.DbConnectionBroker", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes(1565);
      // Undeclared exception!
      try { 
        dbConnectionBroker0.disconnect(dbConnectionAttributes0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1565 out of bounds for length 30
         //
         verifyException("bible.util.DbConnectionBroker", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("bible/properties/Database.properties");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "'");
      DbConnectionBroker dbConnectionBroker0 = null;
      try {
        dbConnectionBroker0 = new DbConnectionBroker();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("bible/properties/Database.properties");
      String string0 = "`e8h3lv3N#\\uG}.8mf";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      DbConnectionBroker dbConnectionBroker0 = null;
      try {
        dbConnectionBroker0 = new DbConnectionBroker();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed \\uxxxx encoding.
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      Vector vector0 = dbConnectionBroker0.getOpenConnections();
      assertTrue(vector0.isEmpty());
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      String string0 = dbConnectionBroker0.toString(false);
      assertEquals("bible.util.DbConnectionBroker[ options=bible.util.Options[ url=jdbc:weblogic:mssqlserver4:_db@localhost:1433, username=sa, range=10-30, driverName=weblogic.jdbc.mssqlserver4.Driver], maxConnections=0, maxReached=0, lastTime=0]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      String string0 = dbConnectionBroker0.toString(true);
      assertEquals("bible.util.DbConnectionBroker[ options=bible.util.Options[ url=jdbc:weblogic:mssqlserver4:_db@localhost:1433, username=sa, range=10-30, driverName=weblogic.jdbc.mssqlserver4.Driver], maxConnections=0, maxReached=0, lastTime=0 Open: ]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      assertEquals(30, dbConnectionBroker0.getMax());
      
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes(10);
      dbConnectionBroker0.release(dbConnectionAttributes0);
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes((-2690));
      dbConnectionBroker0.release(dbConnectionAttributes0);
      assertEquals(30, dbConnectionBroker0.getMax());
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes(8);
      dbConnectionBroker0.release(dbConnectionAttributes0);
      dbConnectionBroker0.disconnectAll();
      assertEquals(0, dbConnectionBroker0.getMaxReached());
      assertEquals(30, dbConnectionBroker0.getMax());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes dbConnectionAttributes0 = new DbConnectionAttributes(0);
      dbConnectionBroker0.release(dbConnectionAttributes0);
      try { 
        dbConnectionBroker0.getConnectionAttributes();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // No suitable driver found for jdbc:weblogic:mssqlserver4:_db@localhost:1433
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      try { 
        dbConnectionBroker0.getConnectionAttributes();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // No suitable driver found for jdbc:weblogic:mssqlserver4:_db@localhost:1433
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      String string0 = dbConnectionBroker0.toString();
      assertEquals("bible.util.DbConnectionBroker[ options=bible.util.Options[ url=jdbc:weblogic:mssqlserver4:_db@localhost:1433, username=sa, range=10-30, driverName=weblogic.jdbc.mssqlserver4.Driver], maxConnections=0, maxReached=0, lastTime=0]", string0);
      assertEquals(30, dbConnectionBroker0.getMax());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      dbConnectionBroker0.getLog();
      assertEquals(30, dbConnectionBroker0.getMax());
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      int int0 = dbConnectionBroker0.getMaxReached();
      assertEquals(0, int0);
      assertEquals(30, dbConnectionBroker0.getMax());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      DbConnectionAttributes[] dbConnectionAttributesArray0 = dbConnectionBroker0.getConnectionAttributesArray();
      assertEquals(30, dbConnectionAttributesArray0.length);
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      dbConnectionBroker0.getURL();
      assertEquals(30, dbConnectionBroker0.getMax());
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      int int0 = dbConnectionBroker0.getMin();
      assertEquals(10, int0);
      assertEquals(30, dbConnectionBroker0.getMax());
      assertEquals(0, dbConnectionBroker0.getMaxReached());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DbConnectionBroker dbConnectionBroker0 = new DbConnectionBroker();
      int int0 = dbConnectionBroker0.getMax();
      assertEquals(0, dbConnectionBroker0.getMaxReached());
      assertEquals(30, int0);
  }
}

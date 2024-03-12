/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 10:35:57 GMT 2024
 */

package org.firebirdsql.gds.impl.jni;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.gds.GDSException;
import org.firebirdsql.gds.XSQLDA;
import org.firebirdsql.gds.impl.jni.isc_db_handle_impl;
import org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class isc_stmt_handle_impl_ESTest extends isc_stmt_handle_impl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(0);
      isc_stmt_handle_impl0.ensureCapacity(0);
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.addWarning((GDSException) null);
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      byte[][] byteArray0 = new byte[2][8];
      isc_stmt_handle_impl0.ensureCapacity(1);
      assertEquals(0, isc_stmt_handle_impl0.size());
      
      isc_stmt_handle_impl0.addRow(byteArray0);
      int int0 = isc_stmt_handle_impl0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      boolean boolean0 = isc_stmt_handle_impl0.isAllRowsFetched();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setUpdateCount(1029);
      int int0 = isc_stmt_handle_impl0.getUpdateCount();
      assertEquals(1029, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setUpdateCount((-1932));
      int int0 = isc_stmt_handle_impl0.getUpdateCount();
      assertEquals((-1932), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      assertEquals(0, isc_stmt_handle_impl0.getStatementType());
      
      isc_stmt_handle_impl0.setStatementType(1);
      int int0 = isc_stmt_handle_impl0.getStatementType();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      assertEquals(0, isc_stmt_handle_impl0.getStatementType());
      
      isc_stmt_handle_impl0.setStatementType((-1));
      int int0 = isc_stmt_handle_impl0.getStatementType();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      assertEquals(0, isc_stmt_handle_impl0.getSelectCount());
      
      isc_stmt_handle_impl0.setSelectCount(5);
      int int0 = isc_stmt_handle_impl0.getSelectCount();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setSelectCount((-3047));
      int int0 = isc_stmt_handle_impl0.getSelectCount();
      assertEquals((-3047), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setResp_object(930);
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setResp_blob_id(36);
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setResp_blob_id((-1541L));
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setRdb_id_ptr(15, 15);
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setRdb_id_ptr((-2179), 0);
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setProtocol(3980);
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setProtocol((-4364));
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_db_handle_impl0.setODSMinorVersion(6375);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setODSMinorVersion((-186));
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_db_handle_impl0.setODSMajorVersion(6375);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setODSMajorVersion((-2729));
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.invalidate();
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setDialect(930);
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.setDialect((-186));
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      isc_stmt_handle_impl0.getRsr_rdb();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setRsr_id_ptr(132, 1315);
      int int0 = isc_stmt_handle_impl0.getRsr_id_ptr();
      assertEquals(132, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setRsr_id_ptr((-2913), (-1160));
      int int0 = isc_stmt_handle_impl0.getRsr_id_ptr();
      assertEquals((-1160), isc_stmt_handle_impl0.getRsrId());
      assertEquals((-2913), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setRsr_id_ptr((-2913), (-1160));
      int int0 = isc_stmt_handle_impl0.getRsrId();
      assertEquals((-1160), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(5221);
      byte[][][] byteArray0 = isc_stmt_handle_impl0.getRows();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.size());
      assertEquals(5221, byteArray0.length);
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(0);
      byte[][][] byteArray0 = isc_stmt_handle_impl0.getRows();
      assertEquals(0, isc_stmt_handle_impl0.size());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, byteArray0.length);
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA();
      xSQLDA0.version = 0;
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getOutSqlda();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA();
      xSQLDA0.version = (-1810);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getOutSqlda();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA(2996);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getOutSqlda();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA(65);
      xSQLDA0.sqln = 65;
      xSQLDA0.sqln = (-214);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getOutSqlda();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA(0);
      xSQLDA0.sqld = (-4722);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getOutSqlda();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setInsertCount(15);
      int int0 = isc_stmt_handle_impl0.getInsertCount();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setInsertCount((-4625));
      int int0 = isc_stmt_handle_impl0.getInsertCount();
      assertEquals((-4625), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA();
      xSQLDA0.version = 0;
      isc_stmt_handle_impl0.setInSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getInSqlda();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA();
      xSQLDA0.sqln = (-698);
      isc_stmt_handle_impl0.setInSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getInSqlda();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA(1982);
      isc_stmt_handle_impl0.setInSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getInSqlda();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA();
      xSQLDA0.sqld = (-1);
      isc_stmt_handle_impl0.setInSqlda(xSQLDA0);
      isc_stmt_handle_impl0.getInSqlda();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setDeleteCount(1046);
      int int0 = isc_stmt_handle_impl0.getDeleteCount();
      assertEquals(1046, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setDeleteCount((-2355));
      int int0 = isc_stmt_handle_impl0.getDeleteCount();
      assertEquals((-2355), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      // Undeclared exception!
      try { 
        isc_stmt_handle_impl0.ensureCapacity((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.invalidate();
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      GDSException gDSException0 = new GDSException((-698), (-698), (String) null);
      // Undeclared exception!
      try { 
        isc_stmt_handle_impl0.addWarning(gDSException0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This database handle is invalid and cannot be used anymore.
         //
         verifyException("org.firebirdsql.gds.impl.AbstractIscDbHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(0);
      byte[][] byteArray0 = new byte[0][6];
      // Undeclared exception!
      try { 
        isc_stmt_handle_impl0.addRow(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_db_handle_impl0.invalidate();
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      boolean boolean0 = isc_stmt_handle_impl0.isValid();
      assertFalse(boolean0);
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      boolean boolean0 = isc_stmt_handle_impl0.isValid();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(6);
      isc_stmt_handle_impl0.clearRows();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.clearRows();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.size());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(1);
      isc_stmt_handle_impl0.ensureCapacity(7);
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.size());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.ensureCapacity(1);
      isc_stmt_handle_impl0.ensureCapacity(0);
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.size());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.getRsrId();
      assertEquals(0, int0);
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      
      isc_stmt_handle_impl0.setSingletonResult(true);
      boolean boolean0 = isc_stmt_handle_impl0.isSingletonResult();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      boolean boolean0 = isc_stmt_handle_impl0.isAllRowsFetched();
      assertFalse(boolean0);
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.getRsr_rdb();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.getSelectCount();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.getInSqlda();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.getDeleteCount();
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.getTransaction();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      org.firebirdsql.gds.impl.wire.isc_tr_handle_impl isc_tr_handle_impl0 = new org.firebirdsql.gds.impl.wire.isc_tr_handle_impl();
      isc_stmt_handle_impl0.registerTransaction(isc_tr_handle_impl0);
      isc_stmt_handle_impl0.getTransaction();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      GDSException gDSException0 = GDSException.createWithXAErrorCode((String) null, 1);
      // Undeclared exception!
      try { 
        isc_stmt_handle_impl0.addWarning(gDSException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.getRows();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      boolean boolean0 = isc_stmt_handle_impl0.isSingletonResult();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.size();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, int0);
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      boolean boolean0 = isc_stmt_handle_impl0.hasOpenResultSet();
      assertFalse(boolean0);
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.unregisterTransaction();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.getInsertCount();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertEquals(0, int0);
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      isc_stmt_handle_impl0.setRsr_rdb(isc_db_handle_impl0);
      boolean boolean0 = isc_stmt_handle_impl0.isValid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.getStatementType();
      assertEquals(0, int0);
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.getOutSqlda();
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setRsr_id_ptr(132, 1315);
      int int0 = isc_stmt_handle_impl0.getRsrId();
      assertEquals(132, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertEquals(1315, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.removeRows();
      assertEquals(0, isc_stmt_handle_impl0.size());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setRsrId((-1602));
      assertEquals((-1602), isc_stmt_handle_impl0.getRsrId());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.getUpdateCount();
      assertEquals(0, int0);
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertEquals(0, isc_stmt_handle_impl0.getRsr_id_ptr());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      byte[][] byteArray0 = new byte[5][7];
      // Undeclared exception!
      try { 
        isc_stmt_handle_impl0.addRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      
      isc_stmt_handle_impl0.notifyOpenResultSet();
      boolean boolean0 = isc_stmt_handle_impl0.hasOpenResultSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      int int0 = isc_stmt_handle_impl0.getRsr_id_ptr();
      assertFalse(isc_stmt_handle_impl0.isAllRowsFetched());
      assertFalse(isc_stmt_handle_impl0.hasOpenResultSet());
      assertFalse(isc_stmt_handle_impl0.isSingletonResult());
      assertEquals(0, int0);
  }
}
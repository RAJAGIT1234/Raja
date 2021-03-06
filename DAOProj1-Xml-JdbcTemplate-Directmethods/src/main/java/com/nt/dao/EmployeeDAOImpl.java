package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String GET_EMPS_COUNT="SELECT COUNT(*)FROM EMP";
	private static final String GET_EMPNAME_BY_NO="SELECT ENAME FROM EMP WHERE EMPNO=?";
	private static final String GET_EMPDETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	private static final String GET_EMPDETAILS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?)ORDER BY JOB";
	private static final String INSERT_EMP="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL)VALUES(ENO_SEQ1.NEXTVAL,?,?,?)";
	private static final String ADD_BONUS_EMP_BY_DESG="UPDATE EMP SET SAL=SAL+? WHERE JOB=?";
	
	
	private JdbcTemplate jt;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}

	@Override
	public int getEmpsCount() {
		int count=0;
		count=jt.queryForObject(GET_EMPS_COUNT, Integer.class);
		return count;
	}

	@Override
	public String getEmpNameByNo(int eno) {
		String name=null;
		name=jt.queryForObject(GET_EMPNAME_BY_NO,String.class,eno);
		return name;
	}
	@Override
	public Map<String,Object> getEmpDetailsByNo(int no) {
		Map<String,Object>map=null;
		map=jt.queryForMap(GET_EMPDETAILS_BY_NO,no);
		return map;

	}

	@Override
	public List<Map<String, Object>> getEmpDetailsByDesgs(String desg1, String desg2) {
		
		return jt.queryForList(GET_EMPDETAILS_BY_DESGS,desg1,desg2 );
	}
	@Override
	public int insertEmp(String name, String desg, float salary) {
		int count=0;
		count=jt.update(INSERT_EMP,name,desg,salary);
		return count;
	}

	@Override
	public int addBonusToEmpByDesg(String desg, Float bonus) {
		int count=0;
		count=jt.update(ADD_BONUS_EMP_BY_DESG, bonus,desg);
		return count;
	}
}



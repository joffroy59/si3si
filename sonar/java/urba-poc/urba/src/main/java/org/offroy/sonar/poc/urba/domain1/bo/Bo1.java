package org.offroy.sonar.poc.urba.domain1.bo;

import org.offroy.sonar.poc.urba.domain1.dao.Dao1;

public class Bo1 {

	private Dao1 dao;

	public Bo1() {
		dao = new Dao1();
	}

	public void method1() {
		System.out.println("In " + this.getClass().getName());

		dao.selectAll();
	}

}

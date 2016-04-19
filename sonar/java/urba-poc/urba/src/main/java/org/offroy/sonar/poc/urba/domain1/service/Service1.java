package org.offroy.sonar.poc.urba.domain1.service;

import org.offroy.sonar.poc.urba.domain1.bo.Bo1;

public class Service1 {

	private Bo1 bo;

	public Service1() {
		bo = new Bo1();
	}

	public void method1() {
		System.out.println("In " + this.getClass().getName());

		bo.method1();
	}

}

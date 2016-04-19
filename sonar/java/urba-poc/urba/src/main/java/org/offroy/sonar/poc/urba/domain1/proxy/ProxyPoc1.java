package org.offroy.sonar.poc.urba.domain1.proxy;

import org.offroy.sonar.poc.urba.domain1.service.Service1;

public class ProxyPoc1 {

	private Service1 service;

	public ProxyPoc1() {
		service = new Service1();
	}

	public void method1() {
		System.out.println("In " + this.getClass().getName());

		service.method1();
	}

}

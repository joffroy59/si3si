package org.offroy.sonar.poc.urba;

import org.offroy.sonar.poc.urba.domain1.proxy.ProxyPoc1;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("In Main");

		ProxyPoc1 proxy = new ProxyPoc1();

		proxy.method1();
	}
}

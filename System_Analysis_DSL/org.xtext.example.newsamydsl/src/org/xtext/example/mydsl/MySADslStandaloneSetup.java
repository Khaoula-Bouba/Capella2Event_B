/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MySADslStandaloneSetup extends MySADslStandaloneSetupGenerated {

	public static void doSetup() {
		new MySADslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

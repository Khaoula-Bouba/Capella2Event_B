/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.newlamydsl;

import org.xtext.example.mydsl.MyLADslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyLADslStandaloneSetup extends MyLADslStandaloneSetupGenerated {

	public static void doSetup() {
		new MyLADslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

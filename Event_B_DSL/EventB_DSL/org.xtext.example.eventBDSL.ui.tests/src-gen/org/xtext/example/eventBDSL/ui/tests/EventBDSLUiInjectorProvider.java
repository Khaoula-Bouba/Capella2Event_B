/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.eventBDSL.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.eventBDSL.ui.internal.EventBDSLActivator;

public class EventBDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EventBDSLActivator.getInstance().getInjector("org.xtext.example.eventBDSL.EventBDSL");
	}

}


package org.example.mongoemf;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SQLQueryStandaloneSetup extends SQLQueryStandaloneSetupGenerated{

	public static void doSetup() {
		new SQLQueryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


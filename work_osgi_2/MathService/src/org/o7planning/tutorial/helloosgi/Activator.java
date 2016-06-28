package org.o7planning.tutorial.helloosgi;

import org.o7planning.tutorial.helloosgi.mathservice.MathService;
import org.o7planning.tutorial.helloosgi.mathservice.impl.MathServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		  System.out.println("Registry Service MathService...");
	         
	      this.registryMathService();
	         
	     System.out.println("OSGi MathService Started");
	}
	
	private void registryMathService() {
        MathService service = new MathServiceImpl();
        context.registerService(MathService.class, service, null);
    }

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("OSGi MathService Stopped!");
	}

}

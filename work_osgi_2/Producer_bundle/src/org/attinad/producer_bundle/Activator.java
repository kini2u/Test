package org.attinad.producer_bundle;

import org.attinad.producer.service.ProducerService;
import org.attinad.producer.service.Imp.CalculateService;
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
        ProducerService service = new CalculateService();
        context.registerService(ProducerService.class, service, null);
    }
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}

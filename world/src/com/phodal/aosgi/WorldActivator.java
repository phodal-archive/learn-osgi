package com.phodal.aosgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class WorldActivator implements BundleActivator {
    ServiceReference helloServiceReference;

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Hello World!!");
        helloServiceReference= context.getServiceReference(WorldService.class.getName());
        WorldService helloService =(WorldService)context.getService(helloServiceReference);
        System.out.println(helloService.sayHello());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Goodbye World!!");
        context.ungetService(helloServiceReference);
    }
}

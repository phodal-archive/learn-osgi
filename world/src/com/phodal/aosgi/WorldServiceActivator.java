package com.phodal.aosgi;

import com.phodal.aosgi.impl.WorldServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class WorldServiceActivator implements BundleActivator {
    ServiceRegistration helloServiceRegistration;
    @Override
    public void start(BundleContext context) throws Exception {
        WorldService helloService = new WorldServiceImpl();
        helloServiceRegistration =context.registerService(WorldService.class.getName(), helloService, null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        helloServiceRegistration.unregister();
    }
}

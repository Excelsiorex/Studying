package rtti.simple_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("*** proxy. " + o.getClass().getName() + ", method - " + method + ", args " + objects);
        if (objects != null) {
            for (Object arg : objects) {
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, objects);
    }
}

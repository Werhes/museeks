package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٞؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1213e {
    public static volatile int ad;
    public static final String[] appmetrica;
    public static volatile C0603e license;
    public static final C0603e vip = new C0603e(1);
    public static final C0603e metrica = new C0603e(0);

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            str.equalsIgnoreCase("true");
        }
        appmetrica = new String[]{"2.0"};
    }

    public static ArrayList ad() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC1213e.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C0603e c0603e = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = AbstractC1359e.ad;
                if (AbstractC8703e.m2467class(2) >= AbstractC8703e.m2467class(AbstractC1359e.vip)) {
                    AbstractC1359e.vip().println("SLF4J(I): " + str);
                }
                c0603e = (C0603e) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC1359e.ad("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC1359e.ad("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC1359e.ad("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC1359e.ad("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC1359e.ad("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC1359e.ad("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c0603e != null) {
            arrayList.add(c0603e);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C0603e.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: eٟؖٞ
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C0603e.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C0603e) it.next());
            } catch (ServiceConfigurationError e7) {
                String str2 = "A service provider failed to instantiate:\n" + e7.getMessage();
                AbstractC1359e.vip().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    public static void appmetrica(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = AbstractC1359e.ad;
            if (AbstractC8703e.m2467class(2) >= AbstractC8703e.m2467class(AbstractC1359e.vip)) {
                AbstractC1359e.vip().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C0603e) arrayList.get(0)).getClass().getName() + "]";
        int i2 = AbstractC1359e.ad;
        if (AbstractC8703e.m2467class(1) >= AbstractC8703e.m2467class(AbstractC1359e.vip)) {
            AbstractC1359e.vip().println("SLF4J(D): " + str2);
        }
    }

    public static void billing(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC1359e.metrica("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC1359e.metrica("Found provider [" + ((C0603e) it.next()) + "]");
            }
            AbstractC1359e.metrica("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void license() {
        C0603e c0603e = vip;
        synchronized (c0603e) {
            try {
                ((C1629e) c0603e.vip).f4551e = true;
                C1629e c1629e = (C1629e) c0603e.vip;
                c1629e.getClass();
                Iterator it = new ArrayList(c1629e.f4550e.values()).iterator();
                while (it.hasNext()) {
                    C16033e c16033e = (C16033e) it.next();
                    c16033e.f31569e = vip(c16033e.f31571e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C1629e) vip.vip).f4549e;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C11131e c11131e = (C11131e) it2.next();
                if (c11131e != null) {
                    C16033e c16033e2 = c11131e.vip;
                    String str = c16033e2.f31571e;
                    if (c16033e2.f31569e == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c16033e2.f31569e instanceof C11437e)) {
                        if (!c16033e2.admob()) {
                            AbstractC1359e.metrica(str);
                        } else if (c16033e2.loadAd(c11131e.ad) && c16033e2.admob()) {
                            try {
                                c16033e2.f31570e.invoke(c16033e2.f31569e, c11131e);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c11131e.vip.admob()) {
                        AbstractC1359e.metrica("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC1359e.metrica("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC1359e.metrica("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c11131e.vip.f31569e instanceof C11437e)) {
                        AbstractC1359e.metrica("The following set of substitute loggers may have been accessed");
                        AbstractC1359e.metrica("during the initialization phase. Logging calls during this");
                        AbstractC1359e.metrica("phase were not honored. However, subsequent logging calls to these");
                        AbstractC1359e.metrica("loggers will work as normally expected.");
                        AbstractC1359e.metrica("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C1629e c1629e2 = (C1629e) vip.vip;
        c1629e2.f4550e.clear();
        c1629e2.f4549e.clear();
    }

    public static final void metrica() {
        try {
            ArrayList ad2 = ad();
            billing(ad2);
            if (ad2.isEmpty()) {
                ad = 4;
                AbstractC1359e.metrica("No SLF4J providers were found.");
                AbstractC1359e.metrica("Defaulting to no-operation (NOP) logger implementation");
                AbstractC1359e.metrica("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC1213e.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC1359e.ad("Error getting resources from path", e);
                }
                purchase(linkedHashSet);
            } else {
                license = (C0603e) ad2.get(0);
                license.getClass();
                license.getClass();
                ad = 3;
                appmetrica(ad2);
            }
            license();
            if (ad == 3) {
                try {
                    switch (license.ad) {
                        case 0:
                            boolean z = false;
                            for (String str : appmetrica) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC1359e.metrica("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(appmetrica).toString());
                            AbstractC1359e.metrica("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC1359e.ad("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            ad = 2;
            AbstractC1359e.ad("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    public static void purchase(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC1359e.metrica("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC1359e.metrica("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC1359e.metrica("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static InterfaceC4911e vip(String str) {
        C0603e c0603e;
        InterfaceC12369e interfaceC12369e;
        if (ad == 0) {
            synchronized (AbstractC1213e.class) {
                try {
                    if (ad == 0) {
                        ad = 1;
                        metrica();
                    }
                } finally {
                }
            }
        }
        int i = ad;
        if (i == 1) {
            c0603e = vip;
        } else {
            if (i == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                c0603e = license;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                c0603e = metrica;
            }
        }
        switch (c0603e.ad) {
            case 0:
                interfaceC12369e = (C10659e) c0603e.vip;
                break;
            default:
                interfaceC12369e = (C1629e) c0603e.vip;
                break;
        }
        return interfaceC12369e.appmetrica(str);
    }
}

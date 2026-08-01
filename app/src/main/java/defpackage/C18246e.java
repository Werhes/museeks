package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٝۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18246e {
    public static final C18246e metrica = new C18246e();
    public final HashMap ad = new HashMap();
    public final HashMap vip = new HashMap();

    public static void vip(HashMap hashMap, C3591e c3591e, EnumC14621e enumC14621e, Class cls) {
        EnumC14621e enumC14621e2 = (EnumC14621e) hashMap.get(c3591e);
        if (enumC14621e2 == null || enumC14621e == enumC14621e2) {
            if (enumC14621e2 == null) {
                hashMap.put(c3591e, enumC14621e);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c3591e.vip.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC14621e2 + ", new value " + enumC14621e);
    }

    public final C10951e ad(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.ad;
        if (superclass != null) {
            C10951e c10951e = (C10951e) hashMap2.get(superclass);
            if (c10951e == null) {
                c10951e = ad(superclass, null);
            }
            hashMap.putAll(c10951e.vip);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C10951e c10951e2 = (C10951e) hashMap2.get(cls2);
            if (c10951e2 == null) {
                c10951e2 = ad(cls2, null);
            }
            for (Map.Entry entry : c10951e2.vip.entrySet()) {
                vip(hashMap, (C3591e) entry.getKey(), (EnumC14621e) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC10450e interfaceC10450e = (InterfaceC10450e) method.getAnnotation(InterfaceC10450e.class);
            if (interfaceC10450e != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC16400e.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC14621e value = interfaceC10450e.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC14621e.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC14621e.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                vip(hashMap, new C3591e(i, method), value, cls);
                z = true;
            }
        }
        C10951e c10951e3 = new C10951e(hashMap);
        hashMap2.put(cls, c10951e3);
        this.vip.put(cls, Boolean.valueOf(z));
        return c10951e3;
    }
}

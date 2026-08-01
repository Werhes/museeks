package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۨ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11419e {
    public static final C17519e vip = new C17519e(0);
    public final /* synthetic */ AbstractC15958e ad;

    public C11419e(AbstractC15958e abstractC15958e) {
        this.ad = abstractC15958e;
    }

    public static Class metrica(ClassLoader classLoader, String str) {
        try {
            return vip(classLoader, str);
        } catch (ClassCastException e) {
            throw new C14803e(4, AbstractC5087e.m1746extends("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C14803e(4, AbstractC5087e.m1746extends("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public static Class vip(ClassLoader classLoader, String str) {
        C17519e c17519e = vip;
        C17519e c17519e2 = (C17519e) c17519e.get(classLoader);
        if (c17519e2 == null) {
            c17519e2 = new C17519e(0);
            c17519e.put(classLoader, c17519e2);
        }
        Class cls = (Class) c17519e2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c17519e2.put(str, cls2);
        return cls2;
    }

    public final AbstractComponentCallbacksC17875e ad(String str) {
        try {
            return (AbstractComponentCallbacksC17875e) metrica(this.ad.isVip.f6096e.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C14803e(4, AbstractC5087e.m1746extends("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C14803e(4, AbstractC5087e.m1746extends("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C14803e(4, AbstractC5087e.m1746extends("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C14803e(4, AbstractC5087e.m1746extends("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}

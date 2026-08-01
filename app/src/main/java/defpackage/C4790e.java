package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4790e {
    public final AbstractC6649e ad;
    public final Method appmetrica;
    public final C1808e license;
    public final AbstractC6649e metrica;
    public final Object vip;

    public C4790e(AbstractC6649e abstractC6649e, Object obj, AbstractC6649e abstractC6649e2, C1808e c1808e, Class cls) {
        if (abstractC6649e == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c1808e.f4882e == EnumC0337e.f2366e && abstractC6649e2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.ad = abstractC6649e;
        this.vip = obj;
        this.metrica = abstractC6649e2;
        this.license = c1808e;
        if (!InterfaceC2102e.class.isAssignableFrom(cls)) {
            this.appmetrica = null;
            return;
        }
        try {
            this.appmetrica = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException(AbstractC8647e.ads(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
        }
    }

    public final Object ad(Object obj) {
        if (this.license.f4882e.f2368e != EnumC7310e.f14967e) {
            return obj;
        }
        try {
            return this.appmetrica.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object vip(Object obj) {
        return this.license.f4882e.f2368e == EnumC7310e.f14967e ? Integer.valueOf(((InterfaceC2102e) obj).ad()) : obj;
    }
}

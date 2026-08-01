package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۡۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9049e implements InterfaceC5083e, InterfaceC18430e, Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC5083e f18107e;

    public AbstractC9049e(InterfaceC5083e interfaceC5083e) {
        this.f18107e = interfaceC5083e;
    }

    public void Signature() {
    }

    public InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement amazon() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        InterfaceC4674e interfaceC4674e = (InterfaceC4674e) getClass().getAnnotation(InterfaceC4674e.class);
        String str2 = null;
        if (interfaceC4674e == null || interfaceC4674e.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? interfaceC4674e.l()[i] : -1;
        C18478e c18478e = AbstractC3149e.vip;
        C18478e c18478e2 = AbstractC3149e.ad;
        if (c18478e == null) {
            try {
                C18478e c18478e3 = new C18478e(24, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC3149e.vip = c18478e3;
                c18478e = c18478e3;
            } catch (Exception unused2) {
                AbstractC3149e.vip = c18478e2;
                c18478e = c18478e2;
            }
        }
        if (c18478e != c18478e2 && (method = (Method) c18478e.f36228e) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c18478e.f36227e) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) c18478e.f36229e;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC4674e.c();
        } else {
            str = str2 + '/' + interfaceC4674e.c();
        }
        return new StackTraceElement(str, interfaceC4674e.m(), interfaceC4674e.f(), i2);
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        InterfaceC5083e interfaceC5083e = this;
        while (true) {
            AbstractC9049e abstractC9049e = (AbstractC9049e) interfaceC5083e;
            InterfaceC5083e interfaceC5083e2 = abstractC9049e.f18107e;
            try {
                obj = abstractC9049e.loadAd(obj);
                if (obj == EnumC2821e.f6782e) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C12763e(th);
            }
            abstractC9049e.Signature();
            if (!(interfaceC5083e2 instanceof AbstractC9049e)) {
                interfaceC5083e2.billing(obj);
                return;
            }
            interfaceC5083e = interfaceC5083e2;
        }
    }

    public abstract Object loadAd(Object obj);

    public InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object amazon = amazon();
        if (amazon == null) {
            amazon = getClass().getName();
        }
        sb.append(amazon);
        return sb.toString();
    }

    public InterfaceC18430e vip() {
        InterfaceC5083e interfaceC5083e = this.f18107e;
        if (interfaceC5083e instanceof InterfaceC18430e) {
            return (InterfaceC18430e) interfaceC5083e;
        }
        return null;
    }
}

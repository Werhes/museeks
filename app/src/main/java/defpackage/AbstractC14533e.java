package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14533e {
    public static volatile Handler ad;
    public static final C4590e metrica;
    public static final C5438e vip;
    public static final Object license = new Object();
    public static final Object appmetrica = new Object();
    public static final Object purchase = new Object();
    public static final Object billing = new Object();
    public static final Object yandex = new Object();

    static {
        int i = 23;
        vip = new C5438e(i);
        metrica = new C4590e(i);
    }

    public static final InterfaceC3314e adcel(C13770e c13770e, Object obj, Function2 function2) {
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = startapp(obj);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
        Unit unit = Unit.INSTANCE;
        boolean yandex2 = c13770e.yandex(function2);
        Object m3681throw2 = c13770e.m3681throw();
        if (yandex2 || m3681throw2 == c5170e) {
            m3681throw2 = new C15360e(function2, interfaceC3314e, null, 0);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
        return interfaceC3314e;
    }

    public static final C6656e appmetrica(InterfaceC1589e interfaceC1589e, Function0 function0) {
        C0912e c0912e = AbstractC4984e.ad;
        return new C6656e(interfaceC1589e, function0);
    }

    public static final Object billing(InterfaceC13742e interfaceC13742e, InterfaceC11944e interfaceC11944e, InterfaceC5083e interfaceC5083e) {
        Object appmetrica2 = AbstractC9743e.appmetrica(new C5176e(interfaceC13742e, interfaceC11944e, null, 5), interfaceC5083e);
        return appmetrica2 == EnumC2821e.f6782e ? appmetrica2 : Unit.INSTANCE;
    }

    public static final C12431e license() {
        C0912e c0912e = AbstractC4984e.vip;
        C12431e c12431e = (C12431e) c0912e.get();
        if (c12431e != null) {
            return c12431e;
        }
        C12431e c12431e2 = new C12431e(0, new C2336e[0]);
        c0912e.Signature(c12431e2);
        return c12431e2;
    }

    public static final InterfaceC3314e metrica(InterfaceC1108e interfaceC1108e, Object obj, C13770e c13770e, int i) {
        Object obj2 = C2693e.f6576e;
        boolean yandex2 = c13770e.yandex(obj2) | c13770e.yandex(interfaceC1108e);
        Object m3681throw = c13770e.m3681throw();
        InterfaceC5083e interfaceC5083e = null;
        Object obj3 = C2987e.ad;
        if (yandex2 || m3681throw == obj3) {
            m3681throw = new C2122e(obj2, interfaceC1108e, interfaceC5083e, 20);
            c13770e.m3682throws(m3681throw);
        }
        Function2 function2 = (Function2) m3681throw;
        Object m3681throw2 = c13770e.m3681throw();
        if (m3681throw2 == obj3) {
            m3681throw2 = startapp(obj);
            c13770e.m3682throws(m3681throw2);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw2;
        boolean yandex3 = c13770e.yandex(function2);
        Object m3681throw3 = c13770e.m3681throw();
        if (yandex3 || m3681throw3 == obj3) {
            m3681throw3 = new C15360e(function2, interfaceC3314e, interfaceC5083e, 1);
            c13770e.m3682throws(m3681throw3);
        }
        AbstractC17680e.appmetrica(interfaceC1108e, obj2, (Function2) m3681throw3, c13770e);
        return interfaceC3314e;
    }

    public static final InterfaceC3314e mopub(Object obj, C13770e c13770e) {
        Object m3681throw = c13770e.m3681throw();
        if (m3681throw == C2987e.ad) {
            m3681throw = startapp(obj);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
        interfaceC3314e.setValue(obj);
        return interfaceC3314e;
    }

    public static final C6656e purchase(Function0 function0) {
        C0912e c0912e = AbstractC4984e.ad;
        return new C6656e(null, function0);
    }

    public static final C10250e smaato(Function0 function0) {
        return new C10250e(new C14164e(function0, (InterfaceC5083e) null, 16));
    }

    public static C0576e startapp(Object obj) {
        return new C0576e(obj, C12575e.f25232e);
    }

    public static Handler yandex() {
        if (ad != null) {
            return ad;
        }
        synchronized (AbstractC14533e.class) {
            try {
                if (ad == null) {
                    ad = AbstractC5756e.metrica(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ad;
    }

    public void ad(Object obj) {
    }

    public abstract Object advert();

    public abstract boolean vip(Object obj);
}

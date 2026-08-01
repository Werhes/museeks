package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؑۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4584e {
    public static final C2892e ad = new C2892e(-12572889, false, new C7478e(24));
    public static final C2892e vip = new C2892e(2086651555, false, new C7478e(25));
    public static final C2892e metrica = new C2892e(464923664, false, new C7478e(26));
    public static final C2892e license = new C2892e(-815014772, false, new C7478e(27));
    public static final C2892e appmetrica = new C2892e(-1021780412, false, new C10387e(14));
    public static final C2892e purchase = new C2892e(-157323023, false, new C10387e(15));
    public static final C2892e billing = new C2892e(1413149557, false, new C10387e(16));

    public static final AbstractC13616e ad(InterfaceC5077e interfaceC5077e, int i) {
        AbstractC13616e abstractC13616e = ((AbstractC13616e) interfaceC5077e).f27022e.f27024e;
        if (abstractC13616e == null || (abstractC13616e.f27020e & i) == 0) {
            return null;
        }
        while (abstractC13616e != null) {
            int i2 = abstractC13616e.f27014e;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return abstractC13616e;
            }
            abstractC13616e = abstractC13616e.f27024e;
        }
        return null;
    }

    public static final boolean license(Throwable th) {
        Class<?> cls = th.getClass();
        while (!AbstractC7890e.billing(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final long metrica(C12476e c12476e, int i, boolean z, boolean z2) {
        C12890e c12890e = c12476e.vip;
        long j = c12476e.metrica;
        if (c12890e.license(i) >= c12890e.purchase) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(AbstractC3062e.vip(c12476e.appmetrica(i, c12476e.ad(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == c12476e.adcel(i)), 0.0f, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(AbstractC3062e.vip(c12890e.vip(r3), 0.0f, (int) (j & 4294967295L))) & 4294967295L);
    }

    public static boolean vip() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC5014e.f10603e == null) {
                ViewTreeObserverOnGlobalLayoutListenerC5014e.f10603e = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC5014e.f10607e == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC5014e.f10603e;
                ViewTreeObserverOnGlobalLayoutListenerC5014e.f10607e = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC5014e.f10607e;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC7890e.billing(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }
}

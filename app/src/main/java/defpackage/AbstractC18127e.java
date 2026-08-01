package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Map;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۥٛ */
/* loaded from: classes3.dex */
public abstract class AbstractC18127e {
    public static final InterfaceC9998e ad(InterfaceC9998e interfaceC9998e, C10068e c10068e) {
        if (!AbstractC7890e.billing(interfaceC9998e.appmetrica(), C6587e.appmetrica)) {
            return interfaceC9998e.yandex() ? ad(interfaceC9998e.adcel(0), c10068e) : interfaceC9998e;
        }
        if (AbstractC10003e.purchase(interfaceC9998e) == null) {
            return interfaceC9998e;
        }
        c10068e.getClass();
        return interfaceC9998e;
    }

    public static final void adcel(CaptureRequest.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            startapp(builder, entry.getKey(), entry.getValue());
        }
    }

    public static final AbstractC16920e appmetrica(C4030e c4030e, String str) {
        Object c12763e;
        try {
            AbstractC1948e abstractC1948e = (AbstractC1948e) c4030e.get(str);
            c12763e = abstractC1948e != null ? AbstractC12517e.billing(abstractC1948e) : null;
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        return (AbstractC16920e) (c12763e instanceof C12763e ? null : c12763e);
    }

    public static final String billing(C4030e c4030e, String str) {
        AbstractC16920e appmetrica = appmetrica(c4030e, str);
        if (appmetrica == null) {
            return null;
        }
        C5404e c5404e = AbstractC12517e.ad;
        if (appmetrica instanceof C11549e) {
            return null;
        }
        return appmetrica.appmetrica();
    }

    public static final C4030e license(C4030e c4030e, String str) {
        Object c12763e;
        try {
            AbstractC1948e abstractC1948e = (AbstractC1948e) c4030e.get(str);
            c12763e = abstractC1948e != null ? AbstractC12517e.purchase(abstractC1948e) : null;
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        return (C4030e) (c12763e instanceof C12763e ? null : c12763e);
    }

    public static final C7960e metrica(C4030e c4030e, String str) {
        Object c12763e;
        try {
            AbstractC1948e abstractC1948e = (AbstractC1948e) c4030e.get(str);
            if (abstractC1948e != null) {
                C5404e c5404e = AbstractC12517e.ad;
                c12763e = abstractC1948e instanceof C7960e ? (C7960e) abstractC1948e : null;
                if (c12763e == null) {
                    AbstractC12517e.metrica(abstractC1948e, "JsonArray");
                    throw null;
                }
            } else {
                c12763e = null;
            }
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        return (C7960e) (c12763e instanceof C12763e ? null : c12763e);
    }

    public static final InterfaceC12864e purchase(InterfaceC12864e interfaceC12864e, Function3 function3) {
        return interfaceC12864e.premium(new C7472e(function3));
    }

    public static final void startapp(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e) {
            Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
        }
    }

    public static /* synthetic */ C7826e vip(C11106e c11106e, Object obj, String str, C8633e c8633e, int i) {
        if ((i & 4) != 0) {
            c8633e = null;
        }
        return c11106e.m3001case(obj, str, c8633e, null);
    }

    public static final EnumC6813e yandex(AbstractC0232e abstractC0232e, InterfaceC9998e interfaceC9998e) {
        AbstractC8457e appmetrica = interfaceC9998e.appmetrica();
        if (appmetrica instanceof AbstractC13637e) {
            return EnumC6813e.f14030e;
        }
        if (!AbstractC7890e.billing(appmetrica, C3016e.appmetrica)) {
            if (!AbstractC7890e.billing(appmetrica, C18215e.appmetrica)) {
                return EnumC6813e.f14026e;
            }
            InterfaceC9998e ad = ad(interfaceC9998e.adcel(0), abstractC0232e.vip);
            AbstractC8457e appmetrica2 = ad.appmetrica();
            if ((appmetrica2 instanceof AbstractC5296e) || AbstractC7890e.billing(appmetrica2, C7784e.appmetrica)) {
                return EnumC6813e.f14025e;
            }
            if (!abstractC0232e.ad.license) {
                throw AbstractC3421e.metrica(ad);
            }
        }
        return EnumC6813e.f14028e;
    }
}

package defpackage;

import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2876e {
    public static final /* synthetic */ int ad = 0;

    static {
        C0520e.appmetrica("value");
    }

    public static final boolean ad(C13043e c13043e) {
        return AbstractC10075e.billing(Collections.singletonList(c13043e), C4590e.f9893e, C0171e.f1405e).booleanValue();
    }

    public static final C8522e adcel(InterfaceC0390e interfaceC0390e) {
        InterfaceC9093e billing = AbstractC1660e.billing(new InterfaceC9093e[]{new C6209e(1, interfaceC0390e), AbstractC7762e.mopub(new C1356e(1, interfaceC0390e.mo337finally()), new C15146e(28))});
        C7983e c7983e = new C7983e(12);
        if (!(billing instanceof C2167e)) {
            return new C8522e(billing, new C3114e(27), c7983e);
        }
        C2167e c2167e = (C2167e) billing;
        return new C8522e(c2167e.ad, c2167e.vip, c7983e);
    }

    public static final AbstractC13270e appmetrica(InterfaceC15498e interfaceC15498e) {
        return AbstractC14300e.metrica(interfaceC15498e).amazon();
    }

    public static final C12816e billing(InterfaceC15498e interfaceC15498e) {
        C12816e billing = AbstractC14300e.billing(interfaceC15498e);
        return billing != null ? billing : AbstractC14300e.purchase(interfaceC15498e.mo1351switch()).ad(interfaceC15498e.getName()).startapp();
    }

    public static final InterfaceC5052e license(InterfaceC16566e interfaceC16566e) {
        InterfaceC4077e advert = interfaceC16566e.ad().loadAd().advert();
        if (advert instanceof InterfaceC5052e) {
            return (InterfaceC5052e) advert;
        }
        return null;
    }

    public static final C12816e metrica(InterfaceC7573e interfaceC7573e) {
        C13579e purchase = AbstractC14300e.purchase(interfaceC7573e);
        if (!purchase.license()) {
            purchase = null;
        }
        if (purchase != null) {
            return purchase.startapp();
        }
        return null;
    }

    public static final C11709e purchase(InterfaceC4077e interfaceC4077e) {
        InterfaceC15498e mo1351switch;
        C11709e purchase;
        if (interfaceC4077e == null || (mo1351switch = interfaceC4077e.mo1351switch()) == null) {
            return null;
        }
        if (mo1351switch instanceof InterfaceC9646e) {
            return new C11709e(((AbstractC14941e) ((InterfaceC9646e) mo1351switch)).f29618e, interfaceC4077e.getName());
        }
        if (!(mo1351switch instanceof InterfaceC2978e) || (purchase = purchase((InterfaceC4077e) mo1351switch)) == null) {
            return null;
        }
        return purchase.license(interfaceC4077e.getName());
    }

    public static final InterfaceC0390e startapp(InterfaceC0390e interfaceC0390e) {
        return interfaceC0390e instanceof InterfaceC3833e ? ((AbstractC15855e) ((InterfaceC3833e) interfaceC0390e)).m4030e() : interfaceC0390e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّؖٝ, java.lang.Object] */
    public static InterfaceC0390e vip(InterfaceC0390e interfaceC0390e, Function1 function1) {
        return (InterfaceC0390e) AbstractC10075e.license(Collections.singletonList(interfaceC0390e), new C5170e((byte) 0, 28), new C4423e(new Object(), function1));
    }

    public static final void yandex(InterfaceC5334e interfaceC5334e) {
        if (interfaceC5334e.mo1887e(AbstractC7763e.ad) != null) {
            throw new ClassCastException();
        }
    }
}

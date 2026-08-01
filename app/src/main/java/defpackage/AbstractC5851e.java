package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۘؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5851e {
    public static final C2892e appmetrica;
    public static final C2892e billing;
    public static final C2892e license;
    public static final C2892e metrica;
    public static final C2892e purchase;
    public static final C10659e startapp;
    public static final C2892e yandex;
    public static final C2892e ad = new C2892e(2094288676, false, new C10418e(14));
    public static final C2892e vip = new C2892e(-1342205566, false, new C9868e(19));

    static {
        new C2892e(-684072357, false, new C10418e(15));
        metrica = new C2892e(2136598717, false, new C9868e(20));
        new C2892e(-780193532, false, new C10418e(9));
        license = new C2892e(-1846660506, false, new C9868e(18));
        appmetrica = new C2892e(-661145402, false, new C10418e(10));
        purchase = new C2892e(-1113422563, false, new C10418e(11));
        billing = new C2892e(-2101264077, false, new C10418e(12));
        yandex = new C2892e(37575796, false, new C10418e(13));
        startapp = new C10659e(13);
    }

    public static final void ad(C12431e c12431e, AbstractC13616e abstractC13616e) {
        C12431e ads = mopub(abstractC13616e).ads();
        int i = ads.f24868e - 1;
        Object[] objArr = ads.f24870e;
        if (i < objArr.length) {
            while (i >= 0) {
                c12431e.license((AbstractC13616e) ((C13915e) objArr[i]).f27592e.billing);
                i--;
            }
        }
    }

    public static final AbstractC17732e adcel(InterfaceC5077e interfaceC5077e) {
        if (!((AbstractC13616e) interfaceC5077e).f27022e.f27016e) {
            AbstractC14070e.metrica("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC17732e yandex2 = yandex(interfaceC5077e, 2);
        yandex2.getClass();
        if (!yandex2.mo2524e().f27016e) {
            AbstractC14070e.metrica("LayoutCoordinates is not attached.");
        }
        return yandex2;
    }

    public static final InterfaceC16590e advert(InterfaceC5077e interfaceC5077e) {
        InterfaceC16590e interfaceC16590e = mopub(interfaceC5077e).f27599e;
        if (interfaceC16590e != null) {
            return interfaceC16590e;
        }
        throw AbstractC8703e.Signature("This node does not have an owner.");
    }

    public static double[] appmetrica(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    public static final void billing(InterfaceC5077e interfaceC5077e) {
        C12597e c12597e;
        C13915e mopub = mopub(interfaceC5077e);
        if (mopub.f27607e) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(mopub);
        if (!ViewTreeObserverOnGlobalLayoutListenerC5014e.appmetrica() || (c12597e = viewTreeObserverOnGlobalLayoutListenerC5014e.f10633e) == null) {
            return;
        }
        c12597e.f25316e.vip.m4651return(mopub.f27594e, new C13884e(c12597e, mopub));
    }

    public static final boolean license(ArrayList arrayList) {
        return !arrayList.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC17303e metrica(AbstractC13616e abstractC13616e) {
        if ((abstractC13616e.f27014e & 2) != 0) {
            if (abstractC13616e instanceof InterfaceC17303e) {
                return (InterfaceC17303e) abstractC13616e;
            }
            if (abstractC13616e instanceof AbstractC6126e) {
                AbstractC13616e abstractC13616e2 = ((AbstractC6126e) abstractC13616e).f12873e;
                while (abstractC13616e2 != 0) {
                    if (abstractC13616e2 instanceof InterfaceC17303e) {
                        return (InterfaceC17303e) abstractC13616e2;
                    }
                    abstractC13616e2 = (!(abstractC13616e2 instanceof AbstractC6126e) || (abstractC13616e2.f27014e & 2) == 0) ? abstractC13616e2.f27024e : ((AbstractC6126e) abstractC13616e2).f12873e;
                }
            }
        }
        return null;
    }

    public static final C13915e mopub(InterfaceC5077e interfaceC5077e) {
        AbstractC17732e abstractC17732e = ((AbstractC13616e) interfaceC5077e).f27022e.f27018e;
        if (abstractC17732e != null) {
            return abstractC17732e.f34782e;
        }
        throw AbstractC8703e.Signature("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Object purchase(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static void smaato(Object obj) {
        if (obj instanceof C12746e) {
            throw ((C12746e) obj).ad;
        }
    }

    public static final InterfaceC2661e startapp(InterfaceC5077e interfaceC5077e) {
        return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) advert(interfaceC5077e)).getGraphicsContext();
    }

    public static final AbstractC13616e vip(C12431e c12431e) {
        int i;
        if (c12431e == null || (i = c12431e.f24868e) == 0) {
            return null;
        }
        return (AbstractC13616e) c12431e.amazon(i - 1);
    }

    public static final AbstractC17732e yandex(InterfaceC5077e interfaceC5077e, int i) {
        AbstractC17732e abstractC17732e = ((AbstractC13616e) interfaceC5077e).f27022e.f27018e;
        return (abstractC17732e.mo2524e() == interfaceC5077e && AbstractC5180e.billing(i)) ? abstractC17732e.f34777e : abstractC17732e;
    }
}

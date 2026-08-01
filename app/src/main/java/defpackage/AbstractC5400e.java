package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5400e {
    public static final C2892e ad = new C2892e(1421180792, false, new C10418e(2));
    public static final C2892e vip = new C2892e(-682188776, false, new C10418e(3));
    public static final C2892e metrica = new C2892e(2100642654, false, new C10418e(4));
    public static final C2892e license = new C2892e(1757758845, false, new C10418e(5));
    public static final C2892e appmetrica = new C2892e(-155758416, false, new C10418e(6));
    public static final C2892e purchase = new C2892e(-1378296532, false, new C10418e(7));
    public static final C17371e billing = new C17371e(8);
    public static final C17371e yandex = new C17371e(9);
    public static final C17371e startapp = new C17371e(10);
    public static final C17371e adcel = new C17371e(11);
    public static final C17371e mopub = new C17371e(12);

    public static void ad(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x012b, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        return !defpackage.AbstractC13270e.applovin(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean appmetrica(defpackage.InterfaceC5052e r12, defpackage.InterfaceC0390e r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5400e.appmetrica(eؗٞؓ, eؑٚؐ):boolean");
    }

    public static final InterfaceC12864e billing(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C5600e(function1));
    }

    public static final InterfaceC0390e license(InterfaceC0390e interfaceC0390e) {
        if (!AbstractC7928e.adcel.contains(interfaceC0390e.getName()) && !AbstractC3380e.license.contains(AbstractC2876e.startapp(interfaceC0390e).getName())) {
            return null;
        }
        if ((interfaceC0390e instanceof InterfaceC2188e) || (interfaceC0390e instanceof InterfaceC3833e)) {
            return AbstractC2876e.vip(interfaceC0390e, C15146e.f29970e);
        }
        if (interfaceC0390e instanceof C1117e) {
            return AbstractC2876e.vip(interfaceC0390e, C15146e.f29953e);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    public static final String metrica(InterfaceC16528e interfaceC16528e) {
        C0520e c0520e;
        InterfaceC0390e license2 = AbstractC13270e.applovin(interfaceC16528e) ? license(interfaceC16528e) : null;
        if (license2 != null) {
            InterfaceC0390e startapp2 = AbstractC2876e.startapp(license2);
            if (startapp2 instanceof InterfaceC2188e) {
                AbstractC13270e.applovin(startapp2);
                InterfaceC0390e vip2 = AbstractC2876e.vip(AbstractC2876e.startapp(startapp2), C11633e.f23362e);
                if (vip2 != null && (c0520e = (C0520e) AbstractC3380e.ad.get(AbstractC2876e.billing(vip2))) != null) {
                    return c0520e.vip();
                }
            } else if (startapp2 instanceof C1117e) {
                int i = AbstractC7347e.advert;
                LinkedHashMap linkedHashMap = AbstractC7928e.startapp;
                String metrica2 = AbstractC5209e.metrica((C1117e) startapp2);
                C0520e c0520e2 = metrica2 == null ? null : (C0520e) linkedHashMap.get(metrica2);
                if (c0520e2 != null) {
                    return c0520e2.vip();
                }
            }
        }
        return null;
    }

    public static final /* synthetic */ Integer purchase(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (i != Integer.MIN_VALUE) {
            return valueOf;
        }
        return null;
    }

    public static void vip(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}

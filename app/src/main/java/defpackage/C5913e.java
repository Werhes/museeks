package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5913e {
    public static final C5913e metrica = new C5913e();
    public final ConcurrentHashMap vip = new ConcurrentHashMap();
    public final C8646e ad = new C8646e();

    public final InterfaceC16984e ad(Class cls) {
        InterfaceC16984e applovin;
        ConcurrentHashMap concurrentHashMap = this.vip;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (InterfaceC16984e) obj;
        }
        C8646e c8646e = this.ad;
        c8646e.getClass();
        C9616e c9616e = AbstractC0248e.ad;
        if (!AbstractC15319e.class.isAssignableFrom(cls)) {
            int i = AbstractC3433e.ad;
        }
        C0537e metrica2 = c8646e.ad.metrica(cls);
        if ((metrica2.license & 2) == 2) {
            int i2 = AbstractC3433e.ad;
            C9616e c9616e2 = AbstractC0248e.ad;
            C11672e c11672e = AbstractC17412e.ad;
            applovin = new C5744e(c9616e2, metrica2.ad);
        } else {
            int i3 = AbstractC3433e.ad;
            int i4 = AbstractC8784e.ad;
            int i5 = AbstractC3130e.ad;
            C9616e c9616e3 = AbstractC0248e.ad;
            C11672e c11672e2 = metrica2.ad() + (-1) != 1 ? AbstractC17412e.ad : null;
            int i6 = AbstractC8463e.ad;
            applovin = C1866e.applovin(metrica2, c9616e3, c11672e2);
        }
        InterfaceC16984e interfaceC16984e = (InterfaceC16984e) concurrentHashMap.putIfAbsent(cls, applovin);
        return interfaceC16984e != null ? interfaceC16984e : applovin;
    }
}

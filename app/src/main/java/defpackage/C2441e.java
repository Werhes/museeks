package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2441e extends AbstractC1303e {
    public final C2532e ad = new C2532e(15);
    public final ConcurrentHashMap vip = new ConcurrentHashMap();

    @Override // defpackage.AbstractC1303e
    public final InterfaceC10597e vip(AbstractC15603e abstractC15603e) {
        ConcurrentHashMap concurrentHashMap = this.vip;
        Object obj = concurrentHashMap.get(abstractC15603e);
        if (obj == null) {
            boolean equals = abstractC15603e.equals(amazon.amazon);
            C2532e c2532e = this.ad;
            if (equals) {
                obj = new C16750e(c2532e, "MD5");
            } else if (abstractC15603e.equals(amazon.signatures)) {
                obj = new C16750e(c2532e, "SHA-1");
            } else if (abstractC15603e.equals(amazon.tapsense)) {
                obj = new C16750e(c2532e, "SHA-224");
            } else if (abstractC15603e.equals(amazon.isVip)) {
                obj = new C16750e(c2532e, "SHA-256");
            } else if (abstractC15603e.equals(amazon.inmobi)) {
                obj = new C16750e(c2532e, "SHA-384");
            } else if (abstractC15603e.equals(amazon.subs)) {
                obj = new C16750e(c2532e, "SHA-512");
            } else if (abstractC15603e.equals(amazon.isPro)) {
                obj = new C16750e(c2532e, "SHA3-224");
            } else if (abstractC15603e.equals(amazon.applovin)) {
                obj = new C16750e(c2532e, "SHA3-256");
            } else if (abstractC15603e.equals(amazon.ads)) {
                obj = new C16750e(c2532e, "SHA3-384");
            } else if (abstractC15603e.equals(amazon.premium)) {
                obj = new C16750e(c2532e, "SHA3-512");
            } else if (abstractC15603e.equals(amazon.Signature)) {
                obj = new C16750e(c2532e, "RIPEMD160");
            } else {
                amazon amazonVar = amazon.smaato;
                if (abstractC15603e.equals(amazonVar)) {
                    obj = new Object();
                } else if (abstractC15603e.equals(amazon.appmetrica)) {
                    obj = new C4161e(c2532e, 0);
                } else if (abstractC15603e.equals(amazon.purchase)) {
                    obj = new C4161e(c2532e, 1);
                } else if (abstractC15603e.equals(amazon.billing)) {
                    obj = new C4161e(c2532e, 2);
                } else if (abstractC15603e.equals(amazon.yandex)) {
                    obj = new C4161e(c2532e, 3);
                } else if (abstractC15603e.equals(amazon.startapp)) {
                    obj = new C4161e(c2532e, 4);
                } else if (abstractC15603e.equals(amazon.admob)) {
                    obj = new Object();
                } else if (abstractC15603e.equals(amazon.remoteconfig)) {
                    obj = new Object();
                } else if (abstractC15603e.equals(amazon.subscription)) {
                    obj = new Object();
                } else if (abstractC15603e.equals(amazon.pro)) {
                    obj = new Object();
                } else if (abstractC15603e.equals(amazon.mopub)) {
                    obj = new AbstractC0827e(c2532e);
                } else if (abstractC15603e.equals(amazon.adcel)) {
                    obj = new AbstractC0827e(c2532e);
                } else if (abstractC15603e.equals(amazon.loadAd)) {
                    obj = new Object();
                } else if (abstractC15603e.equals(amazon.advert)) {
                    Object obj2 = new Object();
                    obj = obj2;
                } else {
                    obj = null;
                }
            }
            Object putIfAbsent = concurrentHashMap.putIfAbsent(abstractC15603e, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (InterfaceC10597e) obj;
    }
}

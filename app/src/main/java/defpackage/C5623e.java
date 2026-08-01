package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5623e {
    public static final C5623e metrica = new C5623e();
    public final ConcurrentHashMap vip = new ConcurrentHashMap();
    public final C6325e ad = new C6325e((byte) 0, 2);

    public final InterfaceC3028e ad(Class cls) {
        InterfaceC3028e applovin;
        Class cls2;
        AbstractC0352e.ad(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.vip;
        InterfaceC3028e interfaceC3028e = (InterfaceC3028e) concurrentHashMap.get(cls);
        if (interfaceC3028e != null) {
            return interfaceC3028e;
        }
        C6325e c6325e = this.ad;
        c6325e.getClass();
        Class cls3 = AbstractC1505e.ad;
        if (!AbstractC4994e.class.isAssignableFrom(cls) && (cls2 = AbstractC1505e.ad) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C14702e ad = ((C13580e) c6325e.f13170e).ad(cls);
        int i = ad.license;
        AbstractC6866e abstractC6866e = ad.ad;
        if ((i & 2) == 2) {
            if (AbstractC4994e.class.isAssignableFrom(cls)) {
                applovin = new C10029e(AbstractC1505e.metrica, AbstractC17295e.ad, abstractC6866e);
            } else {
                C3756e c3756e = AbstractC1505e.vip;
                C8901e c8901e = AbstractC17295e.vip;
                if (c8901e == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                applovin = new C10029e(c3756e, c8901e, abstractC6866e);
            }
        } else if (AbstractC4994e.class.isAssignableFrom(cls)) {
            C8901e c8901e2 = null;
            C12993e c12993e = AbstractC1291e.vip;
            C14350e c14350e = AbstractC17921e.vip;
            C3756e c3756e2 = AbstractC1505e.metrica;
            if (AbstractC8703e.m2467class(ad.ad()) != 1) {
                c8901e2 = AbstractC17295e.ad;
            }
            C8901e c8901e3 = c8901e2;
            C5614e c5614e = AbstractC10063e.vip;
            if (!(ad instanceof C14702e)) {
                int[] iArr = C2546e.amazon;
                ad.getClass();
                throw new ClassCastException();
            }
            applovin = C2546e.applovin(ad, c12993e, c14350e, c3756e2, c8901e3, c5614e);
        } else {
            C8901e c8901e4 = null;
            C12993e c12993e2 = AbstractC1291e.ad;
            C14350e c14350e2 = AbstractC17921e.ad;
            C3756e c3756e3 = AbstractC1505e.vip;
            if (AbstractC8703e.m2467class(ad.ad()) != 1 && (c8901e4 = AbstractC17295e.vip) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C8901e c8901e5 = c8901e4;
            C5614e c5614e2 = AbstractC10063e.ad;
            if (!(ad instanceof C14702e)) {
                int[] iArr2 = C2546e.amazon;
                ad.getClass();
                throw new ClassCastException();
            }
            applovin = C2546e.applovin(ad, c12993e2, c14350e2, c3756e3, c8901e5, c5614e2);
        }
        InterfaceC3028e interfaceC3028e2 = (InterfaceC3028e) concurrentHashMap.putIfAbsent(cls, applovin);
        return interfaceC3028e2 != null ? interfaceC3028e2 : applovin;
    }
}

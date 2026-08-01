package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10051e {
    public static final C10051e metrica = new C10051e();
    public final ConcurrentHashMap vip = new ConcurrentHashMap();
    public final C0444e ad = new C0444e(1);

    public final InterfaceC11115e ad(Class cls) {
        InterfaceC11115e applovin;
        Class cls2;
        AbstractC10546e.ad(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.vip;
        InterfaceC11115e interfaceC11115e = (InterfaceC11115e) concurrentHashMap.get(cls);
        if (interfaceC11115e != null) {
            return interfaceC11115e;
        }
        C0444e c0444e = this.ad;
        c0444e.getClass();
        Class cls3 = AbstractC4249e.ad;
        if (!AbstractC3405e.class.isAssignableFrom(cls) && (cls2 = AbstractC4249e.ad) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C15610e ad = ((C5764e) c0444e.f2491e).ad(cls);
        int i = ad.license;
        AbstractC7718e abstractC7718e = ad.ad;
        if ((i & 2) == 2) {
            if (AbstractC3405e.class.isAssignableFrom(cls)) {
                applovin = new C0400e(AbstractC4249e.metrica, AbstractC10289e.ad, abstractC7718e);
            } else {
                C3493e c3493e = AbstractC4249e.vip;
                C15371e c15371e = AbstractC10289e.vip;
                if (c15371e == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                applovin = new C0400e(c3493e, c15371e, abstractC7718e);
            }
        } else if (AbstractC3405e.class.isAssignableFrom(cls)) {
            C15371e c15371e2 = null;
            C1665e c1665e = AbstractC15280e.vip;
            C10088e c10088e = AbstractC0414e.vip;
            C3493e c3493e2 = AbstractC4249e.metrica;
            if (AbstractC8703e.m2467class(ad.ad()) != 1) {
                c15371e2 = AbstractC10289e.ad;
            }
            C15371e c15371e3 = c15371e2;
            C7323e c7323e = AbstractC3652e.vip;
            if (!(ad instanceof C15610e)) {
                int[] iArr = C2624e.amazon;
                ad.getClass();
                throw new ClassCastException();
            }
            applovin = C2624e.applovin(ad, c1665e, c10088e, c3493e2, c15371e3, c7323e);
        } else {
            C15371e c15371e4 = null;
            C1665e c1665e2 = AbstractC15280e.ad;
            C10088e c10088e2 = AbstractC0414e.ad;
            C3493e c3493e3 = AbstractC4249e.vip;
            if (AbstractC8703e.m2467class(ad.ad()) != 1 && (c15371e4 = AbstractC10289e.vip) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C15371e c15371e5 = c15371e4;
            C7323e c7323e2 = AbstractC3652e.ad;
            if (!(ad instanceof C15610e)) {
                int[] iArr2 = C2624e.amazon;
                ad.getClass();
                throw new ClassCastException();
            }
            applovin = C2624e.applovin(ad, c1665e2, c10088e2, c3493e3, c15371e5, c7323e2);
        }
        InterfaceC11115e interfaceC11115e2 = (InterfaceC11115e) concurrentHashMap.putIfAbsent(cls, applovin);
        return interfaceC11115e2 != null ? interfaceC11115e2 : applovin;
    }
}

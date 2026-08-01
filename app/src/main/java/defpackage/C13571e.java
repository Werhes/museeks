package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۡ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13571e {
    public static final C13571e metrica = new C13571e();
    public final ConcurrentHashMap vip = new ConcurrentHashMap();
    public final C15816e ad = new C15816e(1);

    public final InterfaceC11969e ad(Class cls) {
        InterfaceC11969e isVip;
        AbstractC2930e.ad(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.vip;
        InterfaceC11969e interfaceC11969e = (InterfaceC11969e) concurrentHashMap.get(cls);
        if (interfaceC11969e != null) {
            return interfaceC11969e;
        }
        C15816e c15816e = this.ad;
        c15816e.getClass();
        Class cls2 = AbstractC5630e.ad;
        if (!AbstractC18270e.class.isAssignableFrom(cls)) {
            Class cls3 = AbstractC2037e.ad;
            Class cls4 = AbstractC5630e.ad;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        C8678e ad = ((C16702e) c15816e.f31190e).ad(cls);
        int i = ad.license;
        AbstractC4765e abstractC4765e = ad.ad;
        if ((i & 2) == 2) {
            Class cls5 = AbstractC2037e.ad;
            if (AbstractC18270e.class.isAssignableFrom(cls)) {
                isVip = new C7880e(AbstractC5630e.metrica, AbstractC14313e.ad, abstractC4765e);
            } else {
                C16333e c16333e = AbstractC5630e.vip;
                C17634e c17634e = AbstractC14313e.vip;
                if (c17634e == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                isVip = new C7880e(c16333e, c17634e, abstractC4765e);
            }
        } else {
            Class cls6 = AbstractC2037e.ad;
            if (AbstractC18270e.class.isAssignableFrom(cls)) {
                C17634e c17634e2 = null;
                C4675e c4675e = AbstractC6801e.vip;
                C13889e c13889e = AbstractC16912e.vip;
                C16333e c16333e2 = AbstractC5630e.metrica;
                if (AbstractC8703e.m2467class(ad.ad()) != 1) {
                    c17634e2 = AbstractC14313e.ad;
                }
                C17634e c17634e3 = c17634e2;
                C3304e c3304e = AbstractC15408e.vip;
                if (!(ad instanceof C8678e)) {
                    int[] iArr = C14797e.amazon;
                    ad.getClass();
                    throw new ClassCastException();
                }
                isVip = C14797e.isVip(ad, c4675e, c13889e, c16333e2, c17634e3, c3304e);
            } else {
                C17634e c17634e4 = null;
                C4675e c4675e2 = AbstractC6801e.ad;
                C13889e c13889e2 = AbstractC16912e.ad;
                C16333e c16333e3 = AbstractC5630e.vip;
                if (AbstractC8703e.m2467class(ad.ad()) != 1 && (c17634e4 = AbstractC14313e.vip) == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                C17634e c17634e5 = c17634e4;
                C3304e c3304e2 = AbstractC15408e.ad;
                if (!(ad instanceof C8678e)) {
                    int[] iArr2 = C14797e.amazon;
                    ad.getClass();
                    throw new ClassCastException();
                }
                isVip = C14797e.isVip(ad, c4675e2, c13889e2, c16333e3, c17634e5, c3304e2);
            }
        }
        InterfaceC11969e interfaceC11969e2 = (InterfaceC11969e) concurrentHashMap.putIfAbsent(cls, isVip);
        return interfaceC11969e2 != null ? interfaceC11969e2 : isVip;
    }
}

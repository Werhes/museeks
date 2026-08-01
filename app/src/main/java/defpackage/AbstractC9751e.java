package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9751e {
    public static final int[] ad = {23, 66, 160};
    public static final C5015e vip = new C5015e(new C10673e(24));

    public static final void ad(final InterfaceC12864e interfaceC12864e, final boolean z, final boolean z2, final InterfaceC16154e interfaceC16154e, final long j, final long j2, final float f, final C9630e c9630e, final C14878e c14878e, final float f2, final C15274e c15274e, final C2892e c2892e, C13770e c13770e, final int i, final int i2) {
        InterfaceC12864e interfaceC12864e2;
        int i3;
        InterfaceC16154e interfaceC16154e2;
        int i4;
        C13770e c13770e2;
        C15274e c15274e2;
        c13770e.m3671package(-813380697);
        if ((i & 6) == 0) {
            interfaceC12864e2 = interfaceC12864e;
            i3 = (c13770e.purchase(interfaceC12864e2) ? 4 : 2) | i;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c13770e.billing(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC16154e2 = interfaceC16154e;
            i3 |= c13770e.purchase(interfaceC16154e2) ? 2048 : 1024;
        } else {
            interfaceC16154e2 = interfaceC16154e;
        }
        int i5 = i3;
        if ((i & 24576) == 0) {
            i5 |= c13770e.appmetrica(j) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= c13770e.appmetrica(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= c13770e.metrica(f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= c13770e.purchase(c9630e) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= c13770e.purchase(c14878e) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= c13770e.metrica(f2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.purchase(c15274e) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            if (c15274e == null) {
                c13770e.m3676strictfp(781552596);
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC17861e.adcel(c13770e);
                }
                c15274e2 = (C15274e) m3681throw;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(25210723);
                c13770e.Signature(false);
                c15274e2 = c15274e;
            }
            final InterfaceC3314e metrica = AbstractC13281e.metrica(c15274e2, c13770e, 0);
            InterfaceC3314e vip2 = AbstractC13083e.vip(c15274e2, c13770e, 0);
            boolean booleanValue = ((Boolean) metrica.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) vip2.getValue()).booleanValue();
            float f3 = 0.8f;
            if ((z2 || !booleanValue2) && ((z2 || !booleanValue) && (z2 || !z))) {
                f3 = z2 ? 1.0f : 0.6f;
            }
            C5015e c5015e = vip;
            final C15274e c15274e3 = c15274e2;
            c13770e2 = c13770e;
            final InterfaceC12864e interfaceC12864e3 = interfaceC12864e2;
            final InterfaceC16154e interfaceC16154e3 = interfaceC16154e2;
            final float f4 = f3;
            AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(j2, AbstractC15705e.ad), c5015e.ad(new C15765e(((C15765e) c13770e.adcel(c5015e)).f31051e + f2))}, AbstractC16653e.license(-1992904601, new Function2() { // from class: eَٓۡ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e3 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    boolean z3 = (intValue & 3) != 2;
                    AbstractC7919e abstractC7919e = c13770e3.ad;
                    if (c13770e3.m3673protected(intValue & 1, z3)) {
                        InterfaceC16132e vip3 = AbstractC16102e.vip(((Boolean) metrica.getValue()).booleanValue() ? 0.5f : 0.0f, null, "zIndex", null, c13770e3, 3072, 22);
                        long vip4 = AbstractC9751e.vip(j, ((C15765e) c13770e3.adcel(AbstractC9751e.vip)).f31051e, c13770e3);
                        InterfaceC13352e interfaceC13352e = (InterfaceC13352e) AbstractC14533e.metrica(c15274e3.ad, new Object(), c13770e3, 0).getValue();
                        int i6 = 300;
                        if (!(interfaceC13352e instanceof C16906e)) {
                            if (interfaceC13352e instanceof C2574e) {
                                i6 = 500;
                            } else if (interfaceC13352e instanceof C17612e) {
                                i6 = 120;
                            }
                        }
                        InterfaceC16132e vip5 = AbstractC16102e.vip(f, AbstractC12696e.yandex(i6, 2, AbstractC15894e.ad), "tv-surface-scale", null, c13770e3, 3072, 20);
                        InterfaceC12864e startapp = AbstractC12546e.startapp(interfaceC12864e3, ((Number) vip5.getValue()).floatValue(), ((Number) vip5.getValue()).floatValue(), 0.0f, 0.0f, null, false, 524284);
                        boolean z4 = tapsense.ad;
                        C14878e c14878e2 = c14878e;
                        long j3 = c14878e2.ad;
                        float f5 = c14878e2.vip;
                        long vip6 = AbstractC9751e.vip(j3, f5, c13770e3);
                        float mo497instanceof = ((InterfaceC14388e) c13770e3.adcel(AbstractC11473e.yandex)).mo497instanceof(f5);
                        InterfaceC16154e interfaceC16154e4 = interfaceC16154e3;
                        InterfaceC12864e premium = AbstractC7779e.metrica(startapp, z4, new C1804e(interfaceC16154e4, mo497instanceof, vip6)).premium(new C1904e(((Number) vip3.getValue()).floatValue()));
                        C9630e c9630e2 = C9630e.license;
                        InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC7779e.metrica(premium, !AbstractC7890e.billing(r3, c9630e2), new C13926e(interfaceC16154e4, c9630e)), vip4, interfaceC16154e4);
                        float f6 = f4;
                        boolean metrica3 = c13770e3.metrica(f6) | c13770e3.purchase(interfaceC16154e4);
                        Object m3681throw2 = c13770e3.m3681throw();
                        C5170e c5170e = C2987e.ad;
                        if (metrica3 || m3681throw2 == c5170e) {
                            m3681throw2 = new C15741e(f6, interfaceC16154e4, 1);
                            c13770e3.m3682throws(m3681throw2);
                        }
                        InterfaceC12864e yandex = AbstractC12546e.yandex(metrica2, (Function1) m3681throw2);
                        C10156e c10156e = C5438e.f11676e;
                        InterfaceC2747e license = AbstractC17074e.license(c10156e, true);
                        long j4 = c13770e3.f27286case;
                        int i7 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC3483e advert = c13770e3.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, yandex);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e = C2721e.vip;
                        c13770e3.m3666import();
                        if (c13770e3.f27292implements) {
                            c13770e3.mopub(c7309e);
                        } else {
                            c13770e3.m3684volatile();
                        }
                        C14865e c14865e = C2721e.billing;
                        AbstractC2270e.yandex(c13770e3, license, c14865e);
                        C14865e c14865e2 = C2721e.purchase;
                        AbstractC2270e.yandex(c13770e3, advert, c14865e2);
                        Integer valueOf = Integer.valueOf(i7);
                        C14865e c14865e3 = C2721e.adcel;
                        AbstractC2270e.appmetrica(c13770e3, valueOf, c14865e3);
                        C5430e c5430e = C2721e.mopub;
                        AbstractC2270e.purchase(c13770e3, c5430e);
                        C14865e c14865e4 = C2721e.license;
                        AbstractC2270e.yandex(c13770e3, purchase, c14865e4);
                        boolean z5 = z2;
                        boolean billing = c13770e3.billing(z5);
                        Object m3681throw3 = c13770e3.m3681throw();
                        if (billing || m3681throw3 == c5170e) {
                            m3681throw3 = new C7317e(z5, 4);
                            c13770e3.m3682throws(m3681throw3);
                        }
                        InterfaceC12864e yandex2 = AbstractC12546e.yandex(C0115e.f1276e, (Function1) m3681throw3);
                        InterfaceC2747e license2 = AbstractC17074e.license(c10156e, false);
                        long j5 = c13770e3.f27286case;
                        int i8 = (int) (j5 ^ (j5 >>> 32));
                        InterfaceC3483e advert2 = c13770e3.advert();
                        InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, yandex2);
                        c13770e3.m3666import();
                        if (c13770e3.f27292implements) {
                            c13770e3.mopub(c7309e);
                        } else {
                            c13770e3.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e3, license2, c14865e);
                        AbstractC2270e.yandex(c13770e3, advert2, c14865e2);
                        AbstractC2270e.appmetrica(c13770e3, Integer.valueOf(i8), c14865e3);
                        AbstractC2270e.purchase(c13770e3, c5430e);
                        AbstractC2270e.yandex(c13770e3, purchase2, c14865e4);
                        c2892e.invoke(C14486e.ad, c13770e3, 6);
                        c13770e3.Signature(true);
                        c13770e3.Signature(true);
                    } else {
                        c13770e3.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e2), c13770e2, 56);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٓؓؓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    int advert2 = AbstractC5190e.advert(i2);
                    AbstractC9751e.ad(InterfaceC12864e.this, z, z2, interfaceC16154e, j, j2, f, c9630e, c14878e, f2, c15274e, c2892e, (C13770e) obj, advert, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final long vip(long j, float f, C13770e c13770e) {
        C15492e c15492e = AbstractC12491e.ad;
        if (!C3618e.metrica(j, ((C6032e) c13770e.adcel(c15492e)).startapp())) {
            c13770e.m3676strictfp(117637169);
            c13770e.Signature(false);
            return j;
        }
        c13770e.m3676strictfp(117557530);
        C6032e c6032e = (C6032e) c13770e.adcel(c15492e);
        long startapp = C15765e.vip(f, (float) 0) ? c6032e.startapp() : AbstractC6532e.billing(C3618e.vip(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, ((C3618e) c6032e.pro.getValue()).ad), c6032e.startapp());
        c13770e.Signature(false);
        return startapp;
    }
}

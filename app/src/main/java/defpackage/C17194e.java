package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17194e {
    public static final float license;
    public static final float metrica;
    public static final C17194e ad = new Object();
    public static final C3924e vip = AbstractC6549e.ad;
    public static final float appmetrica = AbstractC18359e.metrica;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eِٗۖ] */
    static {
        float f = 80;
        metrica = f;
        license = f;
    }

    public final void ad(final C11200e c11200e, final boolean z, final InterfaceC12864e interfaceC12864e, long j, long j2, float f, C13770e c13770e, final int i) {
        final long j3;
        final long j4;
        final float f2;
        int i2;
        float f3;
        final long j5;
        long j6;
        c13770e.m3671package(-1076870256);
        int i3 = i | (c13770e.purchase(c11200e) ? 4 : 2) | (c13770e.billing(z) ? 32 : 16) | (c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 74752;
        if (c13770e.m3673protected(i3 & 1, (599187 & i3) != 599186)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                C15492e c15492e = AbstractC11785e.ad;
                long j7 = ((C7019e) c13770e.adcel(c15492e)).ad.f18939interface;
                long j8 = ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig;
                i2 = i3 & (-523265);
                f3 = license;
                j5 = j8;
                j6 = j7;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            }
            c13770e.admob();
            vip(c11200e, z, interfaceC12864e, f3, null, j6, 0.0f, AbstractC16653e.license(298232649, new Function3() { // from class: eٌؚۡ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C13770e c13770e2 = (C13770e) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                        AbstractC9180e.vip(Boolean.valueOf(z), null, AbstractC11008e.metrica(c13770e2, 4), null, AbstractC16653e.license(-2064098104, new C7308e(j5, c11200e, 2), c13770e2), c13770e2, 24576, 10);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, (i2 & 896) | (i2 & 14) | 12582912 | (i2 & 112) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            c13770e.m3659default();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(c11200e, z, interfaceC12864e, j3, j4, f2, i) { // from class: eٍٗؒ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ long f32770e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ boolean f32771e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C11200e f32772e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f32773e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ float f32775e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ long f32776e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(1572865);
                    C17194e.this.ad(this.f32772e, this.f32771e, this.f32773e, this.f32770e, this.f32776e, this.f32775e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void vip(final C11200e c11200e, final boolean z, final InterfaceC12864e interfaceC12864e, final float f, InterfaceC16154e interfaceC16154e, final long j, float f2, final C2892e c2892e, C13770e c13770e, final int i) {
        final C11200e c11200e2;
        int i2;
        final InterfaceC16154e interfaceC16154e2;
        final float f3;
        int i3;
        final InterfaceC16154e interfaceC16154e3;
        c13770e.m3671package(-1341144489);
        if ((i & 6) == 0) {
            c11200e2 = c11200e;
            i2 = (c13770e.purchase(c11200e2) ? 4 : 2) | i;
        } else {
            c11200e2 = c11200e;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.metrica(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.appmetrica(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e.purchase(this) ? 67108864 : 33554432;
        }
        if (c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                i3 = i2 & (-3727361);
                interfaceC16154e3 = vip;
                f3 = appmetrica;
            } else {
                c13770e.m3659default();
                i3 = i2 & (-3727361);
                interfaceC16154e3 = interfaceC16154e;
                f3 = f2;
            }
            int i4 = i3;
            c13770e.admob();
            InterfaceC12864e startapp = AbstractC18007e.startapp(interfaceC12864e, AbstractC11148e.license);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C3114e(6);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e appmetrica2 = AbstractC5750e.appmetrica(startapp, (Function1) m3681throw);
            boolean metrica2 = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && c13770e.metrica(f)) || (i4 & 3072) == 2048) | c13770e.metrica(f3) | c13770e.purchase(interfaceC16154e3);
            Object m3681throw2 = c13770e.m3681throw();
            if (metrica2 || m3681throw2 == c5170e) {
                Function3 function3 = new Function3() { // from class: eْٕٕ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final AbstractC2832e admob = ((InterfaceC16719e) obj2).admob(((C5602e) obj3).ad);
                        int i5 = admob.f6806e;
                        int i6 = admob.f6804e;
                        final C11200e c11200e3 = C11200e.this;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final InterfaceC16154e interfaceC16154e4 = interfaceC16154e3;
                        return ((InterfaceC13158e) obj).ads(i5, i6, C9139e.f18290e, new Function1() { // from class: eْؑٔ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                final C11200e c11200e4 = c11200e3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final InterfaceC16154e interfaceC16154e5 = interfaceC16154e4;
                                AbstractC3698e.Signature((AbstractC3698e) obj4, AbstractC2832e.this, 0, 0, new Function1() { // from class: eَِٝ
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        C10122e c10122e = (C10122e) obj5;
                                        C11200e c11200e5 = C11200e.this;
                                        boolean z4 = ((Number) c11200e5.ad.license()).floatValue() > 0.0f || z3;
                                        float floatValue = ((Number) c11200e5.ad.license()).floatValue();
                                        c10122e.getClass();
                                        c10122e.signatures((floatValue * AbstractC4653e.ad(c10122e, f6)) - Float.intBitsToFloat((int) (c10122e.f19998e & 4294967295L)));
                                        c10122e.amazon(z4 ? c10122e.f20006e.vip() * f7 : 0.0f);
                                        c10122e.loadAd(interfaceC16154e5);
                                        c10122e.appmetrica(true);
                                        return Unit.INSTANCE;
                                    }
                                }, 4);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                };
                c13770e.m3682throws(function3);
                m3681throw2 = function3;
            }
            InterfaceC12864e metrica3 = AbstractC16136e.metrica(AbstractC18127e.purchase(appmetrica2, (Function3) m3681throw2), j, interfaceC16154e3);
            int i5 = ((i4 >> 12) & 7168) | 48;
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j2 = c13770e.f27286case;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica3);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            c2892e.invoke(C14486e.ad, c13770e, Integer.valueOf(((i5 >> 6) & 112) | 6));
            c13770e.Signature(true);
            interfaceC16154e2 = interfaceC16154e3;
        } else {
            c13770e.m3659default();
            interfaceC16154e2 = interfaceC16154e;
            f3 = f2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٍؔٙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C17194e.this.vip(c11200e, z, interfaceC12864e, f, interfaceC16154e2, j, f3, c2892e, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12843e {
    public static final float ad;
    public static final long appmetrica;
    public static final float license;
    public static final float metrica;
    public static final float vip;

    static {
        float f = AbstractC11550e.ad;
        ad = AbstractC11550e.vip;
        vip = 16;
        metrica = 14;
        license = 6;
        appmetrica = AbstractC13362e.startapp(20);
    }

    public static final void ad(final boolean z, final Function0 function0, final InterfaceC12864e interfaceC12864e, final boolean z2, final long j, final long j2, final C2892e c2892e, C13770e c13770e, final int i) {
        int i2;
        Function0 function02;
        c13770e.m3671package(-1573136853);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= c13770e.yandex(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.billing(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.appmetrica(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.appmetrica(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.purchase(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 8388608 : 4194304;
        }
        if (c13770e.m3673protected(i2 & 1, (4793491 & i2) != 4793490)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            C2892e license2 = AbstractC16653e.license(1128552423, new C18539e(interfaceC12864e, z, AbstractC17052e.ad(0.0f, 2, j, true), z2, function02, c2892e), c13770e);
            int i3 = i2 >> 12;
            license(j, j2, z, license2, c13770e, ((i2 << 6) & 896) | (i3 & 112) | (i3 & 14) | 3072);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٕۥۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC12843e.ad(z, function0, interfaceC12864e, z2, j, j2, c2892e, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void license(final long j, final long j2, final boolean z, final C2892e c2892e, C13770e c13770e, final int i) {
        int i2;
        boolean z2;
        Object startapp;
        boolean z3;
        InterfaceC6512e metrica2;
        c13770e.m3671package(-833145221);
        if ((i & 6) == 0) {
            i2 = (c13770e.appmetrica(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.appmetrica(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= c13770e.billing(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 2048 : 1024;
        }
        boolean z4 = false;
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            C13119e advert = AbstractC0207e.advert(Boolean.valueOf(z2), null, c13770e, i3 & 14, 2);
            boolean booleanValue = ((Boolean) advert.license.getValue()).booleanValue();
            c13770e.m3676strictfp(-1069234984);
            long j3 = booleanValue ? j : j2;
            c13770e.Signature(false);
            Object purchase = C3618e.purchase(j3);
            boolean purchase2 = c13770e.purchase(purchase);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (purchase2 || m3681throw == obj) {
                Object c11139e = new C11139e(C5430e.f11635e, new C17097e(10, purchase));
                c13770e.m3682throws(c11139e);
                m3681throw = c11139e;
            }
            C11139e c11139e2 = (C11139e) m3681throw;
            if (advert.billing()) {
                startapp = AbstractC13501e.startapp(c13770e, 1666827533, false, advert);
            } else {
                c13770e.m3676strictfp(1666573488);
                boolean purchase3 = c13770e.purchase(advert);
                startapp = c13770e.m3681throw();
                if (purchase3 || startapp == obj) {
                    AbstractC13717e adcel = AbstractC12640e.adcel();
                    Function1 appmetrica2 = adcel != null ? adcel.appmetrica() : null;
                    AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
                    try {
                        Object metrica3 = advert.metrica();
                        AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                        c13770e.m3682throws(metrica3);
                        startapp = metrica3;
                        z4 = false;
                    } catch (Throwable th) {
                        AbstractC12640e.Signature(adcel, smaato, appmetrica2);
                        throw th;
                    }
                }
                c13770e.Signature(z4);
            }
            boolean booleanValue2 = ((Boolean) startapp).booleanValue();
            c13770e.m3676strictfp(-1069234984);
            long j4 = booleanValue2 ? j : j2;
            c13770e.Signature(z4);
            C3618e c3618e = new C3618e(j4);
            boolean purchase4 = c13770e.purchase(advert);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase4 || m3681throw2 == obj) {
                m3681throw2 = AbstractC14533e.purchase(new C6322e(advert, 0));
                c13770e.m3682throws(m3681throw2);
            }
            boolean booleanValue3 = ((Boolean) ((InterfaceC16132e) m3681throw2).getValue()).booleanValue();
            c13770e.m3676strictfp(-1069234984);
            long j5 = booleanValue3 ? j : j2;
            c13770e.Signature(false);
            C3618e c3618e2 = new C3618e(j5);
            boolean purchase5 = c13770e.purchase(advert);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase5 || m3681throw3 == obj) {
                m3681throw3 = AbstractC14533e.purchase(new C6322e(advert, 1));
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC16490e interfaceC16490e = (InterfaceC16490e) ((InterfaceC16132e) m3681throw3).getValue();
            c13770e.m3676strictfp(1058649156);
            if (interfaceC16490e.vip(Boolean.FALSE, Boolean.TRUE)) {
                c13770e.m3676strictfp(272207019);
                metrica2 = AbstractC11008e.metrica(c13770e, 4);
                z3 = false;
                c13770e.Signature(false);
            } else {
                z3 = false;
                c13770e.m3676strictfp(272326989);
                metrica2 = AbstractC11008e.metrica(c13770e, 5);
                c13770e.Signature(false);
            }
            c13770e.Signature(z3);
            AbstractC1101e.ad(AbstractC8703e.loadAd(((C3618e) AbstractC0207e.billing(advert, c3618e, c3618e2, metrica2, c11139e2, c13770e, 0).f22034e.getValue()).ad, AbstractC0608e.ad), c2892e, c13770e, (i3 & 112) | 8);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؘؘٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC12843e.license(j, j2, z, c2892e, (C13770e) obj2, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void metrica(Function2 function2, C13770e c13770e, int i) {
        boolean z;
        C10156e c10156e = C5438e.f11676e;
        c13770e.m3671package(-1349901398);
        int i2 = (c13770e.yandex(function2) ? 4 : 2) | i | (c13770e.yandex(null) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object m3681throw = c13770e.m3681throw();
            if (z2 || m3681throw == C2987e.ad) {
                m3681throw = new C9346e(2, function2);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw;
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, interfaceC2747e, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            if (function2 != null) {
                c13770e.m3676strictfp(870361332);
                InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC11203e.startapp(c0115e, "text"), vip, 0.0f, 2);
                InterfaceC2747e license2 = AbstractC17074e.license(c10156e, false);
                long j2 = c13770e.f27286case;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC3483e advert2 = c13770e.advert();
                InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, smaato);
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, license2, c14865e);
                AbstractC2270e.yandex(c13770e, advert2, c14865e2);
                AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
                AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
                function2.invoke(c13770e, Integer.valueOf(i3));
                z = true;
                c13770e.Signature(true);
                c13770e.Signature(false);
            } else {
                z = true;
                c13770e.m3676strictfp(870466081);
                c13770e.Signature(false);
            }
            c13770e.m3676strictfp(870557345);
            c13770e.Signature(false);
            c13770e.Signature(z);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2920e(i, function2);
        }
    }

    public static final void vip(final boolean z, final Function0 function0, InterfaceC12864e interfaceC12864e, boolean z2, final Function2 function2, final long j, final long j2, C13770e c13770e, final int i) {
        final InterfaceC12864e interfaceC12864e2;
        final boolean z3;
        InterfaceC12864e interfaceC12864e3;
        boolean z4;
        C2892e license2;
        c13770e.m3671package(1015017965);
        int i2 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.yandex(function0) ? 32 : 16) | 200064 | (c13770e.appmetrica(j) ? 1048576 : 524288) | (c13770e.appmetrica(j2) ? 8388608 : 4194304) | 100663296;
        byte b = 0;
        if (c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                interfaceC12864e3 = C0115e.f1276e;
                z4 = true;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
                z4 = z2;
            }
            c13770e.admob();
            if (function2 == null) {
                c13770e.m3676strictfp(1830887765);
                c13770e.Signature(false);
                license2 = null;
            } else {
                c13770e.m3676strictfp(1830887766);
                license2 = AbstractC16653e.license(-1745256900, new C2920e(function2, 15, b), c13770e);
                c13770e.Signature(false);
            }
            float f = AbstractC17480e.ad;
            InterfaceC12864e purchase = AbstractC18127e.purchase(interfaceC12864e3, new C9868e(10));
            C2892e license3 = AbstractC16653e.license(-906085472, new C0640e(1, license2), c13770e);
            int i3 = (i2 & 14) | 12582912 | (i2 & 112) | 3072;
            int i4 = i2 >> 6;
            ad(z, function0, purchase, z4, j, j2, license3, c13770e, (i4 & 458752) | i3 | (57344 & i4) | 1572864);
            interfaceC12864e2 = interfaceC12864e3;
            z3 = z4;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            z3 = z2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(z, function0, interfaceC12864e2, z3, function2, j, j2, i) { // from class: eِّۢ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f24154e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f24155e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f24156e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ boolean f24157e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ boolean f24158e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ long f24159e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ long f24160e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(24577);
                    AbstractC12843e.vip(this.f24158e, this.f24156e, this.f24155e, this.f24157e, this.f24154e, this.f24160e, this.f24159e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

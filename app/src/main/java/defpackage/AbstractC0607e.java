package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0607e {
    public static final StringBuilder ad = new StringBuilder(64);
    public static C17149e vip;

    public static final void ad(final C12817e c12817e, EnumC11342e enumC11342e, String str, Function0 function0, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(821200907);
        int i2 = (c13770e.purchase(c12817e) ? 4 : 2) | i | (c13770e.license(enumC11342e.ordinal()) ? 32 : 16) | (c13770e.purchase(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(function0) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            InterfaceC12864e advert = AbstractC12220e.advert(AbstractC9546e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), false, null, function0, 15), 16, 8);
            C2892e license = AbstractC16653e.license(-706443587, new C6710e(6, enumC11342e, str, c12817e), c13770e);
            final int i3 = 0;
            C2892e license2 = AbstractC16653e.license(1765336446, new Function3() { // from class: eٌۜٛ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                    switch (i3) {
                        case 0:
                            C13770e c13770e3 = (C13770e) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= c13770e3.purchase(interfaceC10799e) ? 4 : 2;
                            }
                            if (c13770e3.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                                C12817e c12817e2 = c12817e;
                                AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(-363729346, new C0019e(c12817e2, 1), c13770e3), AbstractC16653e.license(-481366115, new C0019e(c12817e2, 2), c13770e3), c13770e3, (intValue & 14) | 432);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e4 = (C13770e) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                AbstractC1328e.ad(c12817e.metrica, true, 0L, c13770e4, 48, 4);
                            } else {
                                c13770e4.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e);
            final int i4 = 1;
            c13770e2 = c13770e;
            AbstractC6401e.vip(license, license2, advert, AbstractC16653e.license(-1881038080, new Function3() { // from class: eٌۜٛ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                    switch (i4) {
                        case 0:
                            C13770e c13770e3 = (C13770e) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= c13770e3.purchase(interfaceC10799e) ? 4 : 2;
                            }
                            if (c13770e3.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                                C12817e c12817e2 = c12817e;
                                AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(-363729346, new C0019e(c12817e2, 1), c13770e3), AbstractC16653e.license(-481366115, new C0019e(c12817e2, 2), c13770e3), c13770e3, (intValue & 14) | 432);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e4 = (C13770e) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                AbstractC1328e.ad(c12817e.metrica, true, 0L, c13770e4, 48, 4);
                            } else {
                                c13770e4.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), c13770e2, 3126, 0);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C15158e(c12817e, enumC11342e, str, function0, i);
        }
    }

    public static final C11249e appmetrica(InterfaceC16719e interfaceC16719e) {
        Object signatures = interfaceC16719e.signatures();
        if (signatures instanceof C11249e) {
            return (C11249e) signatures;
        }
        return null;
    }

    public static final C8404e billing(InterfaceC5052e interfaceC5052e) {
        Class yandex = AbstractC5965e.yandex(interfaceC5052e);
        C8404e c8404e = (C8404e) (yandex != null ? AbstractC3820e.ad.vip(yandex) : null);
        if (c8404e != null) {
            return c8404e;
        }
        throw new Error("Type parameter container is not resolved: " + interfaceC5052e.mo1351switch());
    }

    public static final C17149e license() {
        C17149e c17149e = vip;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        C13935e c13935e = new C13935e(20);
        c13935e.m3733extends(18.3f, 5.71f);
        c13935e.premium(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c13935e.m3747this(12.0f, 10.59f);
        c13935e.m3747this(7.11f, 5.7f);
        c13935e.premium(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c13935e.premium(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c13935e.m3747this(10.59f, 12.0f);
        c13935e.m3747this(5.7f, 16.89f);
        c13935e.premium(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c13935e.premium(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c13935e.m3747this(12.0f, 13.41f);
        c13935e.m3738native(4.89f, 4.89f);
        c13935e.premium(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c13935e.premium(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c13935e.m3747this(13.41f, 12.0f);
        c13935e.m3738native(4.89f, -4.89f);
        c13935e.premium(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
        c13935e.ads();
        C18373e.ad(c18373e, (ArrayList) c13935e.f27641e, c18466e);
        C17149e vip2 = c18373e.vip();
        vip = vip2;
        return vip2;
    }

    public static String metrica(String str, String str2) {
        StringBuilder sb = ad;
        sb.setLength(0);
        sb.append("----");
        sb.append(':');
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC2301e.subscription(sb.length() <= 64);
        return sb.toString();
    }

    public static final float purchase(C11249e c11249e) {
        if (c11249e != null) {
            return c11249e.ad;
        }
        return 0.0f;
    }

    public static final void vip(InterfaceC12864e interfaceC12864e, long j, float f, float f2, C13770e c13770e, final int i) {
        final InterfaceC12864e interfaceC12864e2;
        final long j2;
        final float f3;
        final float f4;
        long j3;
        int i2;
        float f5;
        float f6;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(-998441586);
        int i3 = i | (c13770e.license(R.drawable.player_shuffle) ? 4 : 2) | 221360;
        if (c13770e.m3673protected(i3 & 1, (74899 & i3) != 74898)) {
            c13770e.m3655case();
            int i4 = i & 1;
            C0115e c0115e = C0115e.f1276e;
            if (i4 == 0 || c13770e.isPro()) {
                j3 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                i2 = i3 & (-897);
                f5 = 24;
                f6 = 8;
                interfaceC12864e3 = c0115e;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-897);
                interfaceC12864e3 = interfaceC12864e;
                j3 = j;
                f5 = f;
                f6 = f2;
            }
            c13770e.admob();
            InterfaceC12864e metrica = AbstractC16136e.metrica(AbstractC12447e.vip(interfaceC12864e3, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.metrica), C3618e.vip(0.25f, j3), AbstractC10432e.ad);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j4 = c13770e.f27286case;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i5), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC10727e metrica2 = AbstractC12475e.metrica(R.drawable.player_shuffle, i2 & 14, c13770e);
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC12220e.mopub(c0115e, f6), f5);
            long j5 = j3;
            AbstractC5647e.vip(metrica2, null, startapp, j5, c13770e, 56, 0);
            c13770e.Signature(true);
            j2 = j5;
            interfaceC12864e2 = interfaceC12864e3;
            f3 = f5;
            f4 = f6;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            j2 = j;
            f3 = f;
            f4 = f2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(j2, f3, f4, i) { // from class: eٖؑؖ

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ float f2357e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ long f2358e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ float f2359e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert2 = AbstractC5190e.advert(3073);
                    AbstractC0607e.vip(InterfaceC12864e.this, this.f2358e, this.f2357e, this.f2359e, (C13770e) obj, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

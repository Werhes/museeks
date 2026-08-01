package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4608e {
    public static final C2443e ad = new C2443e("STATE_REG", 2);
    public static final C2443e vip = new C2443e("STATE_COMPLETED", 2);
    public static final C2443e metrica = new C2443e("STATE_CANCELLED", 2);
    public static final C2443e license = new C2443e("NO_RESULT", 2);
    public static final C2443e appmetrica = new C2443e("PARAM_CLAUSE_0", 2);

    public static final void ad(int i, int i2, C13770e c13770e, boolean z, boolean z2) {
        boolean z3;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1568045024);
        int i3 = i2 | (c13770e2.license(i) ? 4 : 2);
        if (c13770e2.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            C5100e c5100e = AbstractC10432e.ad;
            if (z) {
                c13770e2.m3676strictfp(-1235562010);
                float f = 16;
                AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.metrica(AbstractC18007e.license(AbstractC12447e.vip(c0115e, AbstractC6549e.vip(0.0f, 0.0f, f, f, 3)), 8), 1.0f), ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.subscription, c5100e), c13770e2, 0);
            } else {
                c13770e2.m3676strictfp(-1246538676);
            }
            c13770e2.Signature(false);
            String appmetrica2 = AbstractC5297e.appmetrica(c13770e2, i);
            C15492e c15492e = AbstractC11785e.ad;
            float f2 = 16;
            AbstractC14489e.vip(appmetrica2, AbstractC12220e.advert(c0115e, f2, 12), ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 48, 0, 262136);
            c13770e2 = c13770e;
            if (z2) {
                c13770e2.m3676strictfp(-1235064212);
                z3 = false;
                AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.metrica(AbstractC18007e.license(AbstractC12447e.vip(c0115e, AbstractC6549e.vip(f2, f2, 0.0f, 0.0f, 12)), 8), 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, c5100e), c13770e2, 0);
            } else {
                z3 = false;
                c13770e2.m3676strictfp(-1246538676);
            }
            c13770e2.Signature(z3);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C3196e(i, z, z2, i2);
        }
    }

    public static void appmetrica(int i, int i2) {
        String advert;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                advert = AbstractC17947e.advert("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
                }
                advert = AbstractC17947e.advert("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(advert);
        }
    }

    public static void billing(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? yandex(i, i3, "start index") : (i2 < 0 || i2 > i3) ? yandex(i2, i3, "end index") : AbstractC17947e.advert("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static int license(short s) {
        if (s == 0) {
            return 1;
        }
        if (s == 1) {
            return 2;
        }
        if (s == 2) {
            return 3;
        }
        if (s == 3) {
            return 4;
        }
        if (s == 4) {
            return 5;
        }
        if (s == 5) {
            return 6;
        }
        if (s == 6) {
            return 7;
        }
        if (s == 7) {
            return 8;
        }
        if (s == 8) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(s, "Invalid log level: "));
    }

    public static final C18220e metrica(AbstractC0003e abstractC0003e) {
        C15816e c15816e = abstractC0003e.ad;
        while (true) {
            C18220e c18220e = (C18220e) ((AtomicReference) c15816e.f31190e).get();
            if (c18220e != null) {
                return c18220e;
            }
            C11380e ad2 = AbstractC5097e.ad();
            C15420e c15420e = AbstractC6731e.ad;
            C18220e c18220e2 = new C18220e(abstractC0003e, AbstractC5797e.vip(ad2, AbstractC1497e.ad.f25795e));
            AtomicReference atomicReference = (AtomicReference) c15816e.f31190e;
            do {
                InterfaceC5083e interfaceC5083e = null;
                if (atomicReference.compareAndSet(null, c18220e2)) {
                    C15420e c15420e2 = AbstractC6731e.ad;
                    AbstractC5336e.purchase(c18220e2, AbstractC1497e.ad.f25795e, 0, new C4870e(c18220e2, interfaceC5083e, 28), 2);
                    return c18220e2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static void purchase(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(yandex(i, i2, "index"));
        }
    }

    public static final void vip(boolean z, final C4242e c4242e, Function0 function0, C13770e c13770e, int i) {
        c13770e.m3671package(2023453089);
        int i2 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.purchase(c4242e) ? 32 : 16) | (c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            c13770e.m3676strictfp(825169814);
            C2892e license2 = AbstractC16653e.license(224785615, new Function2() { // from class: eؕۤۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC5647e.vip(AbstractC12475e.metrica(c4242e.metrica, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, c4242e.ad), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e);
            c13770e.Signature(false);
            InterfaceC12864e license3 = AbstractC9546e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), false, null, function0, 15);
            Function2 function2 = c4242e.vip;
            float f = AbstractC11992e.ad;
            C8872e ad2 = AbstractC11992e.ad(C3618e.startapp, 0L, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, 0L, c13770e, 506);
            AbstractC16429e.ad(AbstractC16653e.license(1293185667, new Function2() { // from class: eؕۤۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC5647e.vip(AbstractC12475e.metrica(c4242e.metrica, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, c4242e.ad), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), license3, null, function2, license2, z ? null : AbstractC15203e.ad, ad2, 0.0f, 0.0f, c13770e, 6, 388);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15545e(z, c4242e, function0, i, 6);
        }
    }

    public static String yandex(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC17947e.advert("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC17947e.advert("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
    }
}

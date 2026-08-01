package defpackage;

import android.view.KeyEvent;
import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9835e {
    public static void ad(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            for (int length2 = iArr3.length - 1; length2 >= 0; length2--) {
                iArr3[length2] = iArr2[length2] ^ iArr[i2 + length2];
            }
            C13806e.purchase(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
    }

    public static final int adcel(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static void advert(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    public static final void appmetrica(InterfaceC12864e interfaceC12864e, C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C2892e c2892e4, C2892e c2892e5, C2892e c2892e6, C2892e c2892e7, C2892e c2892e8, C13770e c13770e, int i) {
        c13770e.m3671package(-358461264);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(c2892e5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.yandex(c2892e6) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.yandex(c2892e7) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e.yandex(c2892e8) ? 67108864 : 33554432;
        }
        if (!c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            c13770e.m3659default();
        } else if (AbstractC15211e.metrica(c13770e)) {
            c13770e.m3676strictfp(-1630327453);
            metrica(interfaceC12864e, c2892e, c2892e2, c2892e3, c2892e4, c2892e5, c2892e6, c2892e7, c2892e8, c13770e, i2 & 268435454);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(-1629862236);
            license(interfaceC12864e, c2892e, c2892e2, c2892e3, c2892e4, c2892e5, c2892e6, c2892e7, c2892e8, c13770e, i2 & 268435454);
            c13770e.Signature(false);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13776e(interfaceC12864e, c2892e, c2892e2, c2892e3, c2892e4, c2892e5, c2892e6, c2892e7, c2892e8, i, 0);
        }
    }

    public static final void billing(String str, String str2, boolean z, Function0 function0, C13770e c13770e, int i) {
        boolean z2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(146467633);
        int i2 = i | (c13770e2.purchase(str) ? 4 : 2) | (c13770e2.purchase(str2) ? 32 : 16) | (c13770e2.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e2.yandex(function0) ? 2048 : 1024);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e2.m3676strictfp(-978520564);
            C9122e c9122e = new C9122e();
            c9122e.metrica(str);
            if (str2 != null) {
                c13770e2.m3676strictfp(-313139405);
                c9122e.f18278e.append(' ');
                int appmetrica = c9122e.appmetrica(new C4282e(((C0896e) c13770e2.adcel(AbstractC3577e.ad)).vip, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    c9122e.metrica(str2);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    c9122e.license(appmetrica);
                }
            } else {
                c13770e2.m3676strictfp(-319846596);
            }
            c13770e2.Signature(false);
            C10566e purchase = c9122e.purchase();
            c13770e2.Signature(false);
            Object m3681throw = c13770e2.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC17861e.adcel(c13770e2);
            }
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica = AbstractC9546e.metrica(c0115e, (C15274e) m3681throw, null, false, null, function0, 28);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(4), C5438e.f11668e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, metrica);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC14489e.metrica(purchase, AbstractC11261e.appmetrica(new C5228e(1.0f, false)), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.purchase, c13770e, 0, 24960, 241660);
            c13770e2 = c13770e;
            if (z) {
                c13770e2.m3676strictfp(63536894);
                AbstractC1328e.vip(AbstractC18007e.startapp(c0115e, 20), ((C0896e) c13770e2.adcel(AbstractC3577e.ad)).vip, c13770e2, 6, 0);
                z2 = false;
            } else {
                z2 = false;
                c13770e2.m3676strictfp(56082541);
            }
            c13770e2.Signature(z2);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(str, str2, z, function0, i);
        }
    }

    public static final void license(InterfaceC12864e interfaceC12864e, C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C2892e c2892e4, C2892e c2892e5, C2892e c2892e6, C2892e c2892e7, C2892e c2892e8, C13770e c13770e, int i) {
        int i2;
        C2892e c2892e9;
        C2892e c2892e10 = c2892e3;
        C2892e c2892e11 = c2892e4;
        C2892e c2892e12 = c2892e5;
        C2892e c2892e13 = c2892e6;
        C2892e c2892e14 = c2892e8;
        c13770e.m3671package(-200618155);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c2892e10) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.yandex(c2892e11) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(c2892e12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.yandex(c2892e13) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.yandex(c2892e7) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e.yandex(c2892e14) ? 67108864 : 33554432;
        }
        if (c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            float f = 16;
            InterfaceC12864e smaato = AbstractC12220e.smaato(interfaceC12864e, 0.0f, f, 1);
            C13964e billing = AbstractC16497e.billing(f);
            C9577e c9577e = C5438e.f11672e;
            C4789e ad = AbstractC14801e.ad(billing, c9577e, c13770e, 6);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            int i4 = i2;
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            c2892e.invoke(c13770e, Integer.valueOf((i4 >> 3) & 14));
            double d = 1.0f;
            if (d <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e metrica = AbstractC18007e.metrica(new C5228e(1.0f, true), 1.0f);
            int i5 = ((i4 << 3) & 7168) | 48;
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
            long j2 = c13770e.f27286case;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, metrica);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i6, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            c2892e2.invoke(C14486e.ad, c13770e, Integer.valueOf(((i5 >> 6) & 112) | 6));
            c13770e.Signature(true);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato2 = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f), c9577e, c13770e, 6);
            long j3 = c13770e.f27286case;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, smaato2);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i7, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e, 54);
            long j4 = c13770e.f27286case;
            int i8 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert4 = c13770e.advert();
            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert4, c14865e2);
            AbstractC13501e.mopub(i8, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase4, c14865e4);
            if (d <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            C5228e c5228e = new C5228e(1.0f, true);
            C4789e ad4 = AbstractC14801e.ad(AbstractC16497e.billing(1), c9577e, c13770e, 6);
            long j5 = c13770e.f27286case;
            int i9 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC3483e advert5 = c13770e.advert();
            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, c5228e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad4, c14865e);
            AbstractC2270e.yandex(c13770e, advert5, c14865e2);
            AbstractC13501e.mopub(i9, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase5, c14865e4);
            c2892e10 = c2892e3;
            c2892e10.invoke(c13770e, Integer.valueOf((i4 >> 9) & 14));
            c2892e11 = c2892e4;
            c2892e11.invoke(c13770e, Integer.valueOf((i4 >> 12) & 14));
            c13770e.Signature(true);
            c2892e9 = c2892e7;
            c2892e9.invoke(c13770e, Integer.valueOf((i4 >> 21) & 14));
            c2892e14 = c2892e8;
            c2892e14.invoke(c13770e, Integer.valueOf((i4 >> 24) & 14));
            c13770e.Signature(true);
            c2892e12 = c2892e5;
            c2892e12.invoke(c13770e, Integer.valueOf((i4 >> 15) & 14));
            c2892e13 = c2892e6;
            c2892e13.invoke(c13770e, Integer.valueOf((i4 >> 18) & 14));
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c2892e9 = c2892e7;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13776e(interfaceC12864e, c2892e, c2892e2, c2892e10, c2892e11, c2892e12, c2892e13, c2892e9, c2892e14, i, 2);
        }
    }

    public static final void metrica(InterfaceC12864e interfaceC12864e, C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C2892e c2892e4, C2892e c2892e5, C2892e c2892e6, C2892e c2892e7, C2892e c2892e8, C13770e c13770e, int i) {
        int i2;
        C2892e c2892e9;
        C2892e c2892e10;
        C2892e c2892e11 = c2892e;
        C2892e c2892e12 = c2892e2;
        C2892e c2892e13 = c2892e7;
        c13770e.m3671package(1112129261);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e11) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c2892e3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.yandex(c2892e4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(c2892e5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.yandex(c2892e6) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.yandex(c2892e13) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c13770e.yandex(c2892e8) ? 67108864 : 33554432;
        }
        if (c13770e.m3673protected(i2 & 1, (38347923 & i2) != 38347922)) {
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            int i4 = i2;
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC12220e.loadAd(c0115e, 0.0f, 48, 0.0f, 0.0f, 13), 24, 0.0f, 2);
            C7913e c7913e = AbstractC18007e.vip;
            InterfaceC12864e premium = smaato.premium(c7913e);
            C14544e c14544e = C5438e.f11668e;
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, c13770e, 48);
            long j2 = c13770e.f27286case;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, premium);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            C3533e c3533e = C3533e.ad;
            float f = 16;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(c3533e.ad(c0115e, 1.0f, true), 0.0f, 0.0f, f, 0.0f, 11);
            C13964e billing = AbstractC16497e.billing(f);
            C9577e c9577e = C5438e.f11672e;
            C4789e ad2 = AbstractC14801e.ad(billing, c9577e, c13770e, 6);
            long j3 = c13770e.f27286case;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, loadAd);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i6, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(8), c14544e, c13770e, 54);
            long j4 = c13770e.f27286case;
            int i7 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert4 = c13770e.advert();
            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert4, c14865e2);
            AbstractC13501e.mopub(i7, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase4, c14865e4);
            InterfaceC12864e ad4 = c3533e.ad(c0115e, 1.0f, true);
            C4789e ad5 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e, 0);
            long j5 = c13770e.f27286case;
            int i8 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC3483e advert5 = c13770e.advert();
            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, ad4);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad5, c14865e);
            AbstractC2270e.yandex(c13770e, advert5, c14865e2);
            AbstractC13501e.mopub(i8, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase5, c14865e4);
            c2892e3.invoke(c13770e, Integer.valueOf((i4 >> 9) & 14));
            c2892e4.invoke(c13770e, Integer.valueOf((i4 >> 12) & 14));
            c13770e.Signature(true);
            c2892e13 = c2892e7;
            c2892e13.invoke(c13770e, Integer.valueOf((i4 >> 21) & 14));
            c2892e8.invoke(c13770e, Integer.valueOf((i4 >> 24) & 14));
            c13770e.Signature(true);
            c2892e10 = c2892e5;
            c2892e10.invoke(c13770e, Integer.valueOf((i4 >> 15) & 14));
            c2892e9 = c2892e6;
            c2892e9.invoke(c13770e, Integer.valueOf((i4 >> 18) & 14));
            c13770e.Signature(true);
            InterfaceC12864e premium2 = c3533e.ad(c0115e, 1.0f, true).premium(c7913e);
            int i9 = ((i4 << 3) & 7168) | 48;
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j6 = c13770e.f27286case;
            int i10 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC3483e advert6 = c13770e.advert();
            InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e, premium2);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, c14865e);
            AbstractC2270e.yandex(c13770e, advert6, c14865e2);
            AbstractC13501e.mopub(i10, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase6, c14865e4);
            c2892e12 = c2892e2;
            c2892e12.invoke(C14486e.ad, c13770e, Integer.valueOf(((i9 >> 6) & 112) | 6));
            c13770e.Signature(true);
            c13770e.Signature(true);
            c2892e11 = c2892e;
            c2892e11.invoke(c13770e, Integer.valueOf((i4 >> 3) & 14));
            c13770e.Signature(true);
        } else {
            c2892e9 = c2892e6;
            c2892e10 = c2892e5;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13776e(interfaceC12864e, c2892e11, c2892e12, c2892e3, c2892e4, c2892e10, c2892e9, c2892e13, c2892e8, i, 1);
        }
    }

    public static List mopub(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public static void purchase(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 >>> i3;
        int i6 = 1 << i3;
        int i7 = i5 - 1;
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) - i3;
        int i8 = i4 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i8];
        int[] iArr5 = new int[i8];
        int[][] iArr6 = new int[i6];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i8);
            int i9 = 0;
            while (i9 < i6) {
                int[] iArr7 = new int[i5 * i8];
                iArr6[i9] = iArr7;
                int i10 = numberOfTrailingZeros;
                int i11 = i9;
                int i12 = 0;
                for (int i13 = 0; i13 < i5; i13 += 2) {
                    System.arraycopy(iArr5, 0, iArr7, i12, i8);
                    int i14 = i12 + i8;
                    ad(iArr5, iArr2, iArr3, iArr4, i4);
                    System.arraycopy(iArr4, 0, iArr7, i14, i8);
                    i12 = i14 + i8;
                    ad(iArr4, iArr2, iArr3, iArr5, i4);
                }
                i9 = i11 + 1;
                numberOfTrailingZeros = i10;
            }
            int i15 = numberOfTrailingZeros;
            int i16 = i2 - 1;
            for (int i17 = 0; i17 < i2; i17++) {
                int i18 = iArr5[i8 - 16] & i16;
                System.arraycopy(iArr6[i18 >>> i15], (i18 & i7) * i8, iArr4, 0, i8);
                for (int i19 = i8 - 1; i19 >= 0; i19--) {
                    iArr4[i19] = iArr4[i19] ^ iArr5[i19];
                }
                ad(iArr4, iArr2, iArr3, iArr5, i4);
            }
            System.arraycopy(iArr5, 0, iArr, i, i8);
            vip(iArr6);
            vip(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            vip(iArr6);
            vip(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    public static final long startapp(KeyEvent keyEvent) {
        return AbstractC16852e.ad(keyEvent.getKeyCode());
    }

    public static void vip(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (iArr2 != null) {
                Arrays.fill(iArr2, 0);
            }
        }
    }

    public static byte[] yandex(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i <= 1 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i2 == 1 && i >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
        int i5 = i2 * 128;
        int i6 = Alert.DURATION_SHOW_INDEFINITELY / (i2 * 1024);
        if (i3 < 1 || i3 > i6) {
            throw new IllegalArgumentException(AbstractC8647e.inmobi(i6, i2, "Parallelisation parameter p must be >= 1 and <= ", " (based on block size r of ", ")"));
        }
        if (i4 < 1) {
            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
        }
        C13899e c13899e = new C13899e(new C7952e());
        c13899e.init(bArr, bArr2, 1);
        byte[] bArr3 = ((C14915e) c13899e.generateDerivedParameters(i3 * i5 * 8)).f29591e;
        int[] iArr = null;
        try {
            int length = bArr3.length >>> 2;
            iArr = new int[length];
            AbstractC3628e.smaato(0, bArr3, iArr);
            int i7 = 0;
            for (int i8 = i * i2; i - i7 > 2 && i8 > 1024; i8 >>>= 1) {
                i7++;
            }
            int i9 = i5 >>> 2;
            for (int i10 = 0; i10 < length; i10 += i9) {
                purchase(i10, i, i7, i2, iArr);
            }
            AbstractC3628e.startapp(bArr3, iArr);
            C13899e c13899e2 = new C13899e(new C7952e());
            c13899e2.init(bArr, bArr3, 1);
            byte[] bArr4 = ((C14915e) c13899e2.generateDerivedParameters(i4 * 8)).f29591e;
            Arrays.fill(bArr3, (byte) 0);
            Arrays.fill(iArr, 0);
            return bArr4;
        } catch (Throwable th) {
            if (bArr3 != null) {
                Arrays.fill(bArr3, (byte) 0);
            }
            if (iArr != null) {
                Arrays.fill(iArr, 0);
            }
            throw th;
        }
    }
}

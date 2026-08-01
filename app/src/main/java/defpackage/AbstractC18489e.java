package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18489e {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.IllegalArgumentException, eؑٛۘ] */
    public static final C0413e ad(int i, String str) {
        StringBuilder applovin = AbstractC8703e.applovin("Expected ", str, ", but found ");
        applovin.append(adcel(i));
        return new IllegalArgumentException(applovin.toString());
    }

    public static final String adcel(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0123456789ABCDEF".charAt((i >> 4) & 15));
        sb.append("0123456789ABCDEF".charAt(i & 15));
        return sb.toString();
    }

    public static final C0763e appmetrica(long j, long j2) {
        return new C0763e(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final C0763e billing(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C0763e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void license(boolean z, Function0 function0, C13770e c13770e, int i) {
        int i2;
        boolean z2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(862348506);
        if ((i & 6) == 0) {
            i2 = i | (c13770e2.billing(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.yandex(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, C0115e.f1276e);
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
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.ota_card_downloading);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 0, 0, 131066);
            c13770e2 = c13770e;
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e2, new C5228e(1.0f, true));
            if (z) {
                c13770e2.m3676strictfp(-1808166933);
                AbstractC0014e.metrica(function0, null, false, null, null, null, AbstractC17419e.ad, c13770e2, ((i3 >> 3) & 14) | 1572864, 62);
                z2 = false;
            } else {
                z2 = false;
                c13770e2.m3676strictfp(-1811491156);
            }
            c13770e2.Signature(z2);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C5230e(z, function0, i, 2);
        }
    }

    public static final void metrica(C0217e c0217e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1461960980);
        int i2 = i | (c13770e2.purchase(c0217e) ? 4 : 2);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) c13770e2.adcel(AbstractC2676e.vip);
            float f = c0217e.metrica;
            long j = c0217e.ad;
            long j2 = c0217e.vip;
            InterfaceC16132e vip = AbstractC16102e.vip(f, null, BuildConfig.FLAVOR, null, c13770e2, 3072, 22);
            boolean appmetrica = c13770e2.appmetrica(j2) | c13770e2.appmetrica(j);
            Object m3681throw = c13770e2.m3681throw();
            if (appmetrica || m3681throw == C2987e.ad) {
                m3681throw = Formatter.formatFileSize(context, j2) + " / " + Formatter.formatFileSize(context, j);
                c13770e2.m3682throws(m3681throw);
            }
            String str = (String) m3681throw;
            float f2 = 8;
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11685e, c13770e2, 6);
            long j3 = c13770e2.f27286case;
            int i3 = (int) (j3 ^ (j3 >>> 32));
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
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_download_cloud_outline_28, 0, c13770e2), null, null, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.admob, c13770e, 56, 4);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f2), C5438e.f11672e, c13770e, 6);
            long j4 = c13770e.f27286case;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
            c13770e2 = c13770e;
            if (j2 == 0 && j == 0 && c0217e.metrica == 0.0f) {
                c13770e2.m3676strictfp(-1719819949);
                AbstractC6574e.license(AbstractC18007e.metrica(c0115e, 1.0f), 0L, 0L, 0, 0.0f, c13770e2, 6, 30);
                c13770e2.Signature(false);
            } else {
                c13770e2.m3676strictfp(-1719684510);
                AbstractC6574e.metrica(((Number) vip.getValue()).floatValue(), 0, 48, 0L, 0L, c13770e2, AbstractC18007e.metrica(c0115e, 1.0f));
                c13770e2.Signature(false);
            }
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(c0217e, i, 29);
        }
    }

    public static final C0763e purchase(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C0763e(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final int startapp(int i, C12431e c12431e) {
        int i2 = c12431e.f24868e - 1;
        int i3 = 0;
        while (i3 < i2) {
            int smaato = AbstractC8703e.smaato(i2, i3, 2, i3);
            Object[] objArr = c12431e.f24870e;
            int i4 = ((C4763e) objArr[smaato]).ad;
            if (i4 != i) {
                if (i4 < i) {
                    i3 = smaato + 1;
                    if (i < ((C4763e) objArr[i3]).ad) {
                    }
                } else {
                    i2 = smaato - 1;
                }
            }
            return smaato;
        }
        return i3;
    }

    public static final void vip(InterfaceC12864e interfaceC12864e, C15036e c15036e, Function1 function1, C13770e c13770e, int i) {
        int i2;
        int i3;
        boolean z;
        c13770e.m3671package(-64133683);
        if (((i | (c13770e.purchase(c15036e) ? 32 : 16) | (c13770e.purchase(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 731) == 146 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            c13770e.m3672private(-492369756);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                i2 = 1;
                i3 = 3;
                m3681throw = C11047e.subscription(0.0f, 14, AbstractC6874e.startapp(new C3618e(AbstractC6532e.license(4294901824L)), new C3618e(AbstractC6532e.license(4294902015L)), new C3618e(AbstractC6532e.license(4286578943L)), new C3618e(AbstractC6532e.license(4278190335L)), new C3618e(AbstractC6532e.license(4278223103L)), new C3618e(AbstractC6532e.license(4278255615L)), new C3618e(AbstractC6532e.license(4278255488L)), new C3618e(AbstractC6532e.license(4278255360L)), new C3618e(AbstractC6532e.license(4286643968L)), new C3618e(AbstractC6532e.license(4294967040L)), new C3618e(AbstractC6532e.license(4294934528L)), new C3618e(AbstractC6532e.license(4294901760L))));
                c13770e.m3682throws(m3681throw);
                z = false;
            } else {
                i2 = 1;
                i3 = 3;
                z = false;
            }
            c13770e.Signature(z);
            AbstractC4457e abstractC4457e = (AbstractC4457e) m3681throw;
            InterfaceC12864e premium = interfaceC12864e.premium(AbstractC18007e.metrica);
            Unit unit = Unit.INSTANCE;
            c13770e.m3672private(1157296644);
            boolean purchase = c13770e.purchase(function1);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == obj) {
                m3681throw2 = new C4301e(function1, null, i3);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.Signature(false);
            InterfaceC12864e vip = AbstractC0845e.vip(premium, unit, (Function2) m3681throw2);
            c13770e.m3672private(511388516);
            boolean purchase2 = c13770e.purchase(abstractC4457e) | c13770e.purchase(c15036e);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase2 || m3681throw3 == obj) {
                m3681throw3 = new C17829e(abstractC4457e, c15036e, i2);
                c13770e.m3682throws(m3681throw3);
            }
            c13770e.Signature(false);
            AbstractC18366e.ad(vip, (Function1) m3681throw3, c13770e, 0);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription == null) {
            return;
        }
        subscription.license = new C10729e(interfaceC12864e, c15036e, function1, i, 1);
    }

    public static final void yandex(C0217e c0217e, boolean z, Function0 function0, C13770e c13770e, int i) {
        c13770e.m3671package(-1024827486);
        int i2 = (c13770e.purchase(c0217e) ? 4 : 2) | i | (c13770e.billing(z) ? 32 : 16) | (c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            float f = 16;
            float ad = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e amazon = AbstractC12220e.amazon(c0115e, f, f, f, ad);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, amazon);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            license(z, function0, c13770e, (i2 >> 3) & 126);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            metrica(c0217e, c13770e, i2 & 14);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15545e(c0217e, z, function0, i, 7);
        }
    }
}

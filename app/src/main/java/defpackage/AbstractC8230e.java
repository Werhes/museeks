package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۜٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8230e {
    public static boolean ad = true;
    public static final float[][] vip = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] metrica = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] license = {95.047f, 100.0f, 108.883f};
    public static final float[][] appmetrica = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static final void ad(boolean z, boolean z2, C2892e c2892e, C13770e c13770e, int i) {
        boolean z3;
        c13770e.m3671package(2068941993);
        int i2 = (c13770e.billing(z) ? 4 : 2) | i | (c13770e.billing(z2) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC12447e.vip(C0115e.f1276e, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.metrica), 48);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, startapp);
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            c2892e.invoke(c13770e, 6);
            if (z2) {
                c13770e.m3676strictfp(1346816568);
                z3 = false;
                AbstractC1599e.ad(z, AbstractC16136e.metrica(AbstractC18007e.metrica, AbstractC6532e.license(2684354560L), AbstractC10432e.ad), 0L, 0, 0.0f, 0.0f, 0.0f, 0.0f, c13770e, (i2 & 14) | 48, 252);
            } else {
                z3 = false;
                c13770e.m3676strictfp(1345659059);
            }
            c13770e.Signature(z3);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9623e(z, z2, c2892e, i);
        }
    }

    public static final void adcel(int i) {
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "An unknown field for index "));
    }

    public static float appmetrica(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void billing(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC6532e.m2193extends(j)), i, i2, 33);
        }
    }

    public static int license(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = license;
        return AbstractC3898e.vip(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static final C13027e metrica(InterfaceC5052e interfaceC5052e, InterfaceC5052e interfaceC5052e2) {
        interfaceC5052e.mo1221e().size();
        interfaceC5052e2.mo1221e().size();
        List mo1221e = interfaceC5052e.mo1221e();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo1221e, 10));
        Iterator it = mo1221e.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC16046e) it.next()).mo1459goto());
        }
        List mo1221e2 = interfaceC5052e2.mo1221e();
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(mo1221e2, 10));
        Iterator it2 = mo1221e2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C7878e(((InterfaceC16046e) it2.next()).mo1458e()));
        }
        return new C13027e(1, AbstractC10064e.mopub(AbstractC13480e.m3579e(arrayList2, arrayList)));
    }

    public static float mopub() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final float purchase(long j, float f, InterfaceC14388e interfaceC14388e) {
        float metrica2;
        long vip2 = C12973e.vip(j);
        if (C4616e.ad(vip2, 4294967296L)) {
            if (interfaceC14388e.mo499package() <= 1.05d) {
                return interfaceC14388e.mo495e(j);
            }
            metrica2 = C12973e.metrica(j) / C12973e.metrica(interfaceC14388e.mo492default(f));
        } else {
            if (!C4616e.ad(vip2, 8589934592L)) {
                return Float.NaN;
            }
            metrica2 = C12973e.metrica(j);
        }
        return metrica2 * f;
    }

    public static final void startapp(Spannable spannable, C4622e c4622e, int i, int i2) {
        LocaleSpan localeSpan;
        if (c4622e != null) {
            List list = c4622e.f9951e;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c4622e, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0768e) it.next()).ad);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = AbstractC6418e.appmetrica(AbstractC6418e.license((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? AbstractC16870e.ad.appmetrica().appmetrica() : c4622e.appmetrica()).ad);
            }
            spannable.setSpan(localeSpan, i, i2, 33);
        }
    }

    public static final void vip(int i, int i2, C13770e c13770e, boolean z, boolean z2) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1684538607);
        int i3 = (c13770e.billing(z) ? 4 : 2) | i2 | (c13770e2.billing(z2) ? 32 : 16) | (c13770e2.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C0115e c0115e = C0115e.f1276e;
            if (z2) {
                c13770e2.m3676strictfp(1692085941);
                AbstractC1599e.ad(z, AbstractC18007e.startapp(c0115e, 32), ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.ad, 0, 0.0f, 0.0f, 0.0f, 0.0f, c13770e2, (i3 & 14) | 48, 248);
                c13770e2.Signature(false);
            } else {
                c13770e2.m3676strictfp(1692283039);
                String valueOf = String.valueOf(i);
                C15492e c15492e = AbstractC11785e.ad;
                AbstractC14489e.vip(valueOf, AbstractC18007e.smaato(c0115e, 32), ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.smaato, c13770e, 48, 0, 130040);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
            }
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C3196e(z, z2, i, i2);
        }
    }

    public static final void yandex(Spannable spannable, long j, InterfaceC14388e interfaceC14388e, int i, int i2) {
        long vip2 = C12973e.vip(j);
        if (C4616e.ad(vip2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC1561e.appmetrica(interfaceC14388e.mo495e(j)), false), i, i2, 33);
        } else if (C4616e.ad(vip2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C12973e.metrica(j)), i, i2, 33);
        }
    }
}

package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۡۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17331e {
    public static final C2892e ad = new C2892e(1090591276, false, new C14498e(28));
    public static final C2892e vip = new C2892e(-1754417899, false, new C14498e(29));

    public static final void ad(int i, int i2, Function0 function0, Function1 function1, Function0 function02, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i3) {
        int i4;
        Function0 function03;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(243997362);
        if ((i3 & 6) == 0) {
            i4 = (c13770e2.license(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c13770e2.license(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            function03 = function0;
            i4 |= c13770e2.yandex(function03) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            function03 = function0;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c13770e2.yandex(function1) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c13770e2.yandex(function02) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c13770e2.purchase(interfaceC12864e) ? 131072 : 65536;
        }
        if (c13770e2.m3673protected(i4 & 1, (74899 & i4) != 74898)) {
            boolean z = (i4 & 14) == 4;
            Object m3681throw = c13770e2.m3681throw();
            Object obj = C2987e.ad;
            if (z || m3681throw == obj) {
                m3681throw = new C2616e(i);
                c13770e2.m3682throws(m3681throw);
            }
            C2616e c2616e = (C2616e) m3681throw;
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            Function0 function04 = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(function04);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i5), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            AbstractC0014e.metrica(function03, null, false, null, null, null, AbstractC8636e.ad, c13770e2, ((i4 >> 6) & 14) | 1572864, 62);
            float purchase2 = c2616e.purchase();
            C3721e c3721e = new C3721e(0.0f, i2);
            int i6 = i2 - 1;
            AbstractC4455e abstractC4455e = AbstractC0608e.ad;
            long j2 = ((C3618e) c13770e2.adcel(abstractC4455e)).ad;
            long j3 = ((C3618e) c13770e2.adcel(abstractC4455e)).ad;
            long j4 = ((C0896e) c13770e2.adcel(AbstractC3577e.ad)).metrica;
            long j5 = C3618e.startapp;
            C14607e purchase3 = AbstractC11750e.purchase(j2, j3, j4, j5, j5, c13770e, 14155776, 818);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            C5228e c5228e = new C5228e(1.0f, true);
            boolean purchase4 = c13770e.purchase(c2616e);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase4 || m3681throw2 == obj) {
                m3681throw2 = new C4976e(c2616e, 5);
                c13770e.m3682throws(m3681throw2);
            }
            Function1 function12 = (Function1) m3681throw2;
            boolean purchase5 = ((i4 & 7168) == 2048) | c13770e.purchase(c2616e);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase5 || m3681throw3 == obj) {
                m3681throw3 = new C1708e(function1, c2616e, 18);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC8741e.vip(purchase2, function12, c5228e, false, c3721e, i6, (Function0) m3681throw3, null, purchase3, c13770e, 0, 136);
            c13770e2 = c13770e;
            AbstractC0014e.metrica(function02, null, false, null, null, null, AbstractC8636e.vip, c13770e2, ((i4 >> 12) & 14) | 1572864, 62);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C5936e(i, i2, function0, function1, function02, interfaceC12864e, i3);
        }
    }

    public static boolean appmetrica() {
        if (!AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) && !AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) {
            return false;
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.ad;
        String str = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (!linkedHashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) linkedHashMap.get(str.toUpperCase(locale));
        if (range != null) {
            return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }

    public static final Paint license(C11447e c11447e) {
        if (!(c11447e instanceof C11447e)) {
            AbstractC18019e.ad("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + AbstractC3820e.ad.vip(c11447e.getClass()).license());
        }
        return c11447e.ad;
    }

    public static long metrica(long j) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        if (j < 0) {
            return -metrica(-j);
        }
        return timeUnit2.convert((timeUnit.convert(1L, timeUnit2) / 2) + timeUnit.convert(j, timeUnit), timeUnit);
    }

    public static final C11447e vip() {
        return new C11447e(new Paint(7));
    }
}

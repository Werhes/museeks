package defpackage;

import android.os.Build;
import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9464e {
    public static int metrica = 3;
    public static final C7936e ad = new C7936e(9);
    public static final Object vip = new Object();

    public static boolean Signature(int i, String str) {
        return metrica <= i || Log.isLoggable(str, i);
    }

    public static final void ad(Function1 function1, InterfaceC12864e interfaceC12864e, Function1 function12, C13770e c13770e, int i) {
        C5430e c5430e = C5430e.f11641e;
        c13770e.m3671package(-1783766393);
        int i2 = (c13770e.yandex(function12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            vip(function1, interfaceC12864e, c5430e, function12, c13770e, 3126 | ((i2 << 6) & 57344), 4);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6477e(function1, interfaceC12864e, function12, i, 1);
        }
    }

    public static void adcel(String str, String str2) {
        String subscription = subscription(str);
        if (Signature(6, subscription)) {
            Log.e(subscription, str2);
        }
    }

    public static boolean admob() {
        return Signature(5, subscription("CXCP"));
    }

    public static void advert(String str, String str2) {
        String subscription = subscription(str);
        if (Signature(4, subscription)) {
            Log.i(subscription, str2);
        }
    }

    public static boolean amazon() {
        return Signature(6, subscription("CXCP"));
    }

    public static final C9820e appmetrica(C13915e c13915e) {
        C9820e c9820e = c13915e.f27596e;
        if (c9820e != null) {
            return c9820e;
        }
        throw AbstractC8703e.Signature("Required value was null.");
    }

    public static C7495e billing() {
        return new C7495e(0);
    }

    public static final void license(C15533e c15533e, InterfaceC12864e interfaceC12864e, Function2 function2, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-511989831);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c15533e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            C14725e billing = AbstractC5546e.billing(c13770e);
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC3483e advert = c13770e.advert();
            C7309e c7309e = C7309e.f14951e;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, c15533e, c15533e.metrica);
            AbstractC2270e.yandex(c13770e, billing, c15533e.license);
            AbstractC2270e.yandex(c13770e, function2, c15533e.appmetrica);
            InterfaceC5685e.mopub.getClass();
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            c13770e.Signature(true);
            if (c13770e.ads()) {
                c13770e.m3676strictfp(-1259187287);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1259245908);
                boolean yandex = c13770e.yandex(c15533e);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == C2987e.ad) {
                    m3681throw = new C17073e(17, c15533e);
                    c13770e.m3682throws(m3681throw);
                }
                AbstractC17680e.purchase((Function0) m3681throw, c13770e);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7487e(c15533e, interfaceC12864e, function2, i);
        }
    }

    public static boolean loadAd() {
        return Signature(4, subscription("CXCP"));
    }

    public static final void metrica(InterfaceC12864e interfaceC12864e, Function2 function2, C13770e c13770e, int i, int i2) {
        int i3;
        c13770e.m3671package(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.yandex(function2) ? 32 : 16;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C15533e(C4590e.f9889e);
                c13770e.m3682throws(m3681throw);
            }
            license((C15533e) m3681throw, interfaceC12864e, function2, c13770e, (i3 << 3) & 1008);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17051e(interfaceC12864e, function2, i, i2);
        }
    }

    public static void mopub(String str, String str2, Throwable th) {
        String subscription = subscription(str);
        if (Signature(6, subscription)) {
            Log.e(subscription, str2, th);
        }
    }

    public static void pro(String str, String str2, Throwable th) {
        String subscription = subscription(str);
        if (Signature(5, subscription)) {
            Log.w(subscription, str2, th);
        }
    }

    public static final boolean purchase(C0763e c0763e, float f, float f2) {
        float f3 = c0763e.ad;
        if (f > c0763e.metrica || f3 > f) {
            return false;
        }
        return f2 <= c0763e.license && c0763e.vip <= f2;
    }

    public static void remoteconfig(String str, String str2) {
        String subscription = subscription(str);
        if (Signature(5, subscription)) {
            Log.w(subscription, str2);
        }
    }

    public static boolean smaato(String str) {
        return Signature(3, subscription(str));
    }

    public static void startapp(String str, String str2, Throwable th) {
        String subscription = subscription(str);
        if (Signature(3, subscription)) {
            Log.d(subscription, str2, th);
        }
    }

    public static String subscription(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(kotlin.jvm.functions.Function1 r22, defpackage.InterfaceC12864e r23, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function1 r25, defpackage.C13770e r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9464e.vip(kotlin.jvm.functions.Function1, eّۤۧ, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, eٓؕۥ, int, int):void");
    }

    public static void yandex(String str, String str2) {
        String subscription = subscription(str);
        if (Signature(3, subscription)) {
            Log.d(subscription, str2);
        }
    }
}

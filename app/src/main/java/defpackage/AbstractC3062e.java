package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.ExtractedText;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3062e {
    public static final C10068e ad = new C10068e(0);

    public static final ExtractedText Signature(C0398e c0398e) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0398e.ad.f20850e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c0398e.vip;
        extractedText.selectionStart = C12347e.billing(j);
        extractedText.selectionEnd = C12347e.purchase(j);
        extractedText.flags = !AbstractC5304e.isPro(c0398e.ad.f20850e, '\n') ? 1 : 0;
        return extractedText;
    }

    public static double ad(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final Object adcel(C8221e c8221e, String str, AbstractC10731e abstractC10731e) {
        C5577e c5577e = new C5577e("ecosystem.sendOtpPush", C17354e.f34046e);
        c5577e.ad("sid", str);
        c5577e.ad("flow_type", "tg_flow");
        c5577e.ad("sak_version", "1.142");
        return c8221e.license(c5577e, abstractC10731e);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٖؑۡ, eُۙۨ] */
    public static C15926e admob(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C11241e(i, i2 - 1, 1);
        }
        C15926e c15926e = C15926e.f31384e;
        return C15926e.f31384e;
    }

    public static ExecutorC3044e advert() {
        if (ExecutorC3044e.f7106e != null) {
            return ExecutorC3044e.f7106e;
        }
        synchronized (ExecutorC3044e.class) {
            try {
                if (ExecutorC3044e.f7106e == null) {
                    ExecutorC3044e.f7106e = new ExecutorC3044e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC3044e.f7106e;
    }

    public static ScheduledExecutorServiceC5380e amazon() {
        if (AbstractC10075e.ad != null) {
            return AbstractC10075e.ad;
        }
        synchronized (AbstractC10075e.class) {
            try {
                if (AbstractC10075e.ad == null) {
                    AbstractC10075e.ad = new ScheduledExecutorServiceC5380e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return AbstractC10075e.ad;
    }

    public static long appmetrica(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(AbstractC10257e.mopub(AbstractC1786e.inmobi(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
    }

    public static ExecutorC0082e billing() {
        if (ExecutorC0082e.f1249e != null) {
            return ExecutorC0082e.f1249e;
        }
        synchronized (ExecutorC0082e.class) {
            try {
                if (ExecutorC0082e.f1249e == null) {
                    ExecutorC0082e.f1249e = new ExecutorC0082e(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC0082e.f1249e;
    }

    public static int license(int i, C15926e c15926e) {
        int i2 = c15926e.f22522e;
        int i3 = c15926e.f22523e;
        if (!c15926e.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c15926e + '.');
    }

    public static C11241e loadAd(int i, C15926e c15926e) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i2 = c15926e.f22523e;
        int i3 = c15926e.f22522e;
        if (c15926e.f22521e <= 0) {
            i = -i;
        }
        return new C11241e(i2, i3, i);
    }

    public static int metrica(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final Object mopub(C8221e c8221e, String str, AbstractC10731e abstractC10731e) {
        C5577e c5577e = new C5577e("ecosystem.sendOtpSms", C9616e.f19069e);
        c5577e.ad("sid", str);
        c5577e.ad("flow_type", "tg_flow");
        c5577e.ad("sak_version", "1.142");
        return c8221e.license(c5577e, abstractC10731e);
    }

    public static Comparable purchase(Comparable comparable, C3721e c3721e) {
        float f = c3721e.vip;
        float f2 = c3721e.ad;
        if (!c3721e.metrica()) {
            return (!c3721e.license(comparable, Float.valueOf(f2)) || c3721e.license(Float.valueOf(f2), comparable)) ? (!c3721e.license(Float.valueOf(f), comparable) || c3721e.license(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f) : Float.valueOf(f2);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c3721e + '.');
    }

    public static ExecutorC14432e smaato() {
        if (ExecutorC14432e.f28533e != null) {
            return ExecutorC14432e.f28533e;
        }
        synchronized (ExecutorC14432e.class) {
            try {
                if (ExecutorC14432e.f28533e == null) {
                    ExecutorC14432e.f28533e = new ExecutorC14432e(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC14432e.f28533e;
    }

    public static final Object startapp(C8221e c8221e, String str, AbstractC10731e abstractC10731e) {
        C5577e c5577e = new C5577e("ecosystem.sendOtpEmail", C4524e.f9799e);
        c5577e.ad("sid", str);
        c5577e.ad("flow_type", "tg_flow");
        c5577e.ad("sak_version", "1.142");
        return c8221e.license(c5577e, abstractC10731e);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؙٔۡ, eؚٚٔ] */
    public static C7266e subscription(long j) {
        return j <= Long.MIN_VALUE ? C7266e.f14867e : new AbstractC14565e(0, j - 1);
    }

    public static float vip(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final Object yandex(C8221e c8221e, String str, AbstractC10731e abstractC10731e) {
        C5577e c5577e = new C5577e("ecosystem.sendOtpCallReset", C11047e.f21911e);
        c5577e.ad("sid", str);
        c5577e.ad("flow_type", "tg_flow");
        c5577e.ad("sak_version", "1.142");
        return c8221e.license(c5577e, abstractC10731e);
    }
}

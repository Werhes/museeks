package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12246e {
    public static Method appmetrica;
    public static Method billing;
    public static Method license;
    public static long metrica;
    public static Method purchase;
    public static final C2892e ad = new C2892e(-1913223407, false, new C9012e(6));
    public static final C2892e vip = new C2892e(804128533, false, new C9012e(7));

    public static final long ad(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static int appmetrica(AbstractC0362e abstractC0362e) {
        BigInteger bigInteger = abstractC0362e.license;
        return bigInteger == null ? abstractC0362e.advert() + 1 : bigInteger.bitLength();
    }

    public static final boolean billing() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC14204e.subs();
        }
        try {
            if (license == null) {
                metrica = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                license = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = license;
            if (method != null) {
                return ((Boolean) method.invoke(null, Long.valueOf(metrica))).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            purchase("isTagEnabled", e);
            return false;
        }
    }

    public static final void license(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC14204e.Signature(i, startapp(str));
            return;
        }
        String startapp = startapp(str);
        try {
            if (purchase == null) {
                purchase = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = purchase;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(metrica), startapp, Integer.valueOf(i));
        } catch (Exception e) {
            purchase("asyncTraceEnd", e);
        }
    }

    public static final AbstractC3424e metrica(AbstractC3424e abstractC3424e) {
        AbstractC3424e metrica2 = abstractC3424e.metrica();
        int vip2 = metrica2.vip();
        for (int i = 0; i < vip2; i++) {
            metrica2.appmetrica(i, abstractC3424e.ad(i));
        }
        return metrica2;
    }

    public static void purchase(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw cause;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static String startapp(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }

    public static final void vip(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC14204e.license(startapp(str));
            return;
        }
        String startapp = startapp(str);
        try {
            if (appmetrica == null) {
                appmetrica = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = appmetrica;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(metrica), startapp, 0);
        } catch (Exception e) {
            purchase("asyncTraceBegin", e);
        }
    }

    public static final long yandex(long j, long j2, float f) {
        float startapp = AbstractC15842e.startapp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float startapp2 = AbstractC15842e.startapp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (Float.floatToRawIntBits(startapp) << 32) | (Float.floatToRawIntBits(startapp2) & 4294967295L);
    }
}

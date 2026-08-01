package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9528e {
    public static final C2892e ad = new C2892e(-1748220621, false, new C15480e(27));
    public static final C2892e vip = new C2892e(-149071563, false, new C15480e(28));
    public static final C2892e metrica = new C2892e(1732016058, false, new C11789e(15));
    public static final C2892e license = new C2892e(-265210070, false, new C11789e(16));
    public static final C2892e appmetrica = new C2892e(535338081, false, new C11789e(17));
    public static final C2892e purchase = new C2892e(-485226286, false, new C11789e(18));
    public static final C2892e billing = new C2892e(611823986, false, new C11789e(19));
    public static final C2892e yandex = new C2892e(426734820, false, new C11789e(20));
    public static final C2892e startapp = new C2892e(1500308251, false, new C11789e(21));
    public static final C2892e adcel = new C2892e(-359142444, false, new C15480e(29));

    public static final long ad(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void adcel(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void advert(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static Object amazon(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC14380e.loadAd(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C13381e.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static void appmetrica() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static void billing(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void license(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            AbstractC13501e.Signature(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void metrica(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void mopub(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void purchase(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static final String smaato(InterfaceC5021e interfaceC5021e) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + interfaceC5021e);
        sb.append('\n');
        sb.append("hashCode: " + interfaceC5021e.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + interfaceC5021e.getClass().getCanonicalName());
        sb.append('\n');
        for (InterfaceC15498e advert = interfaceC5021e.advert(); advert != null; advert = advert.mo1351switch()) {
            sb.append("fqName: " + C8746e.metrica.tapsense(advert));
            sb.append('\n');
            sb.append("javaClass: " + advert.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void startapp(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void vip(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void yandex(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }
}

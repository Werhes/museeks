package defpackage;

import android.graphics.Shader;
import android.os.Build;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12110e {
    public static final C2892e ad = new C2892e(-2034081849, false, new C10417e(8));
    public static final C2892e vip = new C2892e(1493565113, false, new C7156e(28));
    public static final C2892e metrica = new C2892e(2122645538, false, new C7156e(29));
    public static final C2892e license = new C2892e(-1018142321, false, new C10417e(14));
    public static final C2892e appmetrica = new C2892e(1775152123, false, new C10417e(15));
    public static final C2892e purchase = new C2892e(-626299271, false, new C7156e(23));
    public static final C2892e billing = new C2892e(-1996232038, false, new C7156e(24));
    public static final C2892e yandex = new C2892e(-622147005, false, new C7156e(25));
    public static final C2892e startapp = new C2892e(1452405000, false, new C7156e(26));
    public static final C2892e adcel = new C2892e(-662175963, false, new C7156e(27));
    public static final C2892e mopub = new C2892e(-57308887, false, new C10417e(9));
    public static final C2892e advert = new C2892e(-1749190078, false, new C10417e(10));
    public static final C2892e smaato = new C2892e(1565861254, false, new C10417e(11));
    public static final C2892e amazon = new C2892e(1082466628, false, new C10417e(12));
    public static final C2892e loadAd = new C2892e(290185458, false, new C10417e(13));

    public static void ad(AbstractC11062e abstractC11062e, C10675e c10675e) {
        if (abstractC11062e.isVip(c10675e)) {
            return;
        }
        try {
            abstractC11062e.mo1914break(c10675e, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void appmetrica(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof C17013e) {
            appmetrica(((C17013e) charSequence).f33322e, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static final Shader.TileMode license(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3 && Build.VERSION.SDK_INT >= 31) {
            return AbstractC16048e.loadAd();
        }
        return Shader.TileMode.CLAMP;
    }

    public static void metrica(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void vip(AbstractC11062e abstractC11062e, C10675e c10675e) {
        try {
            IOException iOException = null;
            for (C10675e c10675e2 : abstractC11062e.inmobi(c10675e)) {
                try {
                    if (abstractC11062e.crashlytics(c10675e2).vip) {
                        vip(abstractC11062e, c10675e2);
                    }
                    abstractC11062e.loadAd(c10675e2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}

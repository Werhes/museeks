package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3873e {
    public static final String ad;
    public static final String appmetrica;
    public static final String license;
    public static final String metrica;
    public static final String vip;

    static {
        String str = AbstractC9413e.ad;
        ad = Integer.toString(0, 36);
        vip = Integer.toString(1, 36);
        metrica = Integer.toString(2, 36);
        license = Integer.toString(3, 36);
        appmetrica = Integer.toString(4, 36);
    }

    public static Bundle ad(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(ad, spanned.getSpanStart(obj));
        bundle2.putInt(vip, spanned.getSpanEnd(obj));
        bundle2.putInt(metrica, spanned.getSpanFlags(obj));
        bundle2.putInt(license, i);
        if (bundle != null) {
            bundle2.putBundle(appmetrica, bundle);
        }
        return bundle2;
    }
}

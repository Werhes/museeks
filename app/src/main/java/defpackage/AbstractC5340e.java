package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؐۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5340e {
    public static final String ad;

    static {
        String str = AbstractC9413e.ad;
        ad = Integer.toString(0, 36);
    }

    public static AbstractC5340e ad(Bundle bundle) {
        String str = ad;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = C11326e.license;
            AbstractC2301e.billing(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(C11326e.license, false) ? new C11326e(bundle.getBoolean(C11326e.appmetrica, false)) : new C11326e();
        }
        if (i == 1) {
            String str3 = C13998e.metrica;
            AbstractC2301e.billing(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(C13998e.metrica, -1.0f);
            return f == -1.0f ? new C13998e() : new C13998e(f);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unknown RatingType: "));
            }
            String str4 = C3929e.license;
            AbstractC2301e.billing(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(C3929e.license, false) ? new C3929e(bundle.getBoolean(C3929e.appmetrica, false)) : new C3929e();
        }
        String str5 = C10458e.license;
        AbstractC2301e.billing(bundle.getInt(str, -1) == 2);
        int i2 = bundle.getInt(C10458e.license, 5);
        float f2 = bundle.getFloat(C10458e.appmetrica, -1.0f);
        return f2 == -1.0f ? new C10458e(i2) : new C10458e(i2, f2);
    }

    public abstract Bundle metrica();

    public abstract boolean vip();
}

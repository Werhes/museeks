package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12711e {
    public static final /* synthetic */ int ad = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC5096e.purchase(30);
        }
        if (i >= 30) {
            AbstractC5096e.purchase(31);
        }
        if (i >= 30) {
            AbstractC5096e.purchase(33);
        }
        if (i >= 30) {
            AbstractC5096e.purchase(1000000);
        }
    }

    public static final boolean ad() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i >= 30) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                Integer num = str.toUpperCase(locale).equals("BAKLAVA") ? r1 : null;
                r1 = "S".toUpperCase(locale).equals("BAKLAVA") ? 0 : null;
                if (num == null || r1 == null) {
                    if (num == null && r1 == null) {
                        if (str.toUpperCase(locale).compareTo("S".toUpperCase(locale)) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= r1.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}

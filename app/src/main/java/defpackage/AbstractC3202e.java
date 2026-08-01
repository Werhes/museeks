package defpackage;

import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3202e {
    public static final List ad = Collections.singletonList(BuildConfig.FLAVOR);

    public static final int ad(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt == '[') {
                    z = true;
                } else if (charAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void metrica(defpackage.C11787e r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3202e.metrica(eِٜٗ, java.lang.String):void");
    }

    public static final void vip(C11787e c11787e, String str) {
        if (AbstractC5304e.m1866native(str)) {
            return;
        }
        try {
            metrica(c11787e, str);
        } catch (Throwable th) {
            throw new C9442e(11, "Fail to parse url: ".concat(str), th);
        }
    }
}

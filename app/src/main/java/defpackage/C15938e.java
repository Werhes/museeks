package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15938e {
    public C6165e ad;

    public C15938e(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.ad = new C6165e(str, i, i2);
            return;
        }
        C6165e c6165e = new C6165e(str, i, i2);
        AbstractC13019e.appmetrica(i, i2, str);
        this.ad = c6165e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15938e) {
            return this.ad.equals(((C15938e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}

package defpackage;

import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3402e {
    public final int ad;
    public final int vip;

    public C3402e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3402e.class == obj.getClass()) {
            C3402e c3402e = (C3402e) obj;
            int i = c3402e.ad;
            Set set = C9240e.f18442e;
            if (this.ad == i) {
                int i2 = c3402e.vip;
                Set set2 = C14731e.f29144e;
                if (this.vip == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = C9240e.f18442e;
        int i = this.ad * 31;
        Set set2 = C14731e.f29144e;
        return i + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(");
        Set set = C9240e.f18442e;
        String str = BuildConfig.FLAVOR;
        int i = this.ad;
        sb.append((Object) "WindowWidthSizeClass.".concat(i == 0 ? "Compact" : i == 1 ? "Medium" : i == 2 ? "Expanded" : BuildConfig.FLAVOR));
        sb.append(", ");
        Set set2 = C14731e.f29144e;
        int i2 = this.vip;
        if (i2 == 0) {
            str = "Compact";
        } else if (i2 == 1) {
            str = "Medium";
        } else if (i2 == 2) {
            str = "Expanded";
        }
        sb.append((Object) "WindowHeightSizeClass.".concat(str));
        sb.append(')');
        return sb.toString();
    }
}

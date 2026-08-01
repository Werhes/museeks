package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13178e {
    public final C7278e ad;
    public final C7278e vip;

    public C13178e(C7278e c7278e, C7278e c7278e2) {
        this.ad = c7278e;
        this.vip = c7278e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13178e.class == obj.getClass()) {
            C13178e c13178e = (C13178e) obj;
            if (this.ad.equals(c13178e.ad) && this.vip.equals(c13178e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C7278e c7278e = this.ad;
        sb.append(c7278e);
        C7278e c7278e2 = this.vip;
        if (c7278e.equals(c7278e2)) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", " + c7278e2;
        }
        return AbstractC1786e.signatures(sb, str, "]");
    }
}

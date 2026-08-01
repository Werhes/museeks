package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٝۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8838e {
    public final Uri ad;
    public final boolean vip;

    public C8838e(boolean z, Uri uri) {
        this.ad = uri;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8838e.class == obj.getClass()) {
            C8838e c8838e = (C8838e) obj;
            if (this.vip == c8838e.vip && this.ad.equals(c8838e.ad)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + (this.vip ? 1 : 0);
    }
}

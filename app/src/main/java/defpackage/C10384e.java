package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10384e {
    public static final String vip;
    public final Uri ad;

    static {
        String str = AbstractC9413e.ad;
        vip = Integer.toString(0, 36);
    }

    public C10384e(C7850e c7850e) {
        this.ad = (Uri) c7850e.f15896e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10384e) && this.ad.equals(((C10384e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() * 31;
    }
}

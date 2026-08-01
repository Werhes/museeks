package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4438e {
    public final String ad;
    public final C5564e vip;

    public C4438e(String str, C5564e c5564e) {
        this.ad = str;
        this.vip = c5564e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4438e.class == obj.getClass()) {
            C4438e c4438e = (C4438e) obj;
            if (Objects.equals(this.ad, c4438e.ad) && Objects.equals(this.vip, c4438e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip);
    }

    public final String toString() {
        return "MapInfo{uri='" + this.ad + "', byteRange='" + this.vip + "'}";
    }
}

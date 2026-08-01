package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٞٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4258e {
    public final long ad;
    public final long vip;

    public C4258e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4258e)) {
            return false;
        }
        C4258e c4258e = (C4258e) obj;
        return this.ad == c4258e.ad && this.vip == c4258e.vip;
    }

    public final int hashCode() {
        return (((int) this.ad) * 31) + ((int) this.vip);
    }
}

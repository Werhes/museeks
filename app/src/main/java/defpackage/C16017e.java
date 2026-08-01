package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16017e {
    public final long ad;
    public final C17307e vip;

    public C16017e(long j, C17307e c17307e) {
        this.ad = j;
        this.vip = c17307e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16017e)) {
            return false;
        }
        C16017e c16017e = (C16017e) obj;
        return C2152e.vip(this.ad, c16017e.ad) && AbstractC7890e.billing(this.vip, c16017e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (C2152e.billing(this.ad) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + ((Object) C2152e.mopub(this.ad)) + ", r=" + this.vip + ')';
    }
}

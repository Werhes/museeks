package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٝۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6534e {
    public final C7558e ad;
    public long vip;

    public C6534e(C7558e c7558e, long j) {
        this.ad = c7558e;
        this.vip = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6534e)) {
            return false;
        }
        C6534e c6534e = (C6534e) obj;
        return this.ad.equals(c6534e.ad) && C12729e.vip(this.vip, c6534e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        return "AnimData(anim=" + this.ad + ", startSize=" + ((Object) C12729e.metrica(this.vip)) + ')';
    }
}

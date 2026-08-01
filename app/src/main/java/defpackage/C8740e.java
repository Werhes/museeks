package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8740e {
    public final C1962e ad;
    public final long metrica;
    public final long vip;

    public C8740e(C1962e c1962e, long j, long j2) {
        this.ad = c1962e;
        this.vip = j;
        this.metrica = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8740e)) {
            return false;
        }
        C8740e c8740e = (C8740e) obj;
        return this.vip == c8740e.vip && this.ad.equals(c8740e.ad) && this.metrica == c8740e.metrica;
    }

    public final int hashCode() {
        long j = this.vip;
        int hashCode = (this.ad.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.metrica;
        return hashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}

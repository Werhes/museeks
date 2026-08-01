package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18208e {
    public final Object ad;
    public final int appmetrica;
    public final long license;
    public final int metrica;
    public final int vip;

    public C18208e(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C18208e(Object obj) {
        this(-1L, obj);
    }

    public C18208e(Object obj, int i, int i2, long j, int i3) {
        this.ad = obj;
        this.vip = i;
        this.metrica = i2;
        this.license = j;
        this.appmetrica = i3;
    }

    public C18208e(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public final C18208e ad(Object obj) {
        if (this.ad.equals(obj)) {
            return this;
        }
        return new C18208e(obj, this.vip, this.metrica, this.license, this.appmetrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18208e)) {
            return false;
        }
        C18208e c18208e = (C18208e) obj;
        return this.ad.equals(c18208e.ad) && this.vip == c18208e.vip && this.metrica == c18208e.metrica && this.license == c18208e.license && this.appmetrica == c18208e.appmetrica;
    }

    public final int hashCode() {
        return ((((((((this.ad.hashCode() + 527) * 31) + this.vip) * 31) + this.metrica) * 31) + ((int) this.license)) * 31) + this.appmetrica;
    }

    public final boolean vip() {
        return this.vip != -1;
    }
}

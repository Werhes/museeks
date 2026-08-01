package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12591e {
    public final int ad;
    public final C14720e appmetrica;
    public final C9171e license;
    public final long metrica;
    public final Object purchase;
    public final long vip;

    public C12591e(int i, long j, long j2, C9171e c9171e, C14720e c14720e, Object obj) {
        this.ad = i;
        this.vip = j;
        this.metrica = j2;
        this.license = c9171e;
        this.appmetrica = c14720e;
        this.purchase = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12591e)) {
            return false;
        }
        C12591e c12591e = (C12591e) obj;
        return this.ad == c12591e.ad && this.vip == c12591e.vip && this.metrica == c12591e.metrica && AbstractC7890e.billing(this.license, c12591e.license) && AbstractC7890e.billing(this.appmetrica, c12591e.appmetrica) && AbstractC7890e.billing(this.purchase, c12591e.purchase);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.metrica;
        int hashCode = (this.license.ad.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        C14720e c14720e = this.appmetrica;
        int hashCode2 = (hashCode + (c14720e == null ? 0 : c14720e.f29131e.hashCode())) * 31;
        Object obj = this.purchase;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.ad + ", requestMillis=" + this.vip + ", responseMillis=" + this.metrica + ", headers=" + this.license + ", body=" + this.appmetrica + ", delegate=" + this.purchase + ")";
    }
}

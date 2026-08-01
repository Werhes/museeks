package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4864e {
    public final C6342e ad;
    public final int appmetrica;
    public final float billing;
    public final int license;
    public final int metrica;
    public final float purchase;
    public final int vip;

    public C4864e(C6342e c6342e, int i, int i2, int i3, int i4, float f, float f2) {
        this.ad = c6342e;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = f;
        this.billing = f2;
    }

    public final C0763e ad(C0763e c0763e) {
        return c0763e.amazon((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.purchase) & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4864e)) {
            return false;
        }
        C4864e c4864e = (C4864e) obj;
        return this.ad.equals(c4864e.ad) && this.vip == c4864e.vip && this.metrica == c4864e.metrica && this.license == c4864e.license && this.appmetrica == c4864e.appmetrica && Float.compare(this.purchase, c4864e.purchase) == 0 && Float.compare(this.billing, c4864e.billing) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.billing) + AbstractC1414e.license(((((((((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica) * 31) + this.license) * 31) + this.appmetrica) * 31, this.purchase, 31);
    }

    public final int license(int i) {
        int i2 = this.metrica;
        int i3 = this.vip;
        return AbstractC3062e.metrica(i, i3, i2) - i3;
    }

    public final C0763e metrica(C0763e c0763e) {
        float f = -this.purchase;
        return c0763e.amazon((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.ad);
        sb.append(", startIndex=");
        sb.append(this.vip);
        sb.append(", endIndex=");
        sb.append(this.metrica);
        sb.append(", startLineIndex=");
        sb.append(this.license);
        sb.append(", endLineIndex=");
        sb.append(this.appmetrica);
        sb.append(", top=");
        sb.append(this.purchase);
        sb.append(", bottom=");
        return AbstractC17861e.remoteconfig(sb, this.billing, ')');
    }

    public final long vip(long j, boolean z) {
        if (z) {
            long j2 = C12347e.vip;
            if (C12347e.metrica(j, j2)) {
                return j2;
            }
        }
        int i = C12347e.metrica;
        int i2 = (int) (j >> 32);
        int i3 = this.vip;
        return AbstractC9262e.metrica(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }
}

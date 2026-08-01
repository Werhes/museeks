package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٝۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18250e {
    public final int ad;
    public final C5389e license;
    public final int metrica;
    public final long vip;

    public C18250e(int i, long j, int i2, C5389e c5389e) {
        this.ad = i;
        this.vip = j;
        this.metrica = i2;
        this.license = c5389e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18250e)) {
            return false;
        }
        C18250e c18250e = (C18250e) obj;
        return this.ad == c18250e.ad && this.vip == c18250e.vip && this.metrica == c18250e.metrica && AbstractC7890e.billing(this.license, c18250e.license);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        int mopub = AbstractC1786e.mopub(this.metrica, (i + ((int) (j ^ (j >>> 32)))) * 31, 31);
        C5389e c5389e = this.license;
        return mopub + (c5389e == null ? 0 : c5389e.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.ad);
        sb.append(", timestamp=");
        sb.append(this.vip);
        sb.append(", type=");
        int i = this.metrica;
        sb.append(i != 1 ? i != 2 ? "null" : "VIEW_DISAPPEAR" : "VIEW_APPEAR");
        sb.append(", structureCompat=");
        sb.append(this.license);
        sb.append(')');
        return sb.toString();
    }
}

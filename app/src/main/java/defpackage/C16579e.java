package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16579e {
    public final C6571e ad;
    public final int appmetrica;
    public final long billing;
    public final boolean license;
    public final long metrica;
    public final long purchase;
    public final long vip;

    public C16579e(C6571e c6571e, long j, long j2, boolean z, int i) {
        this.ad = c6571e;
        this.vip = j;
        this.metrica = j2;
        this.license = z;
        this.appmetrica = i;
        this.purchase = j + j2;
        this.billing = ((Number) c6571e.f13543e).longValue() - ((Number) c6571e.f13544e).longValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16579e)) {
            return false;
        }
        C16579e c16579e = (C16579e) obj;
        return AbstractC7890e.billing(this.ad, c16579e.ad) && this.vip == c16579e.vip && this.metrica == c16579e.metrica && this.license == c16579e.license && this.appmetrica == c16579e.appmetrica;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.metrica;
        return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.license ? 1231 : 1237)) * 31) + this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageCardModel(selectedStorage=");
        sb.append((Object) ("StorageSize(src=" + this.ad + ')'));
        sb.append(", takenAppCache=");
        sb.append(this.vip);
        sb.append(", takenTrackCache=");
        sb.append(this.metrica);
        sb.append(", hasSeveralProviders=");
        sb.append(this.license);
        sb.append(", oppositeProviderName=");
        return AbstractC1786e.pro(sb, this.appmetrica, ')');
    }
}

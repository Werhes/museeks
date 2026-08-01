package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3876e extends AbstractC1644e {
    public final Double ad;
    public final long appmetrica;
    public final int license;
    public final boolean metrica;
    public final long purchase;
    public final int vip;

    public C3876e(Double d, int i, boolean z, int i2, long j, long j2) {
        this.ad = d;
        this.vip = i;
        this.metrica = z;
        this.license = i2;
        this.appmetrica = j;
        this.purchase = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1644e) {
            AbstractC1644e abstractC1644e = (AbstractC1644e) obj;
            Double d = this.ad;
            if (d != null ? d.equals(((C3876e) abstractC1644e).ad) : ((C3876e) abstractC1644e).ad == null) {
                C3876e c3876e = (C3876e) abstractC1644e;
                if (this.vip == c3876e.vip && this.metrica == c3876e.metrica && this.license == c3876e.license && this.appmetrica == c3876e.appmetrica && this.purchase == c3876e.purchase) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.ad;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ (this.metrica ? 1231 : 1237)) * 1000003) ^ this.license) * 1000003;
        long j = this.appmetrica;
        long j2 = this.purchase;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.ad);
        sb.append(", batteryVelocity=");
        sb.append(this.vip);
        sb.append(", proximityOn=");
        sb.append(this.metrica);
        sb.append(", orientation=");
        sb.append(this.license);
        sb.append(", ramUsed=");
        sb.append(this.appmetrica);
        sb.append(", diskUsed=");
        return AbstractC5087e.m1750native(this.purchase, "}", sb);
    }
}

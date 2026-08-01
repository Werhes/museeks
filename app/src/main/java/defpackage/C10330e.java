package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10330e extends AbstractC5863e {
    public final String ad;
    public final long metrica;
    public final String vip;

    public C10330e(long j, String str, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5863e) {
            C10330e c10330e = (C10330e) ((AbstractC5863e) obj);
            if (this.ad.equals(c10330e.ad) && this.vip.equals(c10330e.vip) && this.metrica == c10330e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003;
        long j = this.metrica;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.ad);
        sb.append(", code=");
        sb.append(this.vip);
        sb.append(", address=");
        return AbstractC5087e.m1750native(this.metrica, "}", sb);
    }
}

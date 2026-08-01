package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٛۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181e {
    public final long ad;
    public final boolean metrica;
    public final long vip;

    public C1181e(long j, long j2, boolean z) {
        this.ad = j;
        this.vip = j2;
        this.metrica = z;
    }

    public final C1181e ad(C1181e c1181e) {
        return new C1181e(C2152e.startapp(this.ad, c1181e.ad), Math.max(this.vip, c1181e.vip), this.metrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1181e)) {
            return false;
        }
        C1181e c1181e = (C1181e) obj;
        return C2152e.vip(this.ad, c1181e.ad) && this.vip == c1181e.vip && this.metrica == c1181e.metrica;
    }

    public final int hashCode() {
        int billing = C2152e.billing(this.ad) * 31;
        long j = this.vip;
        return ((billing + ((int) (j ^ (j >>> 32)))) * 31) + (this.metrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) C2152e.mopub(this.ad));
        sb.append(", timeMillis=");
        sb.append(this.vip);
        sb.append(", shouldApplyImmediately=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}

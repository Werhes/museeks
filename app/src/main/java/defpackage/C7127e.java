package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7127e {
    public final InterfaceC17838e ad;
    public final long metrica;
    public final long vip;

    public C7127e(InterfaceC17838e interfaceC17838e, long j, long j2) {
        this.ad = interfaceC17838e;
        this.vip = j;
        this.metrica = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7127e)) {
            return false;
        }
        C7127e c7127e = (C7127e) obj;
        return AbstractC7890e.billing(this.ad, c7127e.ad) && C2152e.vip(this.vip, c7127e.vip) && Float.compare(1.0f, 1.0f) == 0 && C2152e.vip(this.metrica, c7127e.metrica) && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(0.0f) + ((C2152e.billing(this.metrica) + AbstractC1414e.license((C2152e.billing(this.vip) + (this.ad.hashCode() * 31)) * 31, 1.0f, 31)) * 31)) * 31) + 1237;
    }

    public final String toString() {
        String mopub = C2152e.mopub(this.vip);
        String mopub2 = C2152e.mopub(this.metrica);
        StringBuilder sb = new StringBuilder("LinearGradient(easing=");
        sb.append(this.ad);
        sb.append(", start=");
        sb.append(mopub);
        sb.append(", startIntensity=1.0, end=");
        return AbstractC1786e.signatures(sb, mopub2, ", endIntensity=0.0, preferPerformance=false)");
    }
}

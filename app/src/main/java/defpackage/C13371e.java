package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13371e {
    public static final C13371e metrica = new C13371e(C18525e.mopub, 0);
    public final C18525e ad;
    public final int vip;

    public C13371e(C18525e c18525e, int i) {
        if (c18525e == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.ad = c18525e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13371e)) {
            return false;
        }
        C13371e c13371e = (C13371e) obj;
        return this.ad.equals(c13371e.ad) && this.vip == c13371e.vip;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.ad);
        sb.append(", fallbackRule=");
        return AbstractC17861e.smaato(this.vip, "}", sb);
    }
}

package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9377e {
    public final AbstractC13386e ad;
    public final int metrica;
    public final C0136e vip;

    public C9377e(AbstractC13386e abstractC13386e, int i) {
        abstractC13386e = (i & 1) != 0 ? new AbstractC13386e(-1.0f) : abstractC13386e;
        C0136e c0136e = new C0136e(3);
        int i2 = (i & 8) != 0 ? 0 : 200;
        this.ad = abstractC13386e;
        this.vip = c0136e;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9377e)) {
            return false;
        }
        C9377e c9377e = (C9377e) obj;
        return AbstractC7890e.billing(this.ad, c9377e.ad) && this.vip.equals(c9377e.vip) && this.metrica == c9377e.metrica;
    }

    public final int hashCode() {
        return ((((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + 1231) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadImageConfig(rounding=");
        sb.append(this.ad);
        sb.append(", blur=");
        sb.append(this.vip);
        sb.append(", crossfade=true, size=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}

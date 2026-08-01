package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10163e {
    public static final C10163e appmetrica = new C10163e(0, 0, 0, 0);
    public final int ad;
    public final int license;
    public final int metrica;
    public final int vip;

    public C10163e(int i, int i2, int i3, int i4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
    }

    public final long ad() {
        return (((vip() / 2) + this.vip) & 4294967295L) | (((license() / 2) + this.ad) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10163e)) {
            return false;
        }
        C10163e c10163e = (C10163e) obj;
        return this.ad == c10163e.ad && this.vip == c10163e.vip && this.metrica == c10163e.metrica && this.license == c10163e.license;
    }

    public final int hashCode() {
        return (((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31) + this.license;
    }

    public final int license() {
        return this.metrica - this.ad;
    }

    public final long metrica() {
        return (this.ad << 32) | (this.vip & 4294967295L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.ad);
        sb.append(", ");
        sb.append(this.vip);
        sb.append(", ");
        sb.append(this.metrica);
        sb.append(", ");
        return AbstractC1786e.pro(sb, this.license, ')');
    }

    public final int vip() {
        return this.license - this.vip;
    }
}

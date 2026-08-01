package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10815e implements InterfaceC6065e {
    public final C14544e ad;
    public final int vip;

    public C10815e(C14544e c14544e, int i) {
        this.ad = c14544e;
        this.vip = i;
    }

    @Override // defpackage.InterfaceC6065e
    public final int ad(C10163e c10163e, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.vip;
        if (i < i2 - (i3 * 2)) {
            return AbstractC3062e.metrica(this.ad.ad(i, i2), i3, (i2 - i3) - i);
        }
        return AbstractC8703e.advert(1, 0.0f, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10815e)) {
            return false;
        }
        C10815e c10815e = (C10815e) obj;
        return this.ad.equals(c10815e.ad) && this.vip == c10815e.vip;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.ad.ad) * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.ad);
        sb.append(", margin=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}

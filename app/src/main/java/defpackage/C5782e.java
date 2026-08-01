package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5782e {
    public final float ad;
    public final List vip;

    static {
        new C5782e(3, 0.0f);
    }

    public C5782e(float f, List list) {
        this.ad = f;
        this.vip = list;
    }

    public C5782e(int i, float f) {
        this((i & 1) != 0 ? 0 : f, C13664e.f27089e);
    }

    public final C5782e ad(C5782e c5782e) {
        return new C5782e(this.ad + c5782e.ad, AbstractC13480e.m3584final(this.vip, c5782e.vip));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5782e)) {
            return false;
        }
        C5782e c5782e = (C5782e) obj;
        return C15765e.vip(this.ad, c5782e.ad) && AbstractC7890e.billing(this.vip, c5782e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingDimension(dp=");
        AbstractC10257e.admob(this.ad, sb, ", resourceIds=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}

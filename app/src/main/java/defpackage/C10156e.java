package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10156e implements InterfaceC8079e {
    public final float ad;
    public final float vip;

    public C10156e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    @Override // defpackage.InterfaceC8079e
    public final long ad(long j, long j2, EnumC7792e enumC7792e) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        EnumC7792e enumC7792e2 = EnumC7792e.f15794e;
        float f3 = this.ad;
        if (enumC7792e != enumC7792e2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 + this.vip) * f2;
        return (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10156e)) {
            return false;
        }
        C10156e c10156e = (C10156e) obj;
        return Float.compare(this.ad, c10156e.ad) == 0 && Float.compare(this.vip, c10156e.vip) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.ad);
        sb.append(", verticalBias=");
        return AbstractC17861e.remoteconfig(sb, this.vip, ')');
    }
}

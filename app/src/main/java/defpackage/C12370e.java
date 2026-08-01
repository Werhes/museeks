package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12370e {
    public final int ad;
    public final float metrica;
    public final int vip;

    public C12370e(int i, float f, int i2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = f;
    }

    public static C12370e ad(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new C12370e(i2, ((i & 511) * ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? -1 : 1)) / 10.0f, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12370e)) {
            return false;
        }
        C12370e c12370e = (C12370e) obj;
        return this.ad == c12370e.ad && this.vip == c12370e.vip && Float.compare(this.metrica, c12370e.metrica) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.metrica) + (((this.ad * 31) + this.vip) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.ad);
        sb.append(", originator=");
        sb.append(this.vip);
        sb.append(", gain=");
        return AbstractC17861e.remoteconfig(sb, this.metrica, '}');
    }
}

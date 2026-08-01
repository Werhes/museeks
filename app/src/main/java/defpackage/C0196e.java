package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196e {
    public static final C0196e license = new C0196e(0.0f, new C3721e(0.0f, 0.0f), 0);
    public final float ad;
    public final int metrica;
    public final C3721e vip;

    public C0196e(float f, C3721e c3721e, int i) {
        this.ad = f;
        this.vip = c3721e;
        this.metrica = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final C3721e ad() {
        return this.vip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0196e)) {
            return false;
        }
        C0196e c0196e = (C0196e) obj;
        return this.ad == c0196e.ad && AbstractC7890e.billing(this.vip, c0196e.vip) && this.metrica == c0196e.metrica;
    }

    public final int hashCode() {
        return ((this.vip.hashCode() + (Float.floatToIntBits(this.ad) * 31)) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.ad);
        sb.append(", range=");
        sb.append(this.vip);
        sb.append(", steps=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}

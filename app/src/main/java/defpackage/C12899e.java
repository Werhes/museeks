package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12899e {
    public final int ad;
    public final int vip;

    public C12899e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12899e)) {
            return false;
        }
        C12899e c12899e = (C12899e) obj;
        return this.ad == c12899e.ad && this.vip == c12899e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.ad);
        sb.append(", encodeRate=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}

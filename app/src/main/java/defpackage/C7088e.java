package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7088e {
    public static final C7088e appmetrica = new C7088e(0, 0, 0, 0);
    public final int ad;
    public final int license;
    public final int metrica;
    public final int vip;

    public C7088e(int i, int i2, int i3, int i4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
    }

    public static C7088e ad(C7088e c7088e, C7088e c7088e2) {
        return vip(Math.max(c7088e.ad, c7088e2.ad), Math.max(c7088e.vip, c7088e2.vip), Math.max(c7088e.metrica, c7088e2.metrica), Math.max(c7088e.license, c7088e2.license));
    }

    public static C7088e metrica(Insets insets) {
        return vip(C5275e.vip(insets), C5275e.mopub(insets), C5275e.advert(insets), C5275e.amazon(insets));
    }

    public static C7088e vip(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? appmetrica : new C7088e(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7088e.class != obj.getClass()) {
            return false;
        }
        C7088e c7088e = (C7088e) obj;
        return this.license == c7088e.license && this.ad == c7088e.ad && this.metrica == c7088e.metrica && this.vip == c7088e.vip;
    }

    public final int hashCode() {
        return (((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31) + this.license;
    }

    public final Insets license() {
        return AbstractC14204e.m3770class(this.ad, this.vip, this.metrica, this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.ad);
        sb.append(", top=");
        sb.append(this.vip);
        sb.append(", right=");
        sb.append(this.metrica);
        sb.append(", bottom=");
        return AbstractC1786e.pro(sb, this.license, '}');
    }
}

package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15073e {
    public final double ad;
    public final C13797e metrica;
    public final double vip;

    public C15073e(double d, double d2, C13797e c13797e) {
        this.ad = d;
        this.vip = d2;
        this.metrica = c13797e;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15073e)) {
            return false;
        }
        C15073e c15073e = (C15073e) obj;
        return Double.compare(this.ad, c15073e.ad) == 0 && Double.compare(this.vip, c15073e.vip) == 0 && AbstractC7890e.billing(this.metrica, c15073e.metrica);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.ad);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.vip);
        return ((i + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31) + this.metrica.ad;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.ad + ", chroma=" + this.vip + ", keyColor=" + this.metrica + ")";
    }
}

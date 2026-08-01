package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6900e {
    public final String ad;
    public final boolean appmetrica;
    public final C5564e billing;
    public final String license;
    public final C4903e metrica;
    public final C4438e purchase;
    public final C14943e vip;

    public C6900e(String str, C14943e c14943e, C4903e c4903e, String str2, boolean z, C4438e c4438e, C5564e c5564e) {
        this.ad = str;
        this.vip = c14943e;
        this.metrica = c4903e;
        this.license = str2;
        this.appmetrica = z;
        this.purchase = c4438e;
        this.billing = c5564e;
    }

    public final boolean ad() {
        EnumC10061e enumC10061e;
        C4903e c4903e = this.metrica;
        return (c4903e == null || (enumC10061e = c4903e.ad) == null || enumC10061e == EnumC10061e.NONE) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6900e.class != obj.getClass()) {
            return false;
        }
        C6900e c6900e = (C6900e) obj;
        return this.appmetrica == c6900e.appmetrica && Objects.equals(this.ad, c6900e.ad) && Objects.equals(this.vip, c6900e.vip) && Objects.equals(this.metrica, c6900e.metrica) && Objects.equals(this.license, c6900e.license) && Objects.equals(this.purchase, c6900e.purchase) && Objects.equals(this.billing, c6900e.billing);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip, this.metrica, this.license, Boolean.valueOf(this.appmetrica), this.purchase, this.billing);
    }

    public final String toString() {
        return "TrackData{mUri='" + this.ad + "', mTrackInfo=" + this.vip + ", mEncryptionData=" + this.metrica + ", mProgramDateTime='" + this.license + "', mHasDiscontinuity=" + this.appmetrica + ", mMapInfo=" + this.purchase + ", mByteRange=" + this.billing + '}';
    }
}

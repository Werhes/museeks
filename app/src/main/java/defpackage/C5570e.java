package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5570e {
    public final int ad;
    public final int vip;

    public C5570e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5570e)) {
            return false;
        }
        C5570e c5570e = (C5570e) obj;
        return this.ad == c5570e.ad && this.vip == c5570e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        return AbstractC8647e.inmobi(this.ad, this.vip, "Range(startIndex=", ", length=", ")");
    }
}

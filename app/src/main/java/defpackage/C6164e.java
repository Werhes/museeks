package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6164e implements InterfaceC6448e {
    public final InterfaceC4082e ad;
    public final int metrica;
    public final boolean vip;

    public C6164e(InterfaceC4082e interfaceC4082e, boolean z, int i) {
        this.ad = interfaceC4082e;
        this.vip = z;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6164e)) {
            return false;
        }
        C6164e c6164e = (C6164e) obj;
        return this.ad.equals(c6164e.ad) && this.vip == c6164e.vip && this.metrica == c6164e.metrica;
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(this.metrica) + (((this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.ad + ", isSampled=" + this.vip + ", dataSource=" + AbstractC13501e.premium(this.metrica) + ")";
    }
}

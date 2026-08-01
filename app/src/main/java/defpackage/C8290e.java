package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۢٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8290e {
    public final String ad;
    public final long metrica;
    public final String vip;

    public C8290e(long j, String str, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8290e)) {
            return false;
        }
        C8290e c8290e = (C8290e) obj;
        return AbstractC7890e.billing(this.ad, c8290e.ad) && AbstractC7890e.billing(this.vip, c8290e.vip) && C3618e.metrica(this.metrica, c8290e.metrica);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        int i = C3618e.mopub;
        return C10994e.ad(this.metrica) + advert;
    }

    public final String toString() {
        return "PlaylistMetadata(artworkUrl=" + this.ad + ", title=" + this.vip + ", color=" + ((Object) C3618e.startapp(this.metrica)) + ')';
    }
}

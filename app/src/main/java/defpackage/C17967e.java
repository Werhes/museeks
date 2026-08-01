package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17967e {
    public final String ad;
    public final C13410e license;
    public final int metrica;
    public final Object vip;

    public C17967e(String str, Object obj, int i, C13410e c13410e) {
        this.ad = str;
        this.vip = obj;
        this.metrica = i;
        this.license = c13410e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17967e)) {
            return false;
        }
        C17967e c17967e = (C17967e) obj;
        return AbstractC7890e.billing(this.ad, c17967e.ad) && AbstractC7890e.billing(this.vip, c17967e.vip) && this.metrica == c17967e.metrica && AbstractC7890e.billing(this.license, c17967e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + this.metrica) * 961);
    }

    public final String toString() {
        return "CacheKey(cameraId=" + this.ad + ", cameraConfig=" + this.vip + ", videoRecordingType=" + this.metrica + ", videoCapabilitiesSource=0, videoEncoderInfoFinder=" + this.license + ')';
    }
}

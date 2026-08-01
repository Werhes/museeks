package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8894e {
    public C1362e ad = null;
    public C11648e vip = null;
    public C14434e metrica = null;
    public C17985e license = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8894e)) {
            return false;
        }
        C8894e c8894e = (C8894e) obj;
        return AbstractC7890e.billing(this.ad, c8894e.ad) && AbstractC7890e.billing(this.vip, c8894e.vip) && AbstractC7890e.billing(this.metrica, c8894e.metrica) && AbstractC7890e.billing(this.license, c8894e.license);
    }

    public final int hashCode() {
        C1362e c1362e = this.ad;
        int hashCode = (c1362e == null ? 0 : c1362e.hashCode()) * 31;
        C11648e c11648e = this.vip;
        int hashCode2 = (hashCode + (c11648e == null ? 0 : c11648e.hashCode())) * 31;
        C14434e c14434e = this.metrica;
        int hashCode3 = (hashCode2 + (c14434e == null ? 0 : c14434e.hashCode())) * 31;
        C17985e c17985e = this.license;
        return hashCode3 + (c17985e != null ? c17985e.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.ad + ", canvas=" + this.vip + ", canvasDrawScope=" + this.metrica + ", borderPath=" + this.license + ')';
    }
}

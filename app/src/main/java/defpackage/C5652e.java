package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5652e {
    public static final C5652e metrica = new C5652e(AbstractC13362e.startapp(0), AbstractC13362e.startapp(0));
    public final long ad;
    public final long vip;

    public C5652e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5652e)) {
            return false;
        }
        C5652e c5652e = (C5652e) obj;
        return C12973e.ad(this.ad, c5652e.ad) && C12973e.ad(this.vip, c5652e.vip);
    }

    public final int hashCode() {
        return C12973e.license(this.vip) + (C12973e.license(this.ad) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C12973e.appmetrica(this.ad)) + ", restLine=" + ((Object) C12973e.appmetrica(this.vip)) + ')';
    }
}

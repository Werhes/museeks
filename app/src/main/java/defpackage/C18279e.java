package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18279e {
    public final C11709e ad;
    public final C11709e metrica;
    public final C11709e vip;

    public C18279e(C11709e c11709e, C11709e c11709e2, C11709e c11709e3) {
        this.ad = c11709e;
        this.vip = c11709e2;
        this.metrica = c11709e3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18279e)) {
            return false;
        }
        C18279e c18279e = (C18279e) obj;
        return AbstractC7890e.billing(this.ad, c18279e.ad) && AbstractC7890e.billing(this.vip, c18279e.vip) && AbstractC7890e.billing(this.metrica, c18279e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.ad + ", kotlinReadOnly=" + this.vip + ", kotlinMutable=" + this.metrica + ')';
    }
}

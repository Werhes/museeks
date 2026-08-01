package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11709e {
    public final C12816e ad;
    public final boolean metrica;
    public final C12816e vip;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11709e(C12816e c12816e, C0520e c0520e) {
        this(c12816e, AbstractC18453e.billing(c0520e), false);
        C12816e c12816e2 = C12816e.metrica;
    }

    public C11709e(C12816e c12816e, C12816e c12816e2, boolean z) {
        this.ad = c12816e;
        this.vip = c12816e2;
        this.metrica = z;
        c12816e2.ad.metrica();
    }

    public static final String metrica(C12816e c12816e) {
        String str = c12816e.ad.ad;
        return AbstractC5304e.isPro(str, '/') ? AbstractC17861e.advert('`', "`", str) : str;
    }

    public final C12816e ad() {
        C12816e c12816e = this.ad;
        boolean metrica = c12816e.ad.metrica();
        C12816e c12816e2 = this.vip;
        if (metrica) {
            return c12816e2;
        }
        return new C12816e(c12816e.ad.ad + '.' + c12816e2.ad.ad);
    }

    public final C11709e appmetrica() {
        C12816e vip = this.vip.vip();
        if (vip.ad.metrica()) {
            return null;
        }
        return new C11709e(this.ad, vip, this.metrica);
    }

    public final boolean billing() {
        return !this.vip.vip().ad.metrica();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11709e)) {
            return false;
        }
        C11709e c11709e = (C11709e) obj;
        return AbstractC7890e.billing(this.ad, c11709e.ad) && AbstractC7890e.billing(this.vip, c11709e.vip) && this.metrica == c11709e.metrica;
    }

    public final int hashCode() {
        return ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + (this.metrica ? 1231 : 1237);
    }

    public final C11709e license(C0520e c0520e) {
        return new C11709e(this.ad, this.vip.ad(c0520e), this.metrica);
    }

    public final C0520e purchase() {
        return this.vip.ad.billing();
    }

    public final String toString() {
        if (!this.ad.ad.metrica()) {
            return vip();
        }
        return "/" + vip();
    }

    public final String vip() {
        C12816e c12816e = this.ad;
        boolean metrica = c12816e.ad.metrica();
        C12816e c12816e2 = this.vip;
        if (metrica) {
            return metrica(c12816e2);
        }
        return c12816e.ad.ad.replace('.', '/') + "/" + metrica(c12816e2);
    }
}

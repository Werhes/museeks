package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611e extends AbstractC9606e {
    public final String ad;
    public final C18070e metrica;
    public final C2233e vip;

    public C1611e(String str, C2233e c2233e, C18070e c18070e) {
        this.ad = str;
        this.vip = c2233e;
        this.metrica = c18070e;
    }

    @Override // defpackage.AbstractC9606e
    public final C18070e ad() {
        return this.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1611e)) {
            return false;
        }
        C1611e c1611e = (C1611e) obj;
        return AbstractC7890e.billing(this.ad, c1611e.ad) && AbstractC7890e.billing(this.vip, c1611e.vip) && AbstractC7890e.billing(this.metrica, c1611e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C2233e c2233e = this.vip;
        int hashCode2 = (hashCode + (c2233e != null ? c2233e.hashCode() : 0)) * 31;
        C18070e c18070e = this.metrica;
        return hashCode2 + (c18070e != null ? c18070e.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("LinkAnnotation.Url(url="), this.ad, ')');
    }

    @Override // defpackage.AbstractC9606e
    public final C2233e vip() {
        return this.vip;
    }
}

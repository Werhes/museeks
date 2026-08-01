package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13706e {
    public final C10566e ad;
    public C10566e vip;
    public boolean metrica = false;
    public C2005e license = null;

    public C13706e(C10566e c10566e, C10566e c10566e2) {
        this.ad = c10566e;
        this.vip = c10566e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13706e)) {
            return false;
        }
        C13706e c13706e = (C13706e) obj;
        return AbstractC7890e.billing(this.ad, c13706e.ad) && AbstractC7890e.billing(this.vip, c13706e.vip) && this.metrica == c13706e.metrica && AbstractC7890e.billing(this.license, c13706e.license);
    }

    public final int hashCode() {
        int hashCode = (((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + (this.metrica ? 1231 : 1237)) * 31;
        C2005e c2005e = this.license;
        return hashCode + (c2005e == null ? 0 : c2005e.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.ad) + ", substitution=" + ((Object) this.vip) + ", isShowingSubstitution=" + this.metrica + ", layoutCache=" + this.license + ')';
    }
}
